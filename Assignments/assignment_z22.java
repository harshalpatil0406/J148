package Assignments;

import java.util.Arrays;

//Sort Array in accending order
public class assignment_z22 {
    public static void main(String[] args) {

        int[] arr = {12,45,23,87,67,55};
        int[] arr1 = Arrays.copyOf( arr,arr.length );

        System.out.println("UnSorted Array : " );
        for (int e:arr){
            System.out.print(e+" ");
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("\nSorted Array -1 : " );
        for (int e:arr){
            System.out.print(e+" ");
        }

        //Using Built in method
        Arrays.sort( arr1 );
        System.out.println("\nSorted Array - 2 : " );
        for (int e:arr1){
            System.out.print(e+" ");
        }
    }
}
