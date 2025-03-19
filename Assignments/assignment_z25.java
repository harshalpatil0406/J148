package Assignments;

import java.util.Arrays;

//Sort in alphabetical order
public class assignment_z25 {
    public static void main(String[] args) {

        String[] strings = {"banana", "apple", "cherry","aappe"};
        String[] arr = Arrays.copyOf( strings,strings.length );

        for (int i = 0; i < strings.length - 1; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                if (strings[i].compareTo(strings[j]) > 0) {
                    String temp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = temp;
                }
            }
        }

        System.out.println("Sorted Strings are - 1 : " );
        for (String s:strings){
            System.out.print(s+" ");
        }

        //Using Built in Method
        Arrays.sort( arr );
        System.out.println("\nSorted Strings are - 2 : " );
        System.out.println(Arrays.toString( arr ) );
    }
}
