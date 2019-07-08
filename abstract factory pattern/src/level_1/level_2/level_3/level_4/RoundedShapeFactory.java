package level_1.level_2.level_3.level_4;

import level_1.level_2.level_3.AbstractFactory;
import level_1.level_2.level_3.level_4.level_5.Shape;
import level_1.level_2.level_3.level_4.level_5.level_6.RoundedRectangle;
import level_1.level_2.level_3.level_4.level_5.level_6.RoundedSquare;

public class RoundedShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType){
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new RoundedRectangle();
        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new RoundedSquare();
        }
        return null;
    }
}
