package Arrays;

import java.util.*;

public class AverageOfArray {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double sum = 0;

        System.out.print("Enter the number of elements: ");
        int n = read.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = read.nextInt();
        }

        double average = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        average = sum / n;
        System.out.println("The average of the array: " + average);
    }
}
