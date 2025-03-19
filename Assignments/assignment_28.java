package Assignments;

//counting digits  present inn number

import java.util.Scanner;

public class assignment_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        System.out.print("Enter the number : " );
        int num = sc.nextInt( );
        int count=0;

        if(num==0){
            count=1;
        } else {
            while (num > 0) {
                num = num / 10;
                count++;
            }
        }

        System.out.println("Total Number of Digits : "+count );

    }
}
