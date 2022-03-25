package test_case_module_2.service;

import test_case_module_2.model.Person;

import java.util.List;

public interface ITeacherService{
    List<Person> getList();
    void display();
}
