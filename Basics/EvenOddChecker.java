package Basics;

//import the scanner package
import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        //print this to make the code looks code and it is also a convention
        System.out.println("Number: ");
        Scanner read = new Scanner(System.in);
        int number = read.nextInt();

        //The logic here is if a number is divisible by 2 it is odd number, if it is not divisible by 2 then it is odd.
        if(number % 2 == 0){
            System.out.println("The number is Even");
        }
        else{
            System.out.println("The number is Odd");
        }
    }
}
