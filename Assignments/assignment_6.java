package Assignments;


import java.util.Scanner;

//calculate circumference & area of circle
public class assignment_6 {

    static class Circle {
        double radius;

        Circle(double radius) {
            this.radius = radius;
        }

        double getArea() {
            return Math.PI * radius * radius;
        }

        double getCircumference() {
            return 2 * Math.PI * radius;
        }
    }

    static class Area{
        double r;

        Area(double r){
            this.r=r;
        }

        double getArea() {
            return Math.PI * r * r;
        }

    }

    static class Circumference{
        double r;

        Circumference(double r){
            this.r=r;
        }

        double getCircumference() {
            return 2 * Math.PI * r;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

//        Circle circle = new Circle(radius);
//        System.out.println("Area: " + circle.getArea());
//        System.out.println("Circumference: " + circle.getCircumference());

        Area a = new Area( r );
        Circumference c = new Circumference( r );

        System.out.printf("Area is : %.2f",a.getArea());
        System.out.printf("\nCircumference is : %.2f",c.getCircumference() );

    }
}
