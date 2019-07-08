package level_1.level_2;

import level_1.level_2.level_3.AbstractFactory;
import level_1.level_2.level_3.level_4.RoundedShapeFactory;
import level_1.level_2.level_3.level_4.ShapeFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(boolean rounded){
        if(rounded){
            return new RoundedShapeFactory();
        }else{
            return new ShapeFactory();
        }
    }
}
