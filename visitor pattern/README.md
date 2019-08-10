This pattern helps you add new operations on the objects without modifying the
corresponding classes, especially when your operations change very often. Ideally,
visitors define class-specific methods, which work with an object of that class to support
new functionalities. Here you separate an algorithm from an object structure, and you
add new operations using a new hierarchy. Therefore, this pattern can support the open/
close principle (extension is allowed but modification is disallowed for entities like class,
function, modules, etc.). The upcoming implementations will make the concept clearer
to you.
The visitor pattern consists of two parts:
+ a method called Visit() which is implemented by the visitor and is called for every element in the data structure

+ visitable classes providing Accept() methods that accept a visitor

Client : The Client class is a consumer of the classes of the visitor design pattern.
It has access to the data structure objects and can instruct them to accept a Visitor to perform the appropriate processing.

Visitor : This is an interface or an abstract class used to declare the visit operations
for all the types of visitable classes.

ConcreteVisitor : For each type of visitor all the visit methods, declared in abstract visitor,
must be implemented. Each Visitor will be responsible for different operations.

Visitable : This is an interface which declares the accept operation. This is the entry point which
enables an object to be “visited” by the visitor object.

ConcreteVisitable : These classes implement the Visitable interface or class and defines the accept operation.
The visitor object is passed to this object using the accept operation.
***********************
Implementation: 
We are going to create a ComputerPart interface defining accept opearation.Keyboard, Mouse,
Monitor and Computer are concrete classes implementing ComputerPart interface.
We will define another interface ComputerPartVisitor which will define a visitor class operations.
Computer uses concrete visitor to do corresponding action.
VisitorPatternDemo, our demo class, will use Computer and ComputerPartVisitor classes to demonstrate use of visitor pattern.
**********************
examples:
This pattern is very useful when public APIs need to support plugging operations. Clients
can then perform their intended operations on a class (with the visiting class) without
modifying the source.

in java:
In Java, you may notice the use of this pattern when you use the abstract
class org.dom4j.VisitorSupport, which extends Object and implements the org.
dom4j.Visitor interface. Also, when you work with the javax.lang.model.element.
Element interface or javax.lang.model.element.ElementVisitor<R,P> (where R is
the return type of visitor’s method and P is the type of additional parameter to the
visitor’s method), you may notice the use of visitor design pattern.
***********************
Advantages :
If the logic of operation changes, then we need to make change only in the visitor implementation
rather than doing it in all the item classes.

Adding a new item to the system is easy, it will require change only in visitor interface and implementation and
existing item classes will not be affected.

Disadvantages :

We should know the return type of visit() methods at the time of designing otherwise we will have to change
the interface and all of its implementations.

If there are too many implementations of visitor interface, it makes it hard to extend.
