import numpy as np

data1 = np.array([[1, 2, 3, 4], [8, 10, 18, 16]])

ans = np.ediff1d(data1)
print(ans)

