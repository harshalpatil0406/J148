package Assignments;

import java.util.Arrays;

//second highest and highest element in Array
public class assignment_26 {
    public static void main(String[] args) {
        int[] arr = {5,3,9,1,9,7,7};
        int highest = 0;
        int secondHighest = 0;

        for (int num : arr) {
            if (num > highest) {
                secondHighest = highest;
                highest = num;
            } else if (num > secondHighest && num!=highest) {
                secondHighest = num;
            }
        }

        System.out.println("Highest: " + highest + ", Second Highest: " + secondHighest);

        //second logic - for unique numbers
        Arrays.sort( arr );
        System.out.println("Highest : "+arr[arr.length-1]+" , Second highest : "+arr[arr.length-2] );
    }
}
