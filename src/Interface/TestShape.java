package Interface;


public class TestShape {
    public static void main(String[] args) {
        Shape circle = (Shape) new Circle(4);
        System.out.println("Area of circle" + circle.area());
    }
}
