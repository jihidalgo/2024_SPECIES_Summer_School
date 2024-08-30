# modified from bostonhousing example, uses RMSE fitness

import sge
from sge.parameters import params
from sge.utilities.protected_math import _log_, _div_, _exp_, _inv_, _sqrt_, protdiv


class BMI_Problem:
    def __init__(self, run=0, has_test_set=True, invalid_fitness=9999999):
        self._train_set = []
        self._test_set = None
        self.__invalid_fitness = invalid_fitness
        self._x_labels = None
        self._target_label = None
        self.run = run
        self.has_test_set = has_test_set
        self.read_dataset('../train_bmi_marker.csv', '../test_bmi_marker.csv')

    def read_dataset(self, filename_train, filename_test=None, sep=';'):
        labels = None
        for filename, member in ((filename_train, '_train_set'), (filename_test, '_test_set')):
            if filename is not None:
                values = []
                with open(filename, encoding='utf-8') as f:
                    line: str
                    for line_number, line in enumerate(f):
                        parts = line.strip().split(sep)
                        if line_number == 0:
                            if labels is None:
                                labels = parts
                                self._x_labels = labels[1:]
                                self._target_label = labels[0]
                            elif labels != parts:
                                raise ValueError('labels in files mismatch')
                        else:
                            values.append(list(map(float, parts)))
                setattr(self, member, values)

    def get_error(self, individual, dataset):
        pred_error = 0
        for case in dataset:
            target = case[0]
            try:
                output = eval(individual, globals(), {"x": case[1:]})
                pred_error += (target - output) ** 2
            except (SyntaxError, ValueError, OverflowError, MemoryError, FloatingPointError):
                return self.__invalid_fitness
        return pred_error

    def evaluate(self, individual):
        error = 0.0
        test_error = 0.0
        if individual is None:
            return None

        error = self.get_error(individual, self._train_set)
        error = _sqrt_(error)  # RMSE

        if error is None:
            error = self.__invalid_fitness

        if self._test_set is not None:
            test_error = self.get_error(individual, self._test_set)
            test_error = _sqrt_(test_error)

        return error, {'generation': 0, "evals": 1, "test_error": test_error}


if __name__ == "__main__":
    sge.setup("parameters/standard.yml")
    problem = BMI_Problem(params['RUN'])
    sge.evolutionary_algorithm(evaluation_function=problem, parameters_file="parameters/standard.yml")
