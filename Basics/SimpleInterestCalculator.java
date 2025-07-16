package Basics;

import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Principle: ");
        double principle = sc.nextDouble();

        System.out.print("Enter the Time: ");
        double time = sc.nextDouble();

        System.out.print("Enter the Rate: ");
        double rate = sc.nextDouble ();

        double simpleinterest = ((principle * time * rate)/100);
        System.out.println("The simple interest is: " + simpleinterest);
    }
}
