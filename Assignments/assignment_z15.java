package Assignments;

import java.util.Scanner;

//Find reminder without using ( % ) operator
public class assignment_z15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Dividend: ");
        int dividend = sc.nextInt();
        System.out.print("Enter Divisor: ");
        int divisor = sc.nextInt();

        int quotient = dividend / divisor;
        int remainder = dividend - (quotient * divisor);

        System.out.println("Remainder: " + remainder);
    }
}
