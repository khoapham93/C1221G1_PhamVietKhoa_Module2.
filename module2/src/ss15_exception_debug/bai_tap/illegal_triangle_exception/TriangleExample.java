package ss15_exception_debug.bai_tap.illegal_triangle_exception;

import java.util.Scanner;

public class TriangleExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("First side: ");
        double side1 = Double.parseDouble(scanner.nextLine());
        System.out.print("Second side: ");
        double side2 = Double.parseDouble(scanner.nextLine());
        System.out.print("Third side: ");
        double side3 = Double.parseDouble(scanner.nextLine());
        try {
            Triangle triangle = new Triangle(side1,side2,side3);
        } catch (IllegalTriangleException e) {
            System.err.println("Exception occured: " + e.getMessage());
        }
    }

}
