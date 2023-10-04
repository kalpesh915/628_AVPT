import numpy as np

data1 = np.array([[1, 2],[3, np.nan]])
ans = np.nanprod(data1)
print(ans)
