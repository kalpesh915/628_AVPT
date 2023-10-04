import numpy as np

data1 = np.array([12, 10, 40, 60])
ans = np.lcm.reduce(data1)
print(ans)
ans = np.gcd.reduce(data1)
print(ans)
