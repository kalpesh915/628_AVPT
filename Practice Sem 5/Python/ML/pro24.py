import numpy as np

data1 = np.array([[11, 12], [12, 13]])
data2 = np.array([[3, 2], [4, 3]])

ans = np.divmod(data1, data2)
print(ans)
