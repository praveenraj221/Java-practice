package Conditional_loops;

import java.util.Scanner;

public class areaofrhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double diagnol1 = sc.nextDouble();
        double diagnol2 = sc.nextDouble();
        double area = (0.5) * (diagnol1) * (diagnol2);
        System.out.println(area);
    }
}
