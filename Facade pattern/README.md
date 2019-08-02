Facades make a client’s life easier. Suppose that there is a complex system where
multiple objects need to perform a series of tasks, and you need to interact with the
system. In a situation like this, facade can provide you a simplified interface that takes
care of everything (the creation of those objects, providing the correct sequence of tasks,
etc.). As a result, instead of interacting with multiple objects in a complicated way, you
just interact with a single object.
It is one of those patterns that supports loose coupling. Here you emphasize the
abstraction and hide the complex details by exposing a simple interface. As a result, the
code becomes clearer and more attractive
******************
implementation:
We are going to create a Shape interface and concrete classes implementing the Shape interface.
A facade class ShapeMaker is defined as a next step.
ShapeMaker class uses the concrete classes to delegate user calls to these classes.
FacadePatternDemo, our demo class, will use ShapeMaker class to show the results.
******************
examples:
Think about a situation where you use a method from a library (in the context of a
programming language). You do not care how the method is implemented in the library.
You just call the method to experiment the easy usage of it.

in java:
You can use the concept of facade design pattern effectively to make
your JDBC application attractive. You can consider the java.net.URL class
as an example of a facade pattern implementation.Consider the shorthand
openStream() or getContent() methods in this class. The openStream() method
returns openConnection().getInputStream() and the getContent() method returns
openConnection.getContent().The getInputStream() and getContent() methods are
further defined in the URLConnection class.
*****************
advantage:
The facade pattern is appropriate when you have a complex system that you want to expose to clients
in a simplified way, or you want to make an external communication layer over an existing system which
is incompatible with the system. Facade deals with interfaces, not implementation.
Its purpose is to hide internal complexity behind a single interface that appears simple on the outside.
