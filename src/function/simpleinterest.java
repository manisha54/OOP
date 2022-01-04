package function;

import java.util.Scanner;

public class simpleinterest {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        //Data representation
        float principal;
        float time;
        float rate;
        float result;

        //input
        System.out.print("Enter the value of principal: ");
        principal = sc.nextFloat();
        System.out.print("Enter the value of time: ");
        time = sc.nextFloat();
        System.out.print("Enter the value of rate: ");
        rate = sc.nextFloat();

        //algorithm
        result = (principal*rate*time)/100;
        //output
        System.out.print("The formula for simple interest is " + result);


    }
}
