import pandas as pd
import statsmodels.api as sm
from sklearn.model_selection import train_test_split
from sklearn.metrics import r2_score
import matplotlib.pyplot as plt

# Download the NHANES 2017-2018 datasets
demo_url = "https://wwwn.cdc.gov/Nchs/Nhanes/2017-2018/DEMO_J.XPT"
bmx_url = "https://wwwn.cdc.gov/Nchs/Nhanes/2017-2018/BMX_J.XPT"
dxa_url = "https://wwwn.cdc.gov/Nchs/Nhanes/2017-2018/DXX_J.XPT"

demo_data = pd.read_sas(demo_url)
bmx_data = pd.read_sas(bmx_url)
dxa_data = pd.read_sas(dxa_url)

# Merge the datasets
data = pd.merge(demo_data, bmx_data, on='SEQN')
data = pd.merge(data, dxa_data, on='SEQN')

# Rename columns to match the descriptions in the paper
data = data.rename(columns={
    'SEQN': 'SEQN',
    'RIAGENDR': 'RIAGENDR', # Gender
    'RIDAGEYR': 'RIDAGEYR', # Age
    'BMXWT': 'BMXWT', # Weight (kg)
    'BMXHT': 'BMXHT', # Height (cm)
    'BMXLEG': 'BMXLEG', # Upper Leg Length (cm)
    'BMXARML': 'BMXARML', # Upper Arm Length (cm)
    'BMXARMC': 'BMXARMC', # Arm Circumference (cm)
    'BMXWAIST': 'BMXWAIST', # Waist Circumference (cm)
    'BMXHIP': 'BMXHIP', # Hip Circumference (cm)
    'DXDTOPF': '#DXDTOPF' # Total Body Fat %
})
data2=data
# Filter the data based on the criteria in the paper
data = data[(data['RIDAGEYR'] >= 18) & (data['BMXWT'].notna()) & (data['BMXHT'].notna()) & 
            (data['#DXDTOPF'].notna()) & (data['BMXLEG'].notna()) & (data['BMXARML'].notna()) & 
            (data['BMXARMC'].notna()) & (data['BMXWAIST'].notna()) & (data['BMXHIP'].notna())]
featuresge = ['#DXDTOPF','BMXWT', 'BMXHT', 'BMXLEG', 'BMXARML', 'BMXARMC', 'BMXWAIST', 'BMXHIP', 'RIAGENDR', 'RIDAGEYR']

datage=data[featuresge]
print(datage.head(2))

# Select the features and target as described in the paper
features = ['BMXWT', 'BMXHT', 'BMXLEG', 'BMXARML', 'BMXARMC', 'BMXWAIST', 'BMXHIP', 'RIAGENDR', 'RIDAGEYR']
target = '#DXDTOPF'

# Split the data into training and testing sets
train, test = train_test_split(datage, test_size=0.2, random_state=1)
datage.to_csv('data_bmi_marker.csv', index=False ,sep=';')
print(data)
train.to_csv('train_bmi_marker.csv', index=False,sep=';')
test.to_csv('test_bmi_marker.csv', index=False,sep=';')

# Define a function to train and evaluate a model
def train_and_evaluate(train, test, features, target):
    X_train = sm.add_constant(train[features])
    y_train = train[target]
    X_test = sm.add_constant(test[features])
    y_test = test[target]
    
    model = sm.OLS(y_train, X_train).fit()
    train_predictions = model.predict(X_train)
    test_predictions = model.predict(X_test)
    
    train_r2 = r2_score(y_train, train_predictions)
    test_r2 = r2_score(y_test, test_predictions)
    
    # Print the model formula
    print(f"Model formula: {target} ~ {' + '.join(features)}")
    
    return model, train_r2, test_r2

# Baseline 1: Height and weight as separate features
features_baseline_1 = ['BMXWT', 'BMXHT']
model1, train_r2_1, test_r2_1 = train_and_evaluate(train, test, features_baseline_1, target)

# Baseline 2: BMI as the only feature
train['BMI'] = train['BMXWT'] / (train['BMXHT'] / 100) ** 2
test['BMI'] = test['BMXWT'] / (test['BMXHT'] / 100) ** 2
features_baseline_2 = ['BMI']
model2, train_r2_2, test_r2_2 = train_and_evaluate(train, test, features_baseline_2, target)

# Baseline 3: All body measurement features
features_baseline_3 = ['BMXWT', 'BMXHT', 'BMXLEG', 'BMXARML', 'BMXARMC', 'BMXWAIST', 'BMXHIP']
model3, train_r2_3, test_r2_3 = train_and_evaluate(train, test, features_baseline_3, target)

# Baseline 4: All body measurement features + gender and age
features_baseline_4 = ['BMXWT', 'BMXHT', 'BMXLEG', 'BMXARML', 'BMXARMC', 'BMXWAIST', 'BMXHIP', 'RIAGENDR', 'RIDAGEYR']
model4, train_r2_4, test_r2_4 = train_and_evaluate(train, test, features_baseline_4, target)

# Print the results
print(f"Baseline 1 - Train R²: {train_r2_1:.3f}, Test R²: {test_r2_1:.3f}")
print(f"Baseline 2 - Train R²: {train_r2_2:.3f}, Test R²: {test_r2_2:.3f}")
print(f"Baseline 3 - Train R²: {train_r2_3:.3f}, Test R²: {test_r2_3:.3f}")
print(f"Baseline 4 - Train R²: {train_r2_4:.3f}, Test R²: {test_r2_4:.3f}")

# Plot the results for Baseline 4 as an example
plt.figure(figsize=(10, 6))
plt.scatter(test[target], model4.predict(sm.add_constant(test[features_baseline_4])), alpha=0.5)
plt.xlabel("Actual Total Body Fat Percentage")
plt.ylabel("Predicted Total Body Fat Percentage")
plt.title("Baseline 4: Actual vs Predicted Total Body Fat Percentage")
plt.grid(True)
plt.savefig("baseline_4_comparison.png")  # Saves the plot as a PNG file


def print_model_formula(model, features, target):
    params = model.params
    formula = f"{target} = {params['const']:.3f}"
    for feature in features:
        formula += f" + ({params[feature]:.3f} * {feature})"
    print(formula)

# After training each model, call print_model_formula
print("Baseline 1 Model Formula:")
print_model_formula(model1, features_baseline_1, target)

print("\nBaseline 2 Model Formula:")
print_model_formula(model2, features_baseline_2, target)

print("\nBaseline 3 Model Formula:")
print_model_formula(model3, features_baseline_3, target)

print("\nBaseline 4 Model Formula:")
print_model_formula(model4, features_baseline_4, target)
