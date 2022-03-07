package ss15_exception_debug.bai_tap.illegal_triangle_exception;

import java.util.Scanner;

public class TriangleExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first side of triangle: ");
        double side1 = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter the second side of triangle: ");
        double side2 = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter the third side of triangle: ");
        double side3 = Double.parseDouble(scanner.nextLine());
        TriangleExample triangle = new TriangleExample();

        try {
            triangle.checkSidesTriangle(side1, side2, side3);
        } catch (Exception e){
            System.err.println("Exception occured: " +e.getMessage());
        }
    }

    public void checkSidesTriangle(double side1, double side2, double side3) throws IllegalTriangleException {
        boolean isSidesOfTriangle = side1 + side2 > side3 && side3 + side2 > side1 && side1 + side3 > side2;
        if (!isSidesOfTriangle) //if sum of 2 side is less than third side then throw exception
            throw new IllegalTriangleException("Given numbers are not sides of triangle.");
        else
            System.out.println("Triangle follows the rule."); //if no exception occur
    }
}
