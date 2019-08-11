In a template method, you define the minimum or essential structure of an algorithm.
Then you defer some responsibilities to the subclasses. The key intent is that you can
redefine certain steps of an algorithm, but those changes should not impact the basic
flow of the algorithm.
So, this design pattern is useful when you implement a multistep algorithm and you
want to allow customization through subclasses.
****************
Implementation:
We are going to create a Game abstract class defining operations with a template method set to be final so that it
cannot be overridden. Cricket and Football are concrete classes that extend Game and override its methods.
TemplatePatternDemo, our demo class, will use Game to demonstrate use of template pattern.
****************
examples:
Suppose that you are making a program to design engineering courses. Let’s assume that
the first semester is common for all streams. In subsequent semesters, you need to add
new papers/subjects to the application based on the course. You see a similar situation
in the upcoming illustration. Remember that this pattern makes sense when you want
to avoid duplicate codes in your application. At the same time, you may want to allow
subclasses to change some specific details of the base class workflow to provide varying
behaviors in the application.

in java: 
The removeAll() method of java.util.AbstractSet is an example of the
template method pattern. Apart from this, there are many non-abstract methods
in java.util.AbstractMap and java.util.AbstractSet classes, which can also be
considered as the examples of the template method pattern.
*****************
advantage:
Let subclasses implement varying behavior (through method overriding)

Avoid duplication in the code , the general workflow structure is implemented once in
the abstract class’s algorithm, and necessary variations are implemented in the subclasses.

Control at what points subclassing is allowed. As opposed to a simple polymorphic override,
where the base method would be entirely rewritten allowing radical change to the workflow,
only the specific details of the workflow are allowed to change.