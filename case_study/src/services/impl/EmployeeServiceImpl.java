package services.impl;

import models.Employee;
import models.Person;
import services.IEmployeeService;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements IEmployeeService {
    private static List<Employee> employeeList = new ArrayList<>();

    public EmployeeServiceImpl() {
    }

    @Override
    public void add(Employee employee) {
        employeeList.add(employee);
    }

    @Override
    public void display() {
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    public int getIndexById(String id) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getEmployeeId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void edit(Employee employee) {
        int index = employeeList.indexOf(employee);
        employeeList.set(index,employee);
    }
}
