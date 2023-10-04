import numpy as np
import pandas as pd

data = np.array([[11, 22, 33], [44, None, 66]])

dataFrame1 = pd.DataFrame(data)
print(dataFrame1)

dataFrame2 = dataFrame1.fillna(dataFrame1.mean())
print(dataFrame2)