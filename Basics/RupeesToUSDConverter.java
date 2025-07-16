package Basics;

import java.util.Scanner;

public class RupeesToUSDConverter {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        final double exchange_rate = 83.0;

        System.out.print("Enter the amount in INR: ");
        double amount = read.nextDouble();

        System.out.println();

        double usd = amount / exchange_rate;
        System.out.println("The converted amount is: " + usd);
    }
}
