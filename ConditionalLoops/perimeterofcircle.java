package Conditional_loops;

import java.util.Scanner;

public class perimeterofcircle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double radius = sc.nextDouble();
        double area = (2) * (3.14159) * (radius);
        System.out.println(area);
    }
}
