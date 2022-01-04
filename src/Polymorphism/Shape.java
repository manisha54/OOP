package Polymorphism;

public class Shape {
    public  float area(float radius){
        return 3.14f * radius* radius;
    }
    public  float area(int l ,int b) {
        return 0.5f * l * b;
    }
    public  float area(float l ,float b) {
        return  l * b;
    }

}
