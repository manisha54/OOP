package array;

import java.util.Scanner;

public class Size {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of an array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i=0; i< arr.length; i++){
            System.out.println("Enter string at index" + i +": ");
            arr[i] = sc.nextInt();

        }
        System.out.println("Arr size are : ");
        for (int i=0; i < arr.length; i++) {
            System.out.println(arr[i]);


        }
    }


}

