package Assignments;

import java.util.Scanner;

//Calculate power of a number
public class assignment_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Base Number : ");
        int base = sc.nextInt();
        System.out.print("Enter Exponent Number : ");
        int exponent = sc.nextInt();
        System.out.println("Power of the Number is : " + Math.pow(base, exponent));
        sc.close();
    }
}
