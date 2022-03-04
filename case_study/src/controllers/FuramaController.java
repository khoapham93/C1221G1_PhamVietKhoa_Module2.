package controllers;

import java.util.Scanner;

public class FuramaController {
    static Scanner scanner = new Scanner(System.in);

    public void displayMainMenu() {
        int choice = -1;
        while (choice != 0) {
            System.out.println("-------------------------------------\n" +
                    "FURAMA RESORT MANAGEMENT PROGRAM\n" +
                    "Main menu:\n" +
                    "1. Employee Management\n" +
                    "2. Customer Management\n" +
                    "3. Facility Management \n" +
                    "4. Booking Management \n" +
                    "5. Promotion Management\n" +
                    "6. Exit");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            System.out.println();
            switch (choice) {
                case 1:
                    employeeManagement();
                    break;
                case 2:
                    customerManagement();
                    break;
                case 3:
                    facilityManagement();
                    break;
                case 4:
                    bookingManagement();
                    break;
                case 5:
                    promotionManagement();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("No choice selected");
            }
        }
    }

    public static void promotionManagement() {
        int choice = -1;
        while (choice != 0) {
            System.out.println("Promotion Management\n" +
                    "1. Display list customers use service\n" +
                    "2. Display list customers get voucher\n" +
                    "3. Return main menu");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            System.out.println();
            switch (choice) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:
                    choice = 0;
                    break;
                default:
                    System.out.println("No choice selected");
            }
        }
    }

    public static void bookingManagement() {
        int choice = -1;
        while (choice != 0) {
            System.out.println("Booking Management\n" +
                    "1. Add new booking\n" +
                    "2. Display list booking\n" +
                    "3. Create new contracts\n" +
                    "4. Display list contracts\n" +
                    "5. Edit contracts\n" +
                    "6. Return main menu");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            System.out.println();
            switch (choice) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:
                    choice = 0;
                    break;
                default:
                    System.out.println("No choice selected");
            }
        }
    }

    public static void facilityManagement() {
        int choice = -1;
        while (choice != 0) {
            System.out.println("Facility Management\n" +
                    "1. Display list facility\n" +
                    "2. Add new facility\n" +
                    "3. Display list facility maintenance\n" +
                    "4. Return main menu");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            System.out.println();
            switch (choice) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    choice = 0;
                    break;
                default:
                    System.out.println("No choice selected");
            }
        }
    }

    public static void customerManagement() {
        int choice = -1;
        while (choice != 0) {
            System.out.println("Customer Management\n" +
                    "1. Display list customers\n" +
                    "2. Add new customer\n" +
                    "3. Edit customer\n" +
                    "4. Return main menu");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            System.out.println();
            switch (choice) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    choice = 0;
                    break;
                default:
                    System.out.println("No choice selected");
            }
        }
    }

    public static void employeeManagement() {
        int choice = -1;
        while (choice != 0) {
            System.out.println("Employee Management\n" +
                    "1. Display list employees\n" +
                    "2. Add new employee\n" +
                    "3. Edit employee\n" +
                    "4. Return main menu");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            System.out.println();
            switch (choice) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    choice = 0;
                    break;
                default:
                    System.out.println("No choice selected");
            }
        }
    }
}
