import numpy as np
import pandas as pd
import  matplotlib.pyplot as plot

df = pd.read_csv("data.csv")
#print(df)

df1 = df[["name", "match", "runs", "50", "100"][:]]

#print(df1)
df1.plot()
plot.show()
