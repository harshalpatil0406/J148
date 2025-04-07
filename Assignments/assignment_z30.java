package Assignments;

import javax.script.ScriptEngine;
import java.util.Scanner;

//Find first Unique Character
public class assignment_z30 {

    public static char findFirstUniqueCharacter(String str) {
        int[] count = new int[256];


        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }


        for (int i = 0; i < str.length(); i++) {
            if (count[str.charAt(i)] == 1) {
                return str.charAt(i);
            }
        }

        return '\0';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );

        System.out.print("Enter the String : " );
        String input = sc.next();

        char result = findFirstUniqueCharacter(input);

        if (result != '\0') {
            System.out.println("First unique character: " + result);
        } else {
            System.out.println("No unique character found.");
        }
    }
}
