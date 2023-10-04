import pandas as pd
import matplotlib.pyplot as plot

data = {
        'year' : [2011,2012,2013,2014,2015,2016,2017,2018,2019,2020,2021,2022,2023],
        'sales' : [11, 13, 14, 10, 8, 18, 15, 11, 16, 15, 9, 11, 11],
        'expneses' : [10, 11, 4, 14, 18, 11, 10, 10, 12, 10, 10, 11, 15]
    }

dataFrame = pd.DataFrame(data)

#dataFrame.plot(x = "year", y='sales', kind='line')
#dataFrame.plot(x = "year", y='sales', kind='bar')
#dataFrame.plot(x = "year", y='sales', kind='scatter')
dataFrame.plot(x = "year", y='sales', kind='jhist')
plot.title("Sales over Years")
plot.xlabel("Years")
plot.ylabel("Sales")
plot.show()