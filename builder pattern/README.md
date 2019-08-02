Builder pattern aims to “Separate the construction of a complex object from its representation
so that the same construction process can create different representations.”
It is used to construct a complex object step by step and the final step will return the object.
The process of constructing an object should be generic so that it can be used to create different
representations of the same object.

Product is the complex object that you want to create.
ConcreteBuilder constructs and assembles the parts of a product by implementing an abstract interface, Builder.
The ConcreteBuilder objects build the product’s internal representations and define the
creational process/assembling mechanisms.
Builders can also provide methods to get an object that is created and available for use.
Director is responsible for creating the final object using the Builder interface.
In other words, Director uses Builder and
controls the steps/sequence to build the final Product. Builders can also keep reference
of the products that they built, so that they can be used again.
*****************
implementation:
We have considered a business case of fast-food restaurant where a typical meal could be
a burger and a cold drink. Burger could be either a Veg Burger or Chicken Burger and will be packed by a wrapper.
Cold drink could be either a coke or pepsi and will be packed in a bottle.
*****************
steps:
1)
    Product:
    Create an interface Item representing food item and packing.(Item, Packing)
2)
    ConcreteBuilder for packing interface:
    Create concrete classes implementing the Packing interface.(Wrapper, Bottle)
3)
    Abstract interface, builder:
    Create abstract classes implementing the item interface providing default functionalities.(Burger, ColdDrink)
4)
    ConcreteBuilder for Burger and ColdDrink:
    Create concrete classes extending Burger and ColdDrink classes.(VegBurger, ChickenBurger, Pepsi, Coke)
5)
    Product:
    Create a Meal class having Item objects defined above.(Meal)
6)
    Director:
    Create a MealBuilder class, the actual builder class responsible to create Meal objects.(MealBuilder)
7)
    BuiderPatternDemo uses MealBuider to demonstrate builder pattern.(BuilderPatternDemo)
*****************
example:
    The builder pattern can be used when we want to convert one text format to another text
    format (e.g., RTF to ASCII text).
