import numpy as np
data = np.array([11, 22, 33, 44, 55, 66, 77, 88, 99, 101])
print(data)

print("Reshaped in 2 x 5")
data1 = data.reshape(2, 5)
print(data1)

print("Reshaped in 5 x 2")
data1 = data.reshape(5, 2)
print(data1)

# Error :ValueError: cannot reshape array of size 10 into shape (3,5)
print("Reshaped in 3 x 5")
data1 = data.reshape(3, 5)
print(data1)
