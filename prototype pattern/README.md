Prototype allows us to hide the complexity of making new instances from the client.
The concept is to copy an existing object rather than creating a new instance from scratch,
something that may include costly operations. The existing object acts as a prototype and contains
the state of the object. The newly copied object may change same properties only if required.
This approach saves costly resources and time, especially when the object creation is a heavy process.

The prototype pattern is a creational design pattern. Prototype patterns is required,
when object creation is time consuming, and costly operation, so we create object with existing object itself.
One of the best available way to create object from existing objects are clone() method. Clone is the simplest
approach to implement prototype pattern. However, it is your call to decide how to copy existing object based
on your business model.

For example, an object is to be created
after a costly database operation. We can cache the object, returns its clone on next request and update
the database as and when needed thus reducing database calls.
*****************
examples:
1) Let’s assume that you have an application that is very stable. In the future, you may want
   to update the application with some small modifications. So, you start with a copy of
   your original application, make changes, and analyze further. Surely, to save your time
   and money, you do not want to start from scratch.
2) By dynamic loading or To avoid building a class hierarchy of factories that parallels the class hierarchy of products
3) When instances of a class can have one of only a few different combinations of state.
   It may be more convenient to install a corresponding number of prototypes and clone them rather than
   instantiating the class manually, each time with the appropriate state.
******************
Advantages of Prototype Design Pattern:

1) Adding and removing products at run-time:
   Prototypes let you incorporate a new concrete product class into a system simply by registering a
   prototypical instance with the client. That’s a bit more flexible than other creational patterns,
   because a client can install and remove prototypes at run-time.
2) Specifying new objects by varying values:
   Highly dynamic systems let you define new behavior through object composition by specifying values for an
   object’s variables and not by defining new classes.
3) Specifying new objects by varying structure:
   Many applications build objects from parts and subparts.
   For convenience, such applications often let you instantiate complex, user-defined structures
   to use a specific subcircuit again and again.
4) Reduced subclassing:
   Factory Method often produces a hierarchy of Creator classes that parallels the product class hierarchy.
   The Prototype pattern lets you clone a prototype instead of asking a factory method to make a new object.
   Hence you don’t need a Creator class hierarchy at all.

Disadvantages of Prototype Design Pattern:

1) Overkill for a project that uses very few objects and/or does not have an underlying emphasis on the extension
   of prototype chains.
2) It also hides concrete product classes from the client
3) Each subclass of Prototype must implement the clone() operation which may be difficult,
   when the classes under consideration already exist. Also implementing clone() can be difficult when
   their internals include objects that don’t support copying or have circular references.
