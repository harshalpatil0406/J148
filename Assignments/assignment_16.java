package Assignments;

import java.util.Scanner;

public class assignment_16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );

        int a = 10, b = 20;

        // 1. Using `+` operator
        System.out.println("Sum: " + (a + b));

        // 2. Using `-` operator
        System.out.println("Sum: " + (a - (-b)));

        // 3. Using bitwise operator
        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        System.out.println("Sum using bitwise: " + a);

        // 4. Using loops
        int sum = 0;
        for (int i = 0; i < b; i++) sum++;
        System.out.println("Sum using loops: " + sum);

        // 5. Using Math.addExact()
        System.out.println("Sum using Math.addExact: " + Math.addExact(10, 20));


        //Find square root without MATH.sqrt()
        System.out.print("Enter a number: ");
        double num = sc.nextDouble();

        double guess = num / 2;
        double epsilon = 0.0001;

        while (Math.abs(guess * guess - num) > epsilon) {
            guess = (guess + num / guess) / 2;
        }

        System.out.println("Square root: " + guess);

    }
}
