Abstract Factory patterns work around a super-factory which creates other factories.
This factory is also called as factory of factories.
**********************
1) To understand this pattern, I’ll extend the requirement in the factory method pattern.
In factory method pattern, we had two factories: one created dogs and the other created
tigers. But now, you want to categorize dogs and tigers further. You may choose a
domestic animal (dog or tiger) or a wild animal (dog or tiger) through these factories.
To fulfil that demand, I introduce two concrete factories: WildAnimalFactory and
PetAnimalFactory. The WildAnimalFactory is responsible for creating wild animals and
the PetAnimalFactory is responsible for creating domestic animals, or pets.
