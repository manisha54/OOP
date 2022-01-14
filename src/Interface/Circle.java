package Interface;

import Abstract.Shape;

public class Circle extends Shape {

    private  float radius;
    Circle(float radius){
        this.radius = radius;
    }


    @Override
    protected float area() {
        return 0;
    }
}
