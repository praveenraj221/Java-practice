package ConditionalLoops;

import java.util.Scanner;

public class PrintFactors {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = read.nextInt();

        System.out.print("The factors are: ");
        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                System.out.print( i + " ");
            }
        }
    }
}
