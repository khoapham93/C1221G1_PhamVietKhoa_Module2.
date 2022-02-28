package oop_review.manager_vehicle;

import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("VEHICLE MANAGEMENT PROGRAM\n" +
                    "Select function:\n" +
                    "1. Add new vehicle\n" +
                    "2. Display vehicles\n" +
                    "3. Delete vehicle\n" +
                    "4. Exit");
            System.out.println("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    break;
                case 2:
                    System.out.println("Student's list: ");
                    //managerStudent.displayStudentList();
                    break;
                case 3:
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("No choice selected");
            }
        }
    }
}

