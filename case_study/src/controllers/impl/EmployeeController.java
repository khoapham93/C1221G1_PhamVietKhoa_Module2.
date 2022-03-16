package controllers.impl;

import enums.AcademicLevel;
import enums.EmployeePosition;
import models.person.Employee;
import services.IPersonService;
import services.impl.EmployeeServiceImpl;

public class EmployeeController extends PersonalCommonInforController {
    private AcademicLevel academicLevel;
    private EmployeePosition position;
    private double salary;

    IPersonService employeeService = new EmployeeServiceImpl();

    public void add() {
        System.out.println("Add new employee:");
        super.addNewPerson();
        academicLevel = getAcademicLevelFromInput();
        position = getPositionFromInput();
        salary = getSalaryFromInput();
        Employee employee = new Employee(
                super.id,
                super.fullName,
                super.birthday,
                super.gender,
                super.identityCard,
                super.phoneNumber,
                super.email,
                academicLevel,
                position,
                salary);
        employeeService.add(employee);
        System.out.println("Employee added!");

    }

    public void display() {
        super.display(employeeService.getList(), "Employee");
    }

    public void edit() {
        this.display();
        System.out.println("Enter index of Employee you want to edit:");
        int index = Integer.parseInt(scanner.nextLine());
        Employee editingEmployee = (Employee) employeeService.getList().get(index);
        editingEmployee = editEmployeeFromInput(editingEmployee);
        employeeService.edit(index,editingEmployee);
        System.out.println("Edit successfully!");
    }

    private Employee editEmployeeFromInput(Employee employee) {
        String menu = "[0]. id: " + employee.getId() + "\n" +
                "[1]. fullName: " + employee.getFullName() + "\n" +
                "[2]. birthday: " + employee.getBirthday() + "\n" +
                "[3]. gender: " + employee.getGender() + "\n" +
                "[4]. identityCard: " + employee.getIdentityCard() + "\n" +
                "[5]. phoneNumber: " + employee.getPhoneNumber() + "\n" +
                "[6]. email: " + employee.getEmail() + "\n" +
                "[7]. academicLevel: " + employee.getAcademicLevel() + "\n" +
                "[8]. position: " + employee.getPosition() + "\n" +
                "[9]. salary: " + employee.getSalary();
        do {
            System.out.println("Employee Information:");
            System.out.println(menu);
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 0:
                    employee.setId(super.getIdFromInput());
                    break;
                case 1:
                    employee.setFullName(super.getFullNameFromInput());
                    break;
                case 2:
                    employee.setBirthday(super.getBirthdayFromInput());
                    break;
                case 3:
                    employee.setGender(super.getGenderFromIput());
                    break;
                case 4:
                    employee.setIdentityCard(super.getIdCardFromInput());
                    break;
                case 5:
                    employee.setPhoneNumber(super.getPhoneFromInput());
                    break;
                case 6:
                    employee.setEmail(super.getEmailFromInput());
                    break;
                case 7:
                    employee.setAcademicLevel(getAcademicLevelFromInput());
                    break;
                case 8:
                    employee.setPosition(getPositionFromInput());
                    break;
                case 9:
                    employee.setSalary(getSalaryFromInput());
                    break;
                default:
                    System.out.println("No choice select!");
            }
            System.out.print("Do you want to continue editing(Y/N): ");
            String stopEdit = scanner.nextLine();
            if ("Y".equals(stopEdit.toUpperCase())){
                break;
            }
        } while (true);
        return employee;
    }

    private AcademicLevel getAcademicLevelFromInput() {
        System.out.println("Academic level:");
        int index = 0;
        for (AcademicLevel academicLevel : AcademicLevel.values()) {
            System.out.println(index++ + ". " + academicLevel);
        }
        System.out.print("Enter your choice: ");
        String choice = scanner.nextLine();
        int academicLevelIndex = Integer.parseInt(choice);
        return AcademicLevel.values()[academicLevelIndex];
    }

    private EmployeePosition getPositionFromInput() {
        System.out.println("Employee position:");
        int index = 0;
        for (EmployeePosition employeePosition : EmployeePosition.values()) {
            System.out.println(index++ + ". " + employeePosition);
        }
        System.out.print("Enter your choice: ");
        String choice = scanner.nextLine();
        int positionIndex = Integer.parseInt(choice);
        return EmployeePosition.values()[positionIndex];
    }

    private double getSalaryFromInput() {
        System.out.print("Salary: ");
        double salary = Double.parseDouble(scanner.nextLine());
        return salary;
    }
}
