package ss4_class_object.bai_tap.lop_phuong_trinh_bac_hai;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value:");
        double a = scanner.nextDouble();
        System.out.print("Enter b value:");
        double b = scanner.nextDouble();
        System.out.print("Enter c value:");
        double c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        System.out.println(quadraticEquation.display());
        System.out.println(quadraticEquation.answer());
    }
}
