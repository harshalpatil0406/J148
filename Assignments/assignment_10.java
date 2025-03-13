package Assignments;

import java.util.Scanner;

//Swap without third varible
public class assignment_10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );

        System.out.print("Enter the First Number : " );
        int a = sc.nextInt();

        System.out.print("Enter the Second Number : " );
        int b = sc.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("------ After Swaping ------" );
        System.out.println("First Number is : "+a );
        System.out.println("Second Number is : "+b );
    }
}
