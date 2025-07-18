package Conditional_loops;

import java.util.Scanner;

public class areaofrectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double length = sc.nextDouble();
        double width = sc.nextDouble();
        double area = (length) * (width);
        System.out.println(area);
    }
}
