package Assignments;

import java.util.Arrays;
import java.util.Collection;

//Reverse Array
public class assignment_21 {
    public static void main(String[] args) {
        int[] arr = {12,45,23,87,67,55};
        int[] arr1 = Arrays.copyOf( arr,arr.length );

        int left=0;
        int right=arr.length-1;

        System.out.println("Before Reversing Array");
        for(int e:arr){
            System.out.print(e+" " );
        }

        while (left<right){
            int temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }

        System.out.println("\nAfter Reversing Array - 1");
        for(int e:arr){
            System.out.print(e+" " );
        }

        //Using another logic
        int[] reversedArr = new int[arr.length];

        for (int i = 0; i < arr1.length; i++) {
            reversedArr[i] = arr1[arr1.length - 1 - i];
        }

        System.out.println("\nAfter Reversing Array - 2");
        System.out.println( Arrays.toString(reversedArr));

    }
}
