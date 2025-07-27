package Basics;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = read.nextInt();

        boolean isPrime = true;
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                isPrime = false;
            }
        }

        if(isPrime){
            System.out.println("The number is a prime number.");
        }
        else{
            System.out.println("The number is not a prime number.");
        }
    }
}
