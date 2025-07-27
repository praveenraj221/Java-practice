package Arrays;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.print("Enter the array elements: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = read.nextInt();
        }

        System.out.print("The array before reversing: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        //leaves a one line space for neat representation
        System.out.println(); // Ends line after first array
        System.out.println(); // Adds a blank line

        System.out.print("The array after reversing: ");
        for(int i = arr.length - 1; i >=0; i--){
            System.out.print(arr[i] + " ");
        }

    }
}
