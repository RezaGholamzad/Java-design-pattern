Suppose there is an application where you have multiple algorithms and each of these
algorithms can perform a specific task. A client can dynamically pick any of these
algorithms to serve its current need.
The strategy pattern suggests that you implement these algorithms in separate
classes. When you encapsulate an algorithm in a separate class, you call it a strategy.
An object that uses the strategy object is often referred to as a context object. These
“algorithms” are also called behaviors in some applications.
*********************
Implementation:
We are going to create a Strategy interface defining an action and concrete strategy classes implementing
the Strategy interface. Context is a class which uses a Strategy.

StrategyPatternDemo, our demo class, will use Context and strategy objects to demonstrate change in Context
behaviour based on strategy it deploys or uses.
********************
examples:
Suppose that you have a list of integers and you want to sort them. You do this by using
various algorithms; for example, Bubble Sort, Merge Sort, Quick Sort, Insertion Sort, and
so forth. So, you can have a sorting algorithm with many different variations. Now you
can implement each of these variations (algorithms) in separate classes and pass the
objects of these classes in client code to sort your integer list.

in java:
You can consider the java.util.Comparator interface in this context. You can
implement this interface and provide multiple implementations of comparators
with different algorithms to do various comparisons using the compare() method.
This comparison result can be further used in various sorting techniques. The
Comparator interface plays the role of a strategy interface in this context.
**********************
Advantages:
A family of algorithms can be defined as a class hierarchy and can be used interchangeably 
to alter application behavior without changing its architecture.

By encapsulating the algorithm separately, new algorithms complying with the same interface can be easily introduced.

The application can switch strategies at run-time.

Strategy enables the clients to choose the required algorithm, without using a “switch” statement 
or a series of “if-else” statements.

Data structures used for implementing the algorithm are completely encapsulated in Strategy classes.
Therefore, the implementation of an algorithm can be changed without affecting the Context class.

Disadvantages:
The application must be aware of all the strategies to select the right one for the right situation.

Context and the Strategy classes normally communicate through the interface specified by the abstract
Strategy base class. Strategy base class must expose interface for all the required behaviours,
which some concrete Strategy classes might not implement.

In most cases, the application configures the Context with the required Strategy object.
Therefore, the application needs to create and maintain two objects in place of one.