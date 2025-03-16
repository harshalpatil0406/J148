package Assignments;

import java.util.Scanner;

//Armstrong Number
public class assignment_z17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0, temp = num, digits = 0;

        while (temp > 0) {
            temp /= 10;
            digits++;
        }

        temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        System.out.println(num + " is " + (sum == num ? "an Armstrong number." : "not an Armstrong number."));
    }
}
