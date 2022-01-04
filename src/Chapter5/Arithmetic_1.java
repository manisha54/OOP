package Chapter5;
import java.util.Scanner;

public class Arithmetic_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float first, second, third;

        System.out.print("Enter the first number : ");
        first = sc.nextFloat();

        System.out.print("Enter the second number : ");
        second = sc.nextFloat();

        System.out.print("Enter the third number : ");
        third = sc.nextFloat();

        Calculation calculate = new Calculation(first, second, third);
        System.out.println(calculate);


    }
}
