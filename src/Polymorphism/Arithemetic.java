package Polymorphism;

import java.util.Scanner;

public class Arithemetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(add(2,2));
        System.out.println(add(2,3));

    }
    public static int add(int f, int s){
        return  f+s;
    }
    public static float add(float f, int s) {
        return f+s;
    }
    public static float add(float f, float s){
        return  f+s;
    }


}
