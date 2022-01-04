package Polymorphism;

import java.util.Scanner;

public class TestShape {
    public static void main(String[] args) {
        Shape circle = new Circle();
        System.out.println("Area of circle" + circle.area(2));
        Shape rectangle =  new Rectangle();
        System.out.println("Area of rectangle" + rectangle.area(2f,3f));
        Shape triangle = new Triangle();
        System.out.println("Area of triangle" + triangle.area(2,3));


    }
}
