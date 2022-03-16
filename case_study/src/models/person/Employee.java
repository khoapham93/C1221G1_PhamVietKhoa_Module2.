package models.person;

import enums.AcademicLevel;
import enums.EmployeePosition;
import enums.Gender;

public class Employee extends Person{

    private AcademicLevel academicLevel;
    private EmployeePosition position;
    private double salary;

    public Employee(String id, String fullName, String birthday, Gender gender, String identityCard, String phoneNumber, String email, AcademicLevel academicLevel, EmployeePosition position, double salary) {
        super(id, fullName, birthday, gender, identityCard, phoneNumber, email);
        this.academicLevel = academicLevel;
        this.position = position;
        this.salary = salary;
    }


    public Employee() {

    }

    public AcademicLevel getAcademicLevel() {
        return academicLevel;
    }

    public void setAcademicLevel(AcademicLevel academicLevel) {
        this.academicLevel = academicLevel;
    }

    public EmployeePosition getPosition() {
        return position;
    }

    public void setPosition(EmployeePosition position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                super.toString()+
                ", academicLevel: " + academicLevel +
                ", position: " + position +
                ", salary: " + salary +
                '}';
    }
}
