import matplotlib as mp
import matplotlib.pyplot as plt
import numpy as np
import matplotlib.pyplot as patch
import matplotlib.lines as lines

data1 = [1, 2, 3, 4, 5]
data11 = [10, 15, 12, 17, 9]
data12 = [5, 8, 6, 13, 11]
data13 = [7, 10, 9, 13, 11]
data14 = [17, 20, 19, 13, 11]

plt.subplot(2, 2, 1)
plt.plot(data1, data11)

plt.subplot(2, 2, 2)
plt.plot(data1, data12)

plt.subplot(2, 2, 3)
plt.plot(data1, data13)

plt.subplot(2, 2, 4)
plt.plot(data1, data14)
plt.tight_layout()
plt.show()
