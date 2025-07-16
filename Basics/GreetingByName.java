package Basics;

import java.util.Scanner;

public class GreetingByName {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = read.nextLine();

        System.out.println("Hi, " + name + " Good morning! Have a wonderful day.");
    }
}
