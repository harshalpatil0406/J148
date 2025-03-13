package Assignments;


import java.util.Scanner;

//Find prime numbers between the range of N
public class assignment_9 {

    static Scanner sc = new Scanner( System.in );

    static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    static void PrimeNumbers(){
        System.out.print("Enter the Limit : " );
        int n = sc.nextInt();

        System.out.println("Prime Numbers Upto "+n+" Are :-" );
        for(int i=2;i<=n;i++){
            if(isPrime( i )){
                System.out.print(i+" " );
            }
        }
    }

    public static void main(String[] args) {
        PrimeNumbers();
    }
}
