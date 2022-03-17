package services;

import models.person.Person;
import java.util.List;

public interface IPersonService extends IService<Person> {
    void add(Person object);
    void edit(int index, Person object);
    List<Person> getList();
}
