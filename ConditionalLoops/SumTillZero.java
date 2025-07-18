package ConditionalLoops;

import java.util.Scanner;

public class SumTillZero {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int sum = 0;
        System.out.println("Enter the numbers: ");

        while(true){
            int n = read.nextInt();
            if(n == 0){
                break;
            }
            sum = sum + n;
        }
        System.out.println("The Sum is: " + sum);
    }
}
