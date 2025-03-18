package Assignments;

import java.util.Scanner;

//Calculate Average of marks using array
public class assignment_z20 {

    public static void main(String[] args) {
        int[] number = {12,45,34,88,99};
        int sum=0;
        for (int i=0;i<number.length;i++){
            sum+=number[i];
        }

        double avg = sum/(number.length);

        System.out.println("Average of Numbers is : "+avg );
    }

}
