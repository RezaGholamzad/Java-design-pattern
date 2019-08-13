Here you encapsulate a method invocation process. In general, four terms are
associated: invoker, client, command, and receiver. A command object can invoke a
method of the receiver in a way that is specific to that receiver’s class. The receiver then
starts processing the job. A command object is separately passed to the invoker object
to invoke the command. The client object holds the invoker object and the command
objects. The client only makes the decision—which commands to execute—and then it
passes the command to the invoker object (for that execution).
Command pattern is a data driven design pattern and falls under behavioral pattern category.
********************
implementation:
We have created an interface Order which is acting as a command. We have created a Stock class which acts as a request(receiver).
We have concrete command classes BuyStock and SellStock implementing Order interface which will do actual command
processing. A class Broker is created which acts as an invoker object. It can take and place orders.
Broker object uses command pattern to identify which object will execute which command based on the type of command.
CommandPatternDemo, our demo class, will use Broker class to demonstrate command pattern.
*******************
examples:
The real-world scenario for painting applies to Microsoft Paint. You can use the Menu or
Shortcut keys to perform the undo/redo operations in those contexts.
In general, you can observe this pattern in the menu system of an editor or IDE
(integrated development environment). So, if you want to make an application that
needs to support undos, multiple undos, or similar operations, then the command
pattern can be your savior.
Microsoft used this pattern in Windows Presentation Foundation (WPF). The online
source at https://visualstudiomagazine.com/articles/2012/04/10/commandpattern-in-net.aspx describes it 
in detail: “The command pattern is well suited
for handling GUI interactions. It works so well that Microsoft has integrated it tightly
into the Windows Presentation Foundation (WPF) stack. The most important piece is
the ICommand interface from the System. Windows.Input namespace. Any class that
implements the ICommand interface can be used to handle a keyboard or mouse event
through the common WPF controls. This linking can be done either in XAML or in a
code-behind.

in java:
When you implement the run() method of java.lang.Runnable interface , you
are basically using the command design pattern. Another interface, java.swing.
Action, also represents the command design pattern. It is important to note that the
implementation of undos varies and can be complex. The memento design pattern
also supports undo operations. You may need to use both of these design patterns
in your application to implement a complex undo operation.
******************
Advantages:
Makes our code extensible as we can add new commands without changing existing code.

Reduces coupling the invoker and receiver of a command.

Disadvantages:
Increase in the number of classes for each individual command

