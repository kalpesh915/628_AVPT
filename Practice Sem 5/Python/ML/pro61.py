import matplotlib as mp
import matplotlib.pyplot as plt
import numpy as np
import matplotlib.pyplot as patch
import matplotlib.lines as lines

students = ["Meet", "Harmeet", "Harsh", "Tirth", "Deep"]
SPI = [9.58, 9.62, 7.5, 8.5, 8.95]

plt.bar(students, SPI)
plt.xlabel("Students")
plt.ylabel("SPI")
plt.title("AVPTI Rajkot")
plt.show()