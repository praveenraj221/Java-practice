package Searching;

import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter the number to find: ");
        int target = scanner.nextInt();
        int isFound = search(arr, target);
        System.out.println("The number is present in the index: ");
        System.out.println(isFound);
    }

    static int search(int[] arr, int target){
        if(arr.length == 0 ){
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
    return -1;
    }
}
