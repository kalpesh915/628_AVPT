import numpy as np

data1 = np.array([(11, 22, 33), (44, 55, 66), (77, 88, 99), (111, 112, 113)])
ans = np.vsplit(data1, 2)

print(ans)
