public class Rectangle extends GeometricObject {
    private double width;
    private double height;

    Rectangle() {}

    Rectangle(double width, double height)
    {
        this.height = height;
        this.width = width;
    }

    Rectangle(double width, double height, String color, boolean filled)
    {
        super(color, filled);
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        return width*height;
    }

    @Override
    public double getPerimeter() {
        // TODO Auto-generated method stub
        return 2*(width+height);
    }
}
