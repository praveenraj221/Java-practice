package Basics;
import java.util.*;

public class LargestOfTwo {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Enter the First Number: ");
        int num1 = read.nextInt();

        System.out.print("Enter the Second Number: ");
        int num2 = read.nextInt();


        if(num1 > num2){
            System.out.println("The greatest among the two numbers is: " + num1);
        }else{
            System.out.println("The greatest among the two numbers is: " + num2);
        }
    }
}
