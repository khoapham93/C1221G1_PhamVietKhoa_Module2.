package test_case_module_2.controller;

import test_case_module_2.model.ClassRoom;
import test_case_module_2.model.Person;
import test_case_module_2.model.Student;
import test_case_module_2.service.IClassRoomService;
import test_case_module_2.service.IStudentService;
import test_case_module_2.service.impl.ClassRoomServiceImpl;
import test_case_module_2.service.impl.StudentServiceImpl;
import test_case_module_2.util.NotFoundStudentException;
import test_case_module_2.util.Validation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class StudentController {
    private int id;
    private String code;
    private String name;
    private LocalDate birthday;
    private String gender;
    private String phone;
    private int classRoomId;

    IStudentService studentService = new StudentServiceImpl();
    IClassRoomService classRoomService = new ClassRoomServiceImpl();
    Scanner scanner = new Scanner(System.in);
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu");

    public void add() {
        id = getIdFromInput();
        code = getCodeFromInput("Student code");
        name = getNameFromInput("name");
        birthday = Validation.checkDateTimeFromInput("birthday",
                LocalDate.parse("01/01/1900", formatter));
        gender = getCodeFromInput("gender");
        phone = getPhoneFromInput("phone");
        classRoomId = getClassRooID();
        Student student = new Student(id, code, name, birthday, gender, phone, classRoomId);
        studentService.add(student);
        System.out.println("Student added!");
    }

    public void display() {
        System.out.println("----------Student list---------");
        if (studentService.getList().isEmpty()) {
            System.out.println("There's no student");
        } else {
            for (Person student : studentService.getList()) {
                System.out.println(student + ", class: " + getClassNameById(((Student) student).getClassRoomId()));
            }
        }
    }

    public void delete() throws NotFoundStudentException {
        System.out.print("Enter student id: ");
        String iput = Validation.checkPositiveInteger(scanner.nextLine(), "id must be a positive number, try again: ");
        int idDelete = Integer.parseInt(iput);
        for (Person person : studentService.getList()) {
            if (person.getId() == idDelete) {
                System.out.println(person);
                String choose = checkChoose();
                if (choose.equals("y")) {
                    studentService.delete(person);
                    System.out.println("Delete successful!");
                } else {
                    System.out.println("Delete canceled!");
                }
                return;
            }

        }
        throw new NotFoundStudentException("student id doesn't exist!");
    }

    public void search() {
        System.out.print("Enter student name: ");
        String searchKey = scanner.nextLine();
        boolean check = false;
        for (Person person : studentService.getList()) {
            if (person.getName().contains(searchKey)) {
                check = true;
                System.out.println(person);
            }
        }
        if (!check) {
            System.out.println("Can't not found student");
        }
    }

    private int getIdFromInput() {
        int id = 1;
        int lastElement = studentService.getList().size() - 1;
        if (!studentService.getList().isEmpty()) {
            id = studentService.getList().get(lastElement).getId() + 1;
        }
        return id;
    }

    private String getCodeFromInput(String field) {
        System.out.printf("Enter %s: ", field);
        return Validation.checkCommonName(scanner.nextLine(), field + " invalid, please try again: ");
    }

    private String getNameFromInput(String field) {
        System.out.printf("Enter %s: ", field);
        return Validation.checkVietnameseName(scanner.nextLine(), field + " invalid, please try again: ");
    }

    private String getPhoneFromInput(String field) {
        String phone;
        boolean checkPhone = false;
        do {
            checkPhone = false;
            System.out.printf("Enter %s: ", field);
            phone = Validation.checkPhone(scanner.nextLine(), field + " invalid (10 numbers), please try again: ");
            for (Person person : studentService.getList()) {
                if (person.getPhone().equals(phone)) {
                    checkPhone = true;
                    break;
                }
            }
            if (checkPhone) {
                System.out.println("Phone exist, please try again ");
            } else {
                break;
            }
        } while (true);

        return phone;
    }

    private int getClassRooID() {
        boolean checkID = false;
        int id;
        do {
            System.out.println();
            classRoomService.display();
            System.out.println();
            System.out.print("Enter Class room id: ");
            String input = Validation.checkIntegerGreaterThan0(scanner.nextLine(), "id must be a positive number");
            id = Integer.parseInt(input);
            for (ClassRoom classRoom : classRoomService.getList()) {
                if (classRoom.getId() == id) {
                    checkID = true;
                    break;
                }
            }
            if (!checkID) {
                System.out.println("Class room id doesn't exist, try again.");
            }
        } while (!checkID);
        return id;
    }

    private String getClassNameById(int id) {
        String name = null;
        for (ClassRoom classRoom : classRoomService.getList()) {
            if (classRoom.getId() == id) {
                name = classRoom.getNameClassRoom();
                break;
            }
        }
        return name;
    }

    private String checkChoose() {
        String choose;
        do {
            System.out.print("Do you want to delete this account (Y/N):");
            choose = scanner.nextLine().toLowerCase();
            if ("y".equals(choose) || "n".equals(choose)) {
                break;
            } else {
                System.out.println("Enter Y or N");
            }
        } while (true);
        return choose;
    }
}
