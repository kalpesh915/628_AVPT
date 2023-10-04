import pandas as pd
import numpy as np

data1 = {
    "roll" : [1, 2, 3, 4, 5],
    "fname" : ["Harmeet", "Tirth", "Deep", "Meet", "Harsh"],
    "lname" : ["Purohit", "Chauhan", "Botadara", "Changarani", "Dhamecha"],
    "city" : ["Rajkot", "Surat", "Baroda", "Bhuj", "Ahamdabad"]}

ans = pd.DataFrame(data1)
ans1 = pd.DataFrame(ans)
print(ans1)
