public class Circle extends Shape {
    private int x, y, radius;

    @Override
    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }

    protected Circle(DrawAPI drawAPI, int x, int y, int radius) {
        super(drawAPI);
        this.radius = radius;
        this.x = x;
        this.y = y;
    }
}
