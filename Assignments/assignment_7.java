package Assignments;

import java.util.Scanner;

//Find ascii value of a character
public class assignment_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        System.out.println("ASCII Value is : " + (int) ch);
    }
}
