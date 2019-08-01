public class RedShapeDecorated extends ShapeDecorator {

    public RedShapeDecorated(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape shapeDecorator){
        System.out.println("Border Color: Red");
    }
}
