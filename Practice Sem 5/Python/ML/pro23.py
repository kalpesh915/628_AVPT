import numpy as np

data1 = np.array([[1, 2], [2, 3]])
data2 = np.array([[3, 2], [4, 3]])

ans = np.add(data1, data2)
print(ans)
ans = np.remainder(data1, data2)
print(ans)
ans = np.divide(data1, data2)
print(ans)
ans = np.floor_divide(data1, data2)
print(ans)
