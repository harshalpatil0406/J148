package Assignments;

import java.util.Scanner;

//Add two Matrix
public class assignment_z24 {
    public static void main(String[] args) {
        int[][] m1 = {{1,1},{2,2}};
        int[][] m2 = {{2,2},{3,3}};

        int[][] result = new int[2][2];

        System.out.println("First Matrix : " );
        for (int ele[]:m1){
            for (int e:ele){
                System.out.print(e+" " );
            }
            System.out.println();
        }

        System.out.println("\nSecond Matrix : " );
        for (int ele[]:m2){
            for (int e:ele){
                System.out.print(e+" " );
            }
            System.out.println();
        }


        //logic to add two matrices
        for(int i=0;i<2;i++){
            for (int j=0;j<2;j++){
                result[i][j]=m1[i][j]+m2[i][j];
            }
        }

        System.out.println("\nAddition of Matrices is : " );
        for (int ele[]:result){
            for (int e:ele){
                System.out.print(e+" " );
            }
            System.out.println();
        }

    }
}
