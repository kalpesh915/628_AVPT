import matplotlib as mp
import matplotlib.pyplot as plt
import numpy as np

fig, ax = plt.subplots()
ax.plot([1, 2, 3, 4], [1, 4, 2, 3], color="red", linestyle="--", marker="o", label="Data")
plt.title("Sample Chart")
plt.xlabel("X - Axis")
plt.ylabel("Y - Axis")
plt.legend()
plt.grid()
plt.plot()
plt.show()