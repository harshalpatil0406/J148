package Assignments;

import java.util.Scanner;

//check given number is prime or not
public class assignment_12 {
    public static boolean isPrime(int num){
        for(int i = 2; i < num/2; ++i) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );

        System.out.print("Enter the Number : ");
        int n = sc.nextInt();

        boolean result = isPrime( n );

        if(result){
            System.out.println(n+" is Prime Number" );
        } else {
            System.out.println(n+" is not Prime Number" );
        }

    }
}
