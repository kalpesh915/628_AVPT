import numpy as np
import pandas as pd

data = {'A': [11, 22, 33, 44, 22, 11], 'B': [44, 22, 66, 66, 11, 10]}

dataFrame1 = pd.DataFrame(data)
print(dataFrame1)

#dataFrame2 = dataFrame1.drop_duplicates(subset=['A'])
#dataFrame2 = dataFrame1.drop_duplicates(subset=['A'], keep='last')
dataFrame2 = dataFrame1.drop_duplicates(subset=['B'], keep='last')

print(dataFrame2)