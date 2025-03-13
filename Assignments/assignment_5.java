package Assignments;

import java.util.Scanner;

//Calculate Area of rectangle
public class assignment_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );

        System.out.print("Enter the Length : " );
        double l = sc.nextDouble();

        System.out.print("Enter the Height : " );
        double h = sc.nextDouble( );

        double area = l*h;

        System.out.printf("Area of the Rectangle is : %.2f",area );
    }
}
