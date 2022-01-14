package Abstract;


public class TestShape {
    public static void main(String[] args) {
        Shape circle = new Circle(3);
        System.out.println("Area of circle" + circle.area());

//        Shape rectangle =  new Rectangle(2f,3f);
//        System.out.println("Area of rectangle" + rectangle.area());
        Shape triangle = new Triangle(2,3);
        System.out.println("Area of triangle" + triangle.area());

    }
}
