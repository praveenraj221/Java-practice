package Basics;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the N: ");
        int n = read.nextInt();

        int firstNumber = 0;
        int secondNumber = 1;

        for(int i = 0; i < n; i++) {
            System.out.print(firstNumber + " ");
            int next = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = next;
        }

    }
}
