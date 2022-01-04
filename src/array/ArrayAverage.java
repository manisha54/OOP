package array;

import java.util.Scanner;

public class ArrayAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element of index" + i + " : ");
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        float average = sum / arr.length;
        System.out.println("Average of an array: " + average);


    }

}
