import pandas as pd
import numpy as np

#data = pd.read_csv("data.csv", sep=',', header=None)
data = pd.read_csv("data.csv", sep=',', index_col=None, skiprows=[0,1])
ans = pd.DataFrame(data)
print(ans)
