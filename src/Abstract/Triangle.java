package Abstract;

public class Triangle extends  Shape {

    private  float height;
    private  float base;

    Triangle(float height, float base){
        this.height = height;
        this.base = base;
    }


    @Override
    protected float area() {
        return 1/2f * height* base;
    }
}
