package services.impl;

import models.person.Person;
import services.IPersonService;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements IPersonService {

    private static List<Person> employeeList = new ArrayList<>();

    public EmployeeServiceImpl() {
    }

    @Override
    public void add(Person employee) {
        employeeList.add(employee);
    }

    @Override
    public void edit(int index,Person employee) {
        employeeList.set(index,employee);
    }

    @Override
    public List<Person> getList() {
        return employeeList;
    }
}
