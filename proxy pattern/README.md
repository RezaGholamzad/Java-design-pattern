A proxy is basically a substitute for an intended object. Access to the original object is not
always possible due to many factors. For example, it is expensive to create, it is in need
of being secured, it resides in a remote location, and so forth. The proxy design pattern
helps us in similar contexts. When a client deals with a proxy object, it assumes that it
is talking to the actual object. So, in this pattern, you may want to use a class that can
perform as an interface to something else.

Remote proxy:
They are responsible for representing the object located remotely.
Talking to the real object might involve marshalling and unmarshalling of data and talking to the remote object.
All that logic is encapsulated in these proxies and the client application need not worry about them.
Virtual proxy:
These proxies will provide some default and instant results if the real object is supposed to take some time
to produce results. These proxies initiate the operation on real objects and provide a default result to the
application. Once the real object is done, these proxies push the actual data to the client where it has provided
dummy data earlier.
Protection proxy:
If an application does not have access to some resource then such proxies will talk to the objects in applications
that have access to that resource and then get the result back.
A smart proxy provides additional layer of security by interposing specific actions when the object is accessed.
An example can be to check if the real object is locked before it is accessed to ensure that no other object can change it.
*****************
implementation:
We are going to create an Image interface and concrete classes implementing the Image interface.
ProxyImage is a a proxy class to reduce memory footprint of RealImage object loading.
ProxyPatternDemo, our demo class, will use ProxyImage to get an Image object to load and display as it needs.
*****************
examples:
In the programming world, to create multiple instances of a complex object (heavy
object) is costly . So, whenever you are in need, you can create multiple proxy
objects that point to the original object. This mechanism can also help save your
system/application memory. An ATM can implement this pattern to hold proxy objects
for bank information that may exist on a remote server.

in java:
In the java.lang.reflect package, you can have a Proxy class and an
InvocationHandler interface that supports a similar concept. The java.rmi.* package
also provides methods through which an object on one Java virtual machine can
invoke methods on an object that resides in a different Java virtual machine.
******************
Benefits:
One of the advantages of Proxy pattern is security.

This pattern avoids duplication of objects which might be huge size and memory intensive.
This in turn increases the performance of the application.

The remote proxy also ensures about security by installing the local code proxy (stub) in the client machine
and then accessing the server with help of the remote code.
