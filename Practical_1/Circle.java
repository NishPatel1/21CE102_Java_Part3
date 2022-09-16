public class Circle extends GeometricObject{
    private double radius;

    Circle() {};

    Circle(double radius)
    {
        this.radius = radius;
    }

    Circle(double radius, String color, boolean filled)
    {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDiameter() {
        return radius*2;
    }

    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        return 3.14*radius*radius;
    }

    @Override
    public double getPerimeter() {
        // TODO Auto-generated method stub
        return 2*3.14*radius;
    }
}
