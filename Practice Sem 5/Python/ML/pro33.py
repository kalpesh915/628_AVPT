import numpy as np

data1 = np.array([[1, 2],[np.nan, 3]])
ans = np.cumprod(data1)
print(ans)
ans = np.cumsum(data1)
print(ans)
