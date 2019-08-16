In your application, you may need to support “undo” operations. To achieve this, you
need to record the internal state of an object. So, you must save this state information in
a place that can be referred again to revert back the old state of the object. But in general,
objects encapsulate their states, and those states are inaccessible to the outer world.
So, if you expose the state information, then you violate encapsulation.
The dictionary meaning of memento is reminder (of past events). So, you can guess
that using this pattern, you can restore an object to its previous state, but it ensures that
you achieve your goal without violating the encapsulation.
originator : the object for which the state is to be saved. It creates the memento and uses it in future to undo.
memento : the object that is going to maintain the state of originator. Its just a POJO.
caretaker : the object that keeps track of multiple memento. Like maintaining savepoints.
*****************
implementation:
Memento pattern uses three actor classes. Memento contains state of an object to be restored. 
Originator creates and stores states in Memento objects and Caretaker object is responsible to restore object 
state from Memento. We have created classes Memento, Originator and CareTaker.
MementoPatternDemo, our demo class, will use CareTaker and Originator objects to show restoration of object states.
*****************
examples:
In a drawing application, you may need to revert back to a prior state.

in java:
You notice a similar pattern when you consider the JTextField class, which
extends the javax.swing.text.JTextComponent abstract class and provides an undo
support mechanism. Here javax.swing.undo.UndoManager can act as a caretaker,
an implementation of javax.swing.undo. UndoableEdit can act like a memento,
and an implementation of javax.swing.text.Document can act like an originator.
You will learn about the terms originator, caretaker, and memento shortly. Also,
java.io.Serializable is often called an example of a memento but although you can
serialize a memento object, it is not a mandatory requirement for the memento
design pattern.
******************
Advantage:
We can use Serialization to achieve memento pattern implementation that is more generic rather than Memento 
pattern where every object needs to have it’s own Memento class implementation.

Disadvantage:
If Originator object is very huge then Memento object size will also be huge and use a lot of memory.