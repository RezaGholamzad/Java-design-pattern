package level1.level2;

import level1.level2.level3.Shape;
import level1.level2.level3.level4.Circle;
import level1.level2.level3.level4.Rectangle;
import level1.level2.level3.level4.Square;

public class ShapeFactory {
    //use getShape method to get object of type shape
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();

        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();

        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }

        return null;
    }
}
