package Arrays;

import java.util.Scanner;

public class sumOfElements {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int[] arr = new int[5];

        for(int i = 0; i < arr.length; i++){
             arr[i] = scanner.nextInt();
             sum = sum + arr[i];
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Sum of elements of the array: " + sum);
    }
}
