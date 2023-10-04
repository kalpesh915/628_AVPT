import pandas as pd
import numpy as np

data1 = {'A' : [15, 25, 65, 78, 45, 14, 25, 63, 14]}

df = pd.DataFrame(data1)
print("Mean", df['A'].mean(), "std", df['A'].std())
print(df)
