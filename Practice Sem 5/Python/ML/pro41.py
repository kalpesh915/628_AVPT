import pandas as pd
import numpy as np

data1 = [[11, 22, 33], [44, 55, 66]]

#ans = pd.DataFrame(data1)
ans = pd.DataFrame(data1, columns=["Data1", "Data2", "Data3"])

print(ans)
