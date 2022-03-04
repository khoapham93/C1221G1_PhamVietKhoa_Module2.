package models;

public class Employee extends Person{
    private String employeeCode;
    private String academicLevel;
    private String position;
    private double salary;

    public Employee(String fullName, String birthday, String gender, long identityCard, long phoneNumber, String email, String employeeCode, String academicLevel, String position, double salary) {
        super(fullName, birthday, gender, identityCard, phoneNumber, email);
        this.employeeCode = employeeCode;
        this.academicLevel = academicLevel;
        this.position = position;
        this.salary = salary;
    }

    public Employee() {

    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getAcademicLevel() {
        return academicLevel;
    }

    public void setAcademicLevel(String academicLevel) {
        this.academicLevel = academicLevel;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
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
                "employeeCode: " + employeeCode +", "+
                super.toString()+
                ", academicLevel: " + academicLevel +
                ", position: " + position +
                ", salary: " + salary +
                '}';
    }
}
