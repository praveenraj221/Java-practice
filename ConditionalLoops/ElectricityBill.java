package ConditionalLoops;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Enter the units used: ");
        double units = read.nextDouble();
        double bill = 0;

        if(units <= 100){
            bill = units * 5;
        } else if (units >  100 && units <= 200) {
            bill = (100 * 5) + (units - 100) * 7;
        }else{
            bill = (100 * 5) + (100 * 7) + (units - 200) * 10;
        }

        System.out.println("Your electricity bills is: ₹" + bill);
    }
}
