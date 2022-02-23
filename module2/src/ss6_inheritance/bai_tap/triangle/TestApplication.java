package ss6_inheritance.bai_tap.triangle;

import java.util.Scanner;

public class TestApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first side of triangle: ");
        double side1 = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter the second side of triangle: ");
        double side2 = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter the third side of triangle: ");
        double side3 = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter the color of triangle: ");
        String color = scanner.nextLine();

        Triangle triangle = new Triangle(color, side1, side2, side3);
        System.out.println(triangle);

    }
}
