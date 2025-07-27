package Arrays;

import java.util.Scanner;

public class MergeArrays {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the number of element is First Array: ");
        int n1 = read.nextInt();
        int[] arr1 = new int[n1];

        System.out.println("Enter the elements of the First Array: ");
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = read.nextInt();
        }

        System.out.println("Enter the number of element is Second Array: ");
        int n2 = read.nextInt();
        int[] arr2 = new int[n2];

        System.out.println("Enter the elements of the Second Array: ");
        for(int j = 0; j < arr2.length; j++){
            arr2[j] = read.nextInt();
        }

        int n3 = n1 + n2;
        int[] arr3 = new int[n3];

        //copying first array
        for(int i = 0; i < n1; i++){
            arr3[i] = arr1[i];
        }

        //copying second array
        for(int j = 0; j < n2; j++){
            arr3[n1 + j] = arr2[j];
        }

        // Print the merged array
        System.out.print("Merged Array: ");
        for(int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}
