package services.impl;

import models.person.Person;
import services.IPersonService;

import java.util.LinkedList;
import java.util.List;

public class CustomerServiceImpl implements IPersonService {
    private static List<Person> customerList = new LinkedList<>();

    public CustomerServiceImpl() {
    }

    @Override
    public void add(Person customer) {
        customerList.add(customer);
    }

    @Override
    public void edit(int index, Person object) {
        customerList.set(index,object);
    }

    @Override
    public List<Person> getList() {
        return customerList;
    }
}
