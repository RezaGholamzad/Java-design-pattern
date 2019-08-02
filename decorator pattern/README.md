This pattern says that the class must be closed for modification but open for extension;
that is, a new functionality can be added without disturbing existing functionalities.
The concept is very useful when we want to add special functionalities to a specific
object instead of the whole class. In this pattern, we try to use the concept of object
composition instead of inheritance. So, when we master this technique, we can add new
responsibilities to an object without affecting the underlying classes.
******************
implementation:
We're going to create a Shape interface and concrete classes implementing the Shape interface.
We will then create an abstract decorator class ShapeDecorator implementing the Shape interface
and having Shape object as its instance variable.

RedShapeDecorator is concrete class implementing ShapeDecorator.

DecoratorPatternDemo, our demo class will use RedShapeDecorator to decorate Shape objects.
******************
example:
Suppose that in a GUI-based toolkit, we want to add some border properties. We can do
this with inheritance. But it cannot be treated as an ultimate solution because the user
cannot have absolute control over this creation from the beginning. So, the core choice is
static in this case.
Decorators comes into picture with a flexible approach. They promote the concept
of dynamic choices, for example, we can surround the component in another object. The
enclosing object is called a decorator. It must conform to the interface of the component
that it decorates. It forwards the requests to the component. It can perform additional
operations before or after the forwardings. An unlimited number of responsibilities can
be added with this concept.

in java:
You can notice the use of the decorator pattern in the I/o streams
implementations in both .net Framework and Java. For example, the java.
io.BufferedoutputStream class can decorate any java.io.outputStream object.
********************
Advantages:
The decorator pattern can be used to make it possible to extend (decorate) the functionality of a certain object at runtime.

The decorator pattern is an alternative to subclassing.
Subclassing adds behavior at compile time, and the change affects all instances of the original class;
decorating can provide new behavior at runtime for individual objects.

Decorator offers a pay-as-you-go approach to adding responsibilities.
Instead of trying to support all foreseeable features in a complex, customizable class,
you can define a simple class and add functionality incrementally with Decorator objects.

Disadvantages:
Decorators can complicate the process of instantiating the component because you not only have to instantiate
the component, but wrap it in a number of decorators.

It can be complicated to have decorators keep track of other decorators,
because to look back into multiple layers of the decorator chain starts to push the decorator pattern beyond its true intent.
