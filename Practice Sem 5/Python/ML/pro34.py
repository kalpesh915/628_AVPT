import numpy as np

data1 = np.array([[1, 2],[3, np.nan]])
ans = np.cumprod(data1)
print(ans)
ans = np.cumsum(data1)
print(ans)
