public class TestGeometricClass {
    public static void main(String[] args) {
        Circle c = new Circle(23, "green", true);
        Rectangle r = new Rectangle(45, 45, "red", false);
        System.out.println("Using getArea method with circle class with radius 23: " + c.getArea());
        System.out.println("Using getPerimeter method with circle class with radius 23: " + c.getPerimeter());
        System.out.println("Using getArea method with rectangle class with height 45 and width 45: " + r.getArea());
        System.out.println("Using getPerimeter method with rectangle class with height 45 and width 45: " + r.getPerimeter());
        System.out.println(c);
        System.out.println(r);
    }
}
