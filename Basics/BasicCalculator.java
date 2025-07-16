package Basics;

import jdk.dynalink.beans.StaticClass;

import java.security.PublicKey;
import java.util.*;
public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the Second Number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter the operator: ");
        String operator = sc.next();

        sc.nextLine();

        System.out.print("Number1 " + operator + " Number2 " + "= " );
        if(operator.equals("+")){
            System.out.println(num1 + num2);
        } else if (operator.equals("-")) {
            System.out.println(num1 - num2);
        } else if (operator.equals("/")) {
            System.out.println(num1 / num2);
        }else if (operator.equals("*")){
            System.out.println(num1 * num2);
        }
    }
}
