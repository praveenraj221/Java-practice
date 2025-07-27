package Arrays;

import java.util.Scanner;

public class MaxMinInArray {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int[] arr = new int[5];

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = read .nextInt();
            if(arr[i] > max){
                max = arr[i];
            }
            else if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("The Maximum element of the array is: " + max);
        System.out.println("The Minimum element of the array is: " + min);
    }
}
