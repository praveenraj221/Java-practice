package Arrays;

import java.util.Scanner;

public class CountEvenOddInArray {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[] arr = new int[4];

        int even = 0;
        int odd = 0;
        System.out.print("Enter the array elemts: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = read.nextInt();
            if(arr[i] % 2 == 0){
                even++;
            }
            else{
                odd++;
            }
        }

        System.out.println("Number of even numbers: " + even);
        System.out.println("Number of odd numbers: " + odd);


    }
}
