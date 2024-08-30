import random
from sge.parameters import params
from sge.utilities.protected_math import _log_, _div_, _exp_, _inv_, _sqrt_, protdiv
from numpy import cos, sin

def drange(start, stop, step):
    # Function to make a Range - no idea the reason for not using Range.
    r = start
    while r < stop:
        yield r
        r += step

class BostonHousing():
    def __init__(self, run=0, has_test_set=True, invalid_fitness=9999999):
        self.__train_set = []
        self.__test_set = None
        self.__invalid_fitness = invalid_fitness
        self.run = run
        self.has_test_set = has_test_set
        self.read_dataset()
        self.calculate_rrse_denominators()# Not sure what it does inside

    def read_dataset(self):
        trn_ind = []
        tst_ind = []
        with open('resources/justOnes.csv', 'r') as dataset_file:
            names = dataset_file.readline()
            for line in dataset_file:
                trn_ind.append([float(value.strip(" ")) for value in line.split(";") if value != ""])

        with open('resources/justOnes.csv', 'r') as dataset_file:
            names = dataset_file.readline()
            for line in dataset_file:
                tst_ind.append([float(value.strip(" ")) for value in line.split(";") if value != ""])

        self.__train_set = trn_ind
        self.__test_set = tst_ind



    def calculate_rrse_denominators(self):

        self.__RRSE_train_denominator = 0
        self.__RRSE_test_denominator = 0
        train_outputs = [entry[-1] for entry in self.__train_set]
        train_output_mean = float(sum(train_outputs)) / len(train_outputs)
        self.__RRSE_train_denominator = sum([(i - train_output_mean)**2 for i in train_outputs])
        if self.__test_set:
            test_outputs = [entry[1] for entry in self.__test_set]
            test_output_mean = float(sum(test_outputs)) / len(test_outputs)
            self.__RRSE_test_denominator = sum([(i - test_output_mean)**2 for i in test_outputs])


    def get_error(self, individual, dataset):
        pred_error = 0
        for case in dataset:
            target = case[-1]
            #print(target)
            try:
                output = eval(individual, globals(), {"x": case[:-1]})
                pred_error += (target - output)**2
            except (SyntaxError, ValueError, OverflowError, MemoryError, FloatingPointError):
                return self.__invalid_fitness
        return pred_error


    def evaluate(self, individual):
        error = 0.0
        test_error = 0.0
        if individual is None:
            return None

        error = self.get_error(individual, self.__train_set)
        error = _sqrt_( error /self.__RRSE_train_denominator)

        if error is None:
            error = self.__invalid_fitness
            

        if self.__test_set is not None:
            test_error = 0
            test_error = self.get_error(individual, self.__test_set)
            test_error = _sqrt_( test_error / float(self.__RRSE_test_denominator))

        return error, {'generation': 0, "evals": 1, "test_error": test_error}


if __name__ == "__main__":
    import sge
    sge.setup("parameters/standard.yml")
    eval_func = BostonHousing(params['RUN'])
    sge.evolutionary_algorithm(evaluation_function=eval_func, parameters_file="parameters/standard.yml")
