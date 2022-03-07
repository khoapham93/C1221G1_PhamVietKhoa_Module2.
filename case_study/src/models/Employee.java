package models;

public class Employee extends Person{
    private String employeeId;
    private String academicLevel;
    private String position;
    private double salary;

    public Employee(String fullName, String birthday, String gender, String identityCard, String phoneNumber, String email, String employeeId, String academicLevel, String position, double salary) {
        super(fullName, birthday, gender, identityCard, phoneNumber, email);
        this.employeeId = employeeId;
        this.academicLevel = academicLevel;
        this.position = position;
        this.salary = salary;
    }

    public Employee() {

    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
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
                "employeeCode: " + employeeId +", "+
                super.toString()+
                ", academicLevel: " + academicLevel +
                ", position: " + position +
                ", salary: " + salary +
                '}';
    }
}
