In Factory pattern, we create object without exposing the creation logic to client and
the client use the same common interface to create new type of object.
The idea is to use a static member-function (static factory method) which creates & returns instances,
hiding the details of class modules from user.
**********************
1) Say, in a ‘Drawing’ system, depending on user’s input, different pictures like square,
rectangle, circle can be drawn. Here we can use factory method to create instances depending on user’s input.
For adding new type of shape, no need to change client’s code.
***********************
2) In travel site, we can book train ticket as well bus tickets and flight ticket.
In this case user can give his travel type as ‘bus’, ‘train’ or ‘flight’.
Here we have an abstract class ‘AnyTravel’ with a static member function ‘GetObject’ which
depending on user’s travel type, will create & return object of ‘BusTravel’ or ‘ TrainTravel’.
‘BusTravel’ or ‘ TrainTravel’ have common functions like passenger name, Origin, destinationParameters.
***********************
3) Suppose that you are building an application that needs to support two different
databases, let’s say Oracle and SQL Server. So, whenever you insert a data into a
database, you create a SQL Server–specific connection (SqlServerConnection) or an
Oracle server–specific connection (OracleConnection) and then you can proceed.
If you put these codes into if-else (or switch) statements, you may need to repeat
a lot of code. This kind of code is not easily maintainable because whenever you
need to support a new type of connection, you need to reopen your code and place
the modifications. A factory method pattern focuses on solving similar problems in
application development.
