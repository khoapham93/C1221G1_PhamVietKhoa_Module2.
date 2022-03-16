package services;

import models.person.Person;

import java.util.List;

public interface IPersonService extends IService<Person> {
    void edit(int index, Person object);
    List<Person> getList();
}
