import numpy as np

data1 = np.array([[1, 2], [2, 3]])
data2 = np.array([[3, 2], [4, 3]])

ans = data1 * data2
print(ans)
ans = data1 @ data2
print(ans)
ans = data1.dot(data2)
print(ans)

