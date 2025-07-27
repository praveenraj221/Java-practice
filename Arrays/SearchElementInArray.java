package Arrays;

import java.util.Scanner;

public class SearchElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter 5 elements of the array:");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the number to search for: ");
        int element = scanner.nextInt();

        boolean isFound = false;
        for(int i = 0; i < arr.length; i++){
            if(element == arr[i]){
                isFound = true;
                break;
            }
        }

        if(isFound){
            System.out.println("The number is present.");
        }
        else{
            System.out.println("The number is not present.");
        }
    }
}
