import numpy as np

data = np.array([11, 22, 33, 44, 55, 66, 77, 88, 99, 111])

print(data[0])
print(data[0:5])
print(data[0:5:2])
print(data[2:])
print(data[:2])
print(data[::2])
print(data[-2])
print(data[-2:])
print(data[::-1])