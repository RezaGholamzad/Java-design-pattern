Suppose that you have pen. You can replace different refills to write with different colors.
So, a pen without refills is considered as a flyweight with intrinsic data, and a pen with
refills is considered as extrinsic data.
Flyweight pattern is primarily used to reduce the number of objects created and to decrease memory
footprint and increase performance.
Flyweight pattern is one of the structural design patterns as this pattern provides ways to decrease
object count thus improving application required objects structure. Flyweight pattern is used when we
need to create a large number of similar objects (say 105). One important feature of flyweight objects
is that they are immutable. This means that they cannot be modified once they have been constructed.
********************
Implementation:
Flyweight pattern tries to reuse already existing similar kind objects by storing them and creates new
object when no matching object is found. We will demonstrate this pattern by drawing 20 circles of different
locations but we will create only 5 objects. Only 5 colors are available so color property is used to check 
already existing Circle objects.
We are going to create a Shape interface and concrete class Circle implementing the Shape interface.
A factory class ShapeFactory is defined as a next step.
ShapeFactory has a HashMap of Circle having key as color of the Circle object.
Whenever a request comes to create a circle of particular color to ShapeFactory, it checks the circle object in
its HashMap, if object of Circle found, that object is returned otherwise a new object is created,
stored in hashmap for future use, and returned to client.
FlyWeightPatternDemo, our demo class, will use ShapeFactory to get a Shape object.
It will pass information (red / green / blue/ black / white) to ShapeFactory to get the circle of desired color it needs.
*********************
examples:
Suppose that you want to make a website where different users can compile and execute
the programs with their preferred computer languages, such as Java, C++, C#, and so forth.
If you need to set up a unique environment for each individual user within a short period
of time, your site will overload and the response time of the server will become so slow
that no one will be interested in using your site. So, instead of creating a new programming
environment for every user, you can make a common programming environment (which
supports different programming language with/without minor changes) among them. And
to check the existing/available programming environment and to make decisions whether
you need to create a new one or not, you can maintain a factory.
Consider another example. Suppose that in a computer game, you have large
number of participants whose core structures are same, but their appearances vary (e.g.,
different states, colors, weapons, etc.) Therefore, assume that if you need to create (or
store) all of these objects with all of these variations/states, the memory requirement
will be huge. So, instead of storing all of these objects, you can design your application
in such way that you create these instances with common properties and your client object maintains all
of these variations (extrinsic states).
If you can successfully implement this concept, you can claim that you have followed the
flyweight design pattern in your application.
Another common use of this pattern is seen in the graphical representation of
characters in a word processor.

in java:
you may notice the use of this pattern when you use the wrapper
classes, such as java.lang.integer, java.lang.Short, java.lang.Byte, and java.lang.
Character, where the static method valueof() replicates a factory method. (it is
worth remembering that some of the wrapper classes, such as java.lang.Double
and java.lang.Float, do not follow this pattern.) the String pool is another example
of a flyweight.
*********************
