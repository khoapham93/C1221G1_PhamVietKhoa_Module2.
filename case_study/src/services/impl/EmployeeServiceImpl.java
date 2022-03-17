package services.impl;

import enums.AcademicLevel;
import enums.CustomerType;
import enums.EmployeePosition;
import enums.Gender;
import models.person.Customer;
import models.person.Employee;
import models.person.Person;
import services.IPersonService;
import utils.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements IPersonService {

    private static List<Person> employeeList = new ArrayList<>();
    private static final String EMPLOYEE_SOURCE_FILE = "src\\data\\employee.csv";

    static {
        employeeList = ReadAndWriteFile.readEmployeeListFromCSV(EMPLOYEE_SOURCE_FILE);
//        employeeList.add(new Employee("01","Khoa","22/12/2022", Gender.Male,"212222222","0999999999","aaaaac@gmail.com", AcademicLevel.Associates, EmployeePosition.Specialist,50000));
//        employeeList.add(new Employee("02","Pham","10/12/2022", Gender.Male,"212222333","0999988888","abbbbbbb@gmail.com", AcademicLevel.Associates, EmployeePosition.Director,50000));
//        employeeList.add(new Employee("03","Uyen","09/11/2022", Gender.Female,"222111111","09999977777","acccccccc@gmail.com", AcademicLevel.Graduates, EmployeePosition.Supervisory,50000));
    }

    public EmployeeServiceImpl() {
    }

    @Override
    public void add(Person employee) {
        employeeList.add(employee);
        ReadAndWriteFile.writeAllPersonTypeToCSV(EMPLOYEE_SOURCE_FILE, employeeList);
    }

    @Override
    public void edit(int index, Person employee) {
        employeeList.set(index, employee);
        ReadAndWriteFile.writeAllPersonTypeToCSV(EMPLOYEE_SOURCE_FILE, employeeList);
    }

    @Override
    public List<Person> getList() {
        return employeeList;
    }
}
