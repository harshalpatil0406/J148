package Assignments;

import java.util.Scanner;

//Calculate grades of student
public class assignment_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        char grade;
        if (marks >= 90) grade = 'A';
        else if (marks >= 80) grade = 'B';
        else if (marks >= 70) grade = 'C';
        else if (marks >= 60) grade = 'D';
        else if(marks >= 50) grade = 'P';
        else grade = 'F';

        System.out.println("Grade: " + grade);
    }
}
