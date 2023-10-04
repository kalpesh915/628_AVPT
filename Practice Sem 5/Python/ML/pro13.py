import numpy as np

data1 = np.array([11, 22, 33, 44])
data2 = np.array([55, 66, 77, 88])
ans = np.concatenate((data1, data2))

print(ans)
