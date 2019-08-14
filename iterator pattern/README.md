Using iterators, a client object can traverse a container (or a collection of objects) to
access its elements without knowing how these data are stored internally. The concept is
very useful when you need to traverse different kinds of collection objects in a standard
and uniform way.The following are some important points about this pattern.
+ It is often used to traverse the nodes of a tree-like structure. So, in
    many scenarios, you may notice the use of iterator patterns with
    composite patterns.
+ The role of an iterator is not limited to traversing. This role can vary to
    support various requirements.
+ Clients cannot see the actual traversal mechanism. A client program
    only uses the iterator methods that are public in nature.
Iterator pattern falls under behavioral pattern category.
****************
implementation:
We're going to create a Iterator interface which narrates navigation method and a Container interface which
retruns the iterator . Concrete classes implementing the Container interface will be responsible to implement
Iterator interface and use it
IteratorPatternDemo, our demo class will use NamesRepository, a concrete class implementation to print a
Names stored as a collection in NamesRepository.
****************
examples:
Similarly, let’s assume that, a college arts department is using an array data structure
to maintain its students’ records. The science department is using a linked list data
structure to keep their students’ records. The administrative department does not care
about the different data structures, they are simply interested in getting the data from
each of the departments and they want to access the data in a universal way.

in java:
the iterator classes in Java’s collection framework are iterator examples.
When you use the interfaces like java.util.Iterator or java.util.enumeration , you
basically use this pattern. the java.util.Scanner class also follows this pattern.
If you are familiar with C#, you may use C#’s own iterators that were introduced
in Visual Studio 2005.the foreach statement is frequently used in this context.



