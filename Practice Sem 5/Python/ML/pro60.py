import matplotlib as mp
import matplotlib.pyplot as plt
import numpy as np
import matplotlib.pyplot as patch
import matplotlib.lines as lines

fig, ax = plt.subplots()
plt.plot([1, 2, 3, 4], [1, 4, 2, 3], color="red", linestyle="dotted", marker="o", label="Data")
plt.title("Sample Chart")
plt.xlabel("X - Axis")
plt.ylabel("Y - Axis")

plt.legend()
#plt.grid()
#plt.grid(axis='y')
plt.grid(axis='x')
plt.plot()
plt.show()