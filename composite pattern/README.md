Composite pattern is a partitioning design pattern and describes a group of objects that is
treated the same way as a single instance of the same type of object. The intent of a composite is to
“compose” objects into tree structures to represent part-whole hierarchies. It allows you to have a tree
structure and ask each node in the tree structure to perform a task.

Composite : Composite means it can have other objects below it.
leaf : leaf means it has no objects below it.
*********************
implementation:
We have a class Employee which acts as composite pattern actor class. CompositePatternDemo,
our demo class will use Employee class to add department level hierarchy and print all employees.
*********************
examples:
Any tree data structure can follow this concept. Clients can treat the leaves of the tree and
the non-leaves (or branches of the tree) in the same way.

in java:
This pattern is commonly seen in various UI frameworks. In Java, the
generic Abstract Window Toolkit (AWT) container object is a component that
can contain other AWT components. For example, in java.awt.Container class
(which extends java.awt.Component) you can see various overloaded version of
add(Component comp) method. In JSF, UIViewRoot class acts like a composite
node and UIOutput acts like a leaf node. When you traverse a tree, you often use
the iterator design pattern
**********************
advantages:

Composite Pattern should be used when clients need to ignore the difference between compositions
of objects and individual objects. If programmers find that they are using multiple objects in the same way,
and often have nearly identical code to handle each of them, then composite is a good choice, it is less complex
in this situation to treat primitives and composites as homogeneous.

1) Less number of objects reduces the memory usage, and it manages to keep us away from errors related
to memory like java.lang.OutOfMemoryError.
Although creating an object in Java is really fast, we can still reduce the execution time of our program by sharing objects.

2) Although creating an object in Java is really fast, we can still reduce the execution time of our program by sharing objects.

disadvantage:

1) Composite Design Pattern makes it harder to restrict the type of components of a composite.
So it should not be used when you don’t want to represent a full or partial hierarchy of objects.

2) Composite Design Pattern can make the design overly general. It makes harder to restrict the components of a composite.
Sometimes you want a composite to have only certain components.
With Composite, you can’t rely on the type system to enforce those constraints for you.
Instead you’ll have to use run-time checks.