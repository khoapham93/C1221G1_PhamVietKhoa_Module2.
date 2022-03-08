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
        TriangleExample triangle = new TriangleExample();

        try {
            triangle.checkSidesTriangle(side1, side2, side3);
        } catch (IllegalTriangleException e) {
            System.err.println("Exception occured: " + e.getMessage());
        }
    }

    public void checkSidesTriangle(double side1, double side2, double side3) throws IllegalTriangleException {

        boolean isSidesOfTriangle = side1 + side2 > side3 && side3 + side2 > side1 && side1 + side3 > side2;
        boolean isNegativeNumber = side1 <= 0 || side2 <= 0 || side3 <= 0;
        if (isNegativeNumber) {
            throw new IllegalTriangleException("Triangle sides must be positive.");
        }else if (!isSidesOfTriangle) {
            throw new IllegalTriangleException("Sum of two sides must be greater than other one.");
        } else {
            System.out.println("Triangle follows the rule."); //if no exception occur
        }
    }
}
