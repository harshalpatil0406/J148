package Assignments;

import java.util.Scanner;

//Add two numbers/binary numbers/characters
public class assignment_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Addition of two numbers
        System.out.print("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Sum: " + (num1 + num2));

        // Addition of binary numbers
        System.out.print("Enter two binary numbers: ");
        String bin1 = sc.next();
        String bin2 = sc.next();
        int sum = Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2);
        System.out.println("Binary Sum: " + Integer.toBinaryString(sum));

        // Addition of characters
        System.out.print("Enter two characters: ");
        char ch1 = sc.next().charAt(0);
        char ch2 = sc.next().charAt(0);
        System.out.println("Character Sum (ASCII): " + (ch1 + ch2));
        sc.close();
    }
}

