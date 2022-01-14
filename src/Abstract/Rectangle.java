package Abstract;

public class Rectangle extends  Shape{
    private  float length;
    private float breadth;
    Rectangle(float length , float breadth){
        this.length = length;
        this.breadth = breadth;

    }

    @Override
    protected float area() {
        return length * breadth;
    }
}
