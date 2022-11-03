import matplotlib.pyplot as plt
x=[1,2,12,4,6,14,8,13]
plt.hist(x,bins=[1,2,3,4,5,6,7])
plt.title("Histogram")
plt.legend(["bar"])
plt.show()
