package Assignments;

import java.util.Scanner;

//find the factorial of number
public class assignment_11 {
    public static int factorial(int n){
        if(n<0){
            return -1;
        } else {
            int fact=1;

            for(int i=2;i<=n;i++){
                fact*=i;
            }

            return fact;

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );

        System.out.print("Enter the Number : " );
        int n = sc.nextInt();

        int fact = factorial( n );

        System.out.println("Factorial of "+n+" is : "+fact);
    }
}
