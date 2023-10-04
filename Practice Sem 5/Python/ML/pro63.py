import matplotlib as mp
import matplotlib.pyplot as plt
import numpy as np

students = ["Harmeet", "Meet", "Harsh", "Tirth", "Deep"]
marks = [13, 12, 14, 15, 11]
colors = ["orange", "gray", "blue", "purple", "black"]
exp = [0.1, 0, 0.1, 0, 0]
plt.pie(marks, labels=students, colors=colors, explode=exp)
plt.title("Marks")
plt.show()
