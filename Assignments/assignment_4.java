package Assignments;

import java.util.Scanner;

//Swap the numbers
public class assignment_4 {

    static void Swap1(int a,int b){
        int temp=a;
            a=b;
            b=temp;

        System.out.println("\n--- After Swaping --- with Swap1" );
        System.out.println("First Number is : "+a );
        System.out.println("Second Number is : "+b );
    }

    static void Swap2(int a,int b){
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("\n--- After Swaping --- with Swap2" );
        System.out.println("First Number is : "+a );
        System.out.println("Second Number is : "+b );
    }

    static void Swap3(int a,int b){
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("\n--- After Swaping --- with Swap3" );
        System.out.println("First Number is : "+a );
        System.out.println("Second Number is : "+b );
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );

        System.out.print("Enter the First Number : " );
        int a = sc.nextInt();
        System.out.print("Enter the Second Number : " );
        int b = sc.nextInt();

        Swap1( a,b );
        Swap2( a,b );
        Swap3( a,b );
    }
}
