import pandas as pd
import numpy as np

data1 = {
    "roll" : [1, 2, 3, 4, 5],
    "fname" : ["Harmeet", "Tirth", "Deep", "Meet", "Harsh"],
    "lname" : ["Purohit", "Chauhan", None, "Changarani", "Dhamecha"],
    "city" : ["Rajkot", "Surat", "Baroda", "Bhuj", None]}

ans = pd.DataFrame(data1)
ans = ans.fillna("Not Available")
print(ans)
