package Basics;

import java.util.Scanner;

//This is the bruteforce approach.
public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the Word: ");
        String input = read.nextLine();

        String reversed = "";
        for(int i = input.length() - 1; i >= 0; i--){
            reversed = reversed + input.charAt(i);
        }

        if(input.equalsIgnoreCase(reversed)){
            System.out.println(input + " is a Palindrome");
        }
        else{
            System.out.println(input + " is not a Palindrome");
        }
    }
}
