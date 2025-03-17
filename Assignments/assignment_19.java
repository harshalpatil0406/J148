package Assignments;

import java.util.Scanner;

public class assignment_19 {

    static int factorial(int n) {
        return (n == 0) ? 1 : n * factorial(n - 1);
    }

    static int fibonacci(int n) {
        return (n <= 1) ? n : fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose (1: Factorial, 2: Fibonacci, 3: Star Pattern): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter a number: ");
                int num = sc.nextInt();
                System.out.println("Factorial: " + factorial(num));
                break;
            case 2:
                System.out.print("Enter n: ");
                int n = sc.nextInt();
                for (int i = 0; i < n; i++) System.out.print(fibonacci(i) + " ");
                break;
            case 3:
                System.out.println("Star Pattern:");
                for (int i = 1; i <= 5; i++) {
                    System.out.println("*".repeat(i));
                }
                break;
        }
    }
}
