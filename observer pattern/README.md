Observer pattern is used when there is one-to-many relationship between objects such
as if one object is modified, its depenedent objects are to be notified automatically.
Observer pattern falls under behavioral pattern category.

In this pattern, there are many observers (objects) that are observing a particular subject
(also an object). Observers register themselves to a subject to get a notification when
there is a change made inside that subject. When they lose interest of the subject, they
simply unregister from the subject. It is also referred to as the publish-subscribe pattern.
The whole idea can be summarized as follows: Using this pattern, an object (subject) can
send notifications to multiple observers (a set of objects) at the same time.
*********************
Implementation:
Observer pattern uses three actor classes. Subject, Observer and Client. Subject is an object having methods
to attach and detach observers to a client object. We have created an abstract class Observer and
a concrete class Subject that is extending class Observer.

ObserverPatternDemo, our demo class, will use Subject and concrete class object to show observer pattern in action.
*********************
in java:
In general, you see the presence of this pattern in event-driven software.
In Java, you can see the use of event listeners. these listeners are observers
only. In Java, you have a ready-made class called Observable, which can have
multiple observers.
*********************
examples:
1) In the world of computer science, consider a simple UI-based example. Let’s assume that
   this UI is connected to a database. A user can execute a query through that UI, and after
   searching the database, the result is returned in the UI. Here you segregate the UI from
   the database in such a way that if a change occurs in the database, the UI is notified, and
   it updates its display according to the change.
   To simplify this scenario, assume that you are the person responsible for maintaining
   a particular database in your organization. Whenever there is a change made inside the
   database, you want a notification so that you can take action if necessary.
*********************
Advantages:
    Subject only knows that observer implement Observer interface.Nothing more.

    There is no need to modify Subject to add or remove observers.

    We can reuse subject and observer classes independently of each other.

Disadvantages:

    Memory leaks caused by Lapsed listener problem because of explicit register and unregistering of observers.
    The lapsed listener problem is a common source of memory leaks for object-oriented programming languages,
    among the most common ones for garbage collected languages.
    It originates in the observer pattern, where observers (or listeners) register with a subject
    (or publisher) to receive events. In basic implementation, this requires both explicit registration and
    explicit deregistration, as in the dispose pattern, because the subject holds strong references to the observers,
    keeping them alive. The leak happens when an observer fails to unsubscribe from the subject when it no longer needs
    to listen. Consequently, the subject still holds a reference to the observer which prevents it from being garbage
    collected — including all other objects it is referring to — for as long as the subject is alive, which could be
    until the end of the application.
    This causes not only a memory leak, but also a performance degradation with an "uninterested" observer
    receiving and acting on unwanted events. This can be prevented by the subject holding weak references to
    the observers, allowing them to be garbage collected as normal without needing to be unregistered.
