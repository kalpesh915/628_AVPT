import numpy as np
import pandas as pd
import  matplotlib.pyplot as plot

df = pd.read_csv("data1.csv")
#print(df)

df1 = df[["roll", "sub1", "sub2", "sub3", "sub4", "sub5"][:]]

#print(df1)
#df1.plot()
df1.plot(kind='scatter', x='sub1', y='roll')
plot.show()
