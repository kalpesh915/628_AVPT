import numpy as np

data1 = np.array([11, 22, 33, 44, 55, 66, 77, 88, 99, 111])
ans = np.hsplit(data1, 5)

print(ans)
