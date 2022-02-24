package ss6_inheritance.bai_tap.triangle;

import java.util.Scanner;

public class TestApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double side1 = 0;
        double side2 = 0;
        double side3 = 0;
        do {
            System.out.print("Enter the first side of triangle: ");
            side1 = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the second side of triangle: ");
            side2 = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the third side of triangle: ");
            side3 = Double.parseDouble(scanner.nextLine());

            if ((side1 + side2 > side3) && (side1 + side3 > side2) && (side3 + side2 > side1)) {
                break;
            } else {
                System.out.println("3 number entered is not sides of triangle");
            }
        } while (true);

        System.out.print("Enter the color of triangle: ");
        String color = scanner.nextLine();

        Triangle triangle = new Triangle(color, side1, side2, side3);
        System.out.println(triangle);
    }
}
