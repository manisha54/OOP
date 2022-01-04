package array;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter the size of the array: ");
        size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++){
            System.out.println("Enter the value at index " + i + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Filtered data ");
        int odd = 0;
        int even = 0;

        for (int i = 0; i < arr.length; i++){
            int comeValue = arr[i];
            if (comeValue % 2 == 0){
                even++;
            }
            else {
                odd += 1;
            }
        }
        System.out.println("Number of evens is : " + even);
        System.out.print("Number of odds is : " + odd);

    }


}
