package ss0_demo.manager_student;

import java.util.Scanner;

public class MainApplication {
    static ManagerStudent managerStudent = new ManagerStudent();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("Main menu\n" +
                    "1. Add student\n" +
                    "2. Display student's list\n" +
                    "3. Edit student\n" +
                    "4. Delete student" +
                    "5. Searching\n" +
                    "6. Exit");
            System.out.println("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    break;
                case 2:
                    System.out.println("Student's list: ");
                    managerStudent.displayStudentList();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("No choice selected");
            }
        }
    }
}
