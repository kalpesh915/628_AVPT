import matplotlib as mp
import matplotlib.pyplot as plt
import numpy as np
import matplotlib.pyplot as patch
import matplotlib.lines as lines

fig, ax = plt.subplots()
plt.scatter([1, 2, 3, 4], [1, 4, 2, 3], color="red", linestyle="--", marker="o", label="Data")
#plt.plot([1, 2, 3, 4], [1, 4, 2, 3], color="red", linestyle="dotted", marker="o", label="Data")
plt.title("Sample Chart")
plt.xlabel("X - Axis")
plt.ylabel("Y - Axis")
#plt.annotate("Sample Chart", xy=(3, 3))
#plt.text(3, 3, "Text Anotation", color="purple")
#plt.annotate('View Here', xy=(2,4), xytext=(2,3), arrowprops=dict(facecolor='red', arrowstyle='->'));
#plt.annotate('', xy=(3,4), xytext=(2,3), arrowprops=dict(facecolor='red', arrowstyle='->'));
#circle = patch.Circle((2,4), 0.2, facecolor='red', alpha=0.1)
#plt.gca().add_patch(circle)
#rect = patch.Rectangle((1, 3), 5, 0.7, facecolor='blue', alpha=0.5)
#plt.gca().add_patch(rect)
line = lines.Line2D([1, 2], [4, 4], linewidth=4, color="red")
plt.gca().add_line(line)
plt.legend()
plt.grid()
plt.plot()
plt.show()