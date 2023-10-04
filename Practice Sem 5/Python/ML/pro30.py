import numpy as np

data1 = np.array([[1, 2],[3,4]])
ans = np.nanprod([1, np.nan])
print(ans)
