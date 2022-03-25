package test_case_module_2.controller;

import test_case_module_2.service.ITeacherService;
import test_case_module_2.service.impl.TeacherServiceImpl;
import test_case_module_2.util.NotFoundStudentException;
import test_case_module_2.util.Validation;

import java.util.Scanner;

public class MainController {
    Scanner scanner = new Scanner(System.in);
    StudentController studentController = new StudentController();
    ITeacherService teacherService = new TeacherServiceImpl();

    public void mainMenu() {
        int choice = -1;
        while (choice != 0) {
            System.out.println();
            System.out.println("-------------------------------------\n" +
                    "BANKING ACCOUNT MANAGEMENT PROGRAM\n" +
                    "Main menu:\n" +
                    "1. Add new student\n" +
                    "2. Delete student\n" +
                    "3. Display student list \n" +
                    "4. Display teacher list \n" +
                    "5. searching student \n" +
                    "6. Exit");

            choice = checkTypeChoice();
            switch (choice) {
                case 1:
                    studentController.add();
                    break;
                case 2:
                    try {
                        studentController.delete();
                    } catch (NotFoundStudentException e) {
                        System.out.println(e.getMessage());
                        System.out.println();
                    }
                    break;
                case 3:
                    studentController.display();
                    break;
                case 4:
                    teacherService.display();
                    break;
                case 5:
                    studentController.search();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("No choice selected");
            }
            System.out.println();

        }
    }

    private int checkTypeChoice() {
        System.out.print("Enter your choice: ");
        String choice = Validation.checkPositiveInteger(scanner.nextLine(), "choice must be a number, please try again: ");
        return Integer.parseInt(choice);
    }
}
