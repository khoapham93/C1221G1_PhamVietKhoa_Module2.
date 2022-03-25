package test_case_module_2.service;

import test_case_module_2.model.Person;

import java.util.List;

public interface IStudentService{
    void add(Person person);
    void delete(Person person);
    List<Person> getList();
}
