package ConditionalLoops;

import java.util.Scanner;

public class LargestTillZero {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int largest = Integer.MIN_VALUE;
        System.out.println("Enter the numbers: ");
        while(true){
            int n = read.nextInt();

            if(n == 0){
                break;
            }

            if(n > largest){
                largest = n;
            }
        }

        if(largest == Integer.MIN_VALUE){
            System.out.println("No numbers were entered");
        }else{
            System.out.println("The largest number is: " + largest);
        }
    }
}
