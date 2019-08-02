Adapter pattern works as a bridge between two incompatible interfaces.
This type of design pattern comes under structural pattern as this pattern combines the
capability of two independent interfaces.

This pattern involves a single class which is responsible to join functionalities
of independent or incompatible interfaces. A real life example could be a case of card reader which acts
as an adapter between memory card and a laptop. You plugin the memory card into card reader
and card reader into the laptop so that memory card can be read via laptop.

We are demonstrating use of Adapter pattern via following example in which an audio player device
can play mp3 files only and wants to use an advanced audio player capable of playing vlc and mp4 files.
******************
implementation:
We have a MediaPlayer interface and a concrete class AudioPlayer implementing the MediaPlayer interface.
AudioPlayer can play mp3 format audio files by default.

We are having another interface AdvancedMediaPlayer and concrete classes implementing the AdvancedMediaPlayer interface.
These classes can play vlc and mp4 format files.

We want to make AudioPlayer to play other formats as well. To attain this, we have created an adapter class
MediaAdapter which implements the MediaPlayer interface and uses AdvancedMediaPlayer objects to play the required format.

AudioPlayer uses the adapter class MediaAdapter passing it the desired audio type without knowing the actual class
which can play the desired format. AdapterPatternDemo, our demo class will use AudioPlayer class to play various formats.
*****************
example:
1) Suppose that you have an application that can be broadly classified into two parts: user
   interface (UI or front end) and database (back end). Through the user interface, clients
   can pass a specific type of data or objects. Your database is compatible with those objects
   and can store them smoothly. Over a period of time, you may feel that you need to
   upgrade your software to make your clients happy. So, you may want to allow new type
   of objects to pass through the UI. But in this case, the first resistance comes from your
   database because it cannot store these new types of objects. In such a situation, you can
   use an adapter that takes care of the conversion of the new objects to a compatible form
   that your old database can accept.

in Java:
   In Java, you can consider the java.io.InputStreamreader class and the
   java.io.OutputStreamWriter class as examples of object adapters. they adapt an
   existing InputStream/OutputStream object to a reader/Writer interface.

*****************
Advantages:
    Helps achieve reusability and flexibility.
    Client class is not complicated by having to use a different interface and can use polymorphism
    to swap between different implementations of adapters.
Disadvantages:
    All requests are forwarded, so there is a slight increase in the overhead.
    Sometimes many adaptations are required along an adapter chain to reach the type which is required.
