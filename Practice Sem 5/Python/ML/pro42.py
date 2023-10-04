import pandas as pd
import numpy as np

data1 = [
    [1, "harmeer", "Purohit", "Rajkot"],
    [2, "Tirth", "Chauhan", "Rajkot"],
    [3, "Deep", "Botadara", "Rajkot"],
    [4, "Meet", "Changrani", "Rajkot"],
    [5, "Harsh", "Dhamecha", "Rajkot"],
]

ans = pd.DataFrame(data1, columns=["Roll", "First Name", "Last Name", "City"])

print(ans)
