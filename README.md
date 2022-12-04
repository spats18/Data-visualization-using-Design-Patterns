# Data-visualization-using-Design-Patterns
This is GUI-based application that adds a new number to the plot and computes the mean in real time with each click. The plot then depicts a graph that includes the mean of each integer and all other numbers. Three graphs are presented: the first has simply lines; the second has squares over the points that add up to the mean; and the third includes histograms for the same points.
We incorporated the Observer, Decorator, and Singleton Design pattern to monitor button clicks, decorate plots and maintain a single mean value for an instance of the application.
## Design Patterns:
We have implemented clean coding and the Don’t Repeat Yourself (DRY) and Keep It Simple (KIS) principles in our code. Moreover, we have taken care to include all the SOLID principles to ensure our code’s readability and efficiency. 

### Observer:
The PlotPanel acts as an Observer observing the RandomNumbers (Observable) class. Whenever the RandomNumbers is generating a new number, the Plotpanel will be notified by the Observer. The PlotPanel will then call the Observable (RandomNumbers) to get the new data. Then later perform the required operation of plotting the numbers and their mean on the frame.

### Singleton:
The Evaluator class is acting as a singleton class. It will calculate the mean and store the same. No class in the application is able to make an instance for the Evaluator class. This was ensured by making its constructor private. The mean will be changed whenever a new random number is generated. The mean is being changed for the same instance securing a static mean for the whole application.

### Decorator:
The PlotDecorator is acting as a decorator for PlotDots to plot squares and bars over the dots. The PlotCommon is the abstract component that is inherited by the concrete component (PlotDot) as well as the abstract decorator (PlotDecorator). Moreover, the concrete decorators i.e. PlotBar and PlotSquare extend the PlotDecorator and are used to decorate the PlotDot with squares and bars. The decorator (PlotDecorator) is aggregating the common component (PlotCommon).


### Technologies used: Swing, Java
### Output:
![image] https://github.com/spats18/Data-visualization-using-Design-Patterns#:~:text=26%20days%20ago-,UML.jpg,-Add%20files%20via
                        
