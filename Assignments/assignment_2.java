package Assignments;

import java.util.Scanner;

//Calculate compound interest
public class assignment_2 {

    public static void ci(double p,double r,double n){
        double interest;
        interest = p*Math.pow(1+(r/100),n)-p;
//        System.out.println("Compound Interest is : "+interest );
        System.out.printf("Compound Interest is : %.2f",interest);
    }

    public static void main(String[] args) {
        double p,r,n;
        Scanner sc = new Scanner( System.in );

        System.out.print("Enter the principle Amount : " );
        p=sc.nextDouble();

        System.out.print("Enter the Interest Rate : " );
        r=sc.nextDouble();

        System.out.print("Enter the years : " );
        n=sc.nextDouble();

        ci(p,r,n);
    }
}
