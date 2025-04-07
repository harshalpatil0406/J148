package Assignments;

import java.util.Scanner;

// Remove Adjacent Duplicates from String
public class assignment_z29 {

    public static String removeAdjacentDuplicates(String str) {
        if (str.length() == 0) {
            return "";
        }

        // Use a character array to store the result
        char[] chars = str.toCharArray();
        int index = 0;

        for (int i = 0; i < str.length(); i++) {
            if (index == 0 || chars[i] != chars[index - 1]) {
                chars[index] = chars[i];
                index++;
            }
        }

        String result = "";
        for (int i = 0; i < index; i++) {
            result += chars[i];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
//        String input = "aabbccddeffgghh";
        System.out.print("Enter the String : " );
        String input = sc.next();

        String result = removeAdjacentDuplicates(input);

        System.out.println("String after removing adjacent duplicates: " + result);
    }
}
