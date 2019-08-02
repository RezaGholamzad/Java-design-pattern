This pattern is also known as the handle/body pattern, in which you separate an
implementation from its abstraction and build separate inheritance structures for them.
Finally, you connect them through a bridge.
You must note that the abstraction and the implementation can be represented
either through an interface or an abstract class, but the abstraction contains a reference
to its implementer. Normally, a child of an abstraction is called a refined abstraction and
a child of an implementation is called a concrete implementation.
This bridge interface makes the functionality of concrete classes independent from
the interface implementer classes. You can alter different kinds of classes structurally
without affecting each other.

Abstraction : core of the bridge design pattern and defines the crux. Contains a reference to the implementer.
Refined Abstraction : Extends the abstraction takes the finer detail one level below. Hides the finer elements from implemetors.
Implementer : It defines the interface for implementation classes. This interface does not need to correspond directly
to the abstraction interface and can be very different. Abstraction imp provides an implementation in terms of
operations provided by Implementer interface.
Concrete Implementation : Implements the above implementer by providing concrete implementation.
*****************
implementation:
We have a DrawAPI interface which is acting as a bridge implementer and concrete classes RedCircle,
GreenCircle implementing the DrawAPI interface. Shape is an abstract class and will use object of DrawAPI.
BridgePatternDemo, our demo class will use Shape class to draw different colored circle.
*****************
examples:

In a software product development company, the development team and the marketing
team both play a crucial role. Marketing teams do market surveys and gather customers’
needs, which may vary depending on the nature of the customers. Development
teams implement those requirements in their products to fulfill the customers’ needs.
Any change (e.g., in the operational strategy) in one team should not have a direct
impact on the other team. Also, when new requirements come from the customer side,
it should not change the way that developers work in their organization. In a software
organization, the marketing team plays the role of the bridge between the clients and the
development team.

GUI frameworks can use the bridge pattern to separate abstractions from platformspecific implementation. For example, using this pattern, it can separate a window
abstraction from a window implementation for Linux or macOS.

in java:
In Java, you may notice the use of JDBC, which provides a bridge
between your application and a particular database. For example, the java.sql.
DriverManager class and the java.sql.Driver interface can form a bridge pattern
where the first one plays the role of abstraction and the second one plays the role
of implementor. The concrete implementors are com.mysql.jdbc.Driver or oracle.
jdbc.driver.OracleDriver, and so forth.
****************
Advantages:
Bridge pattern decouple an abstraction from its implementation so that the two can vary independently.

It is used mainly for implementing platform independence feature.

It adds one more method level redirection to achieve the objective.

Publish abstraction interface in a separate inheritance hierarchy, and put the implementation in its own inheritance hierarchy.

Use bridge pattern to run-time binding of the implementation.

Use bridge pattern to map orthogonal class hierarchies

Bridge is designed up-front to let the abstraction and the implementation vary independently.
