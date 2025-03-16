package Assignments;

import java.util.Scanner;

//check palindrom number
public class assignment_z13 {
    public static int reverseNumber(int number) {
        if (number < 0) {
            return -1;
        } else if (number == 0) {
            return 0;
        } else {
            int revnum=0;

            while (number>0){
                int digit = number % 10;
                revnum = revnum * 10 + digit;
                number /= 10;
            }
            return revnum;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );

        System.out.print("Enter the Number : " );
        int number = sc.nextInt();

        int revnum = reverseNumber( number );

        if(number==revnum){
            System.out.println(number+" is Palindrom Number" );
        } else {
            System.out.println(number+" is not Palindrom Number" );
        }

    }
}
