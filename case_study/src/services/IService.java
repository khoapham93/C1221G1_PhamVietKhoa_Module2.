package services;

import models.Person;

public interface IService<E> {
    void add(E object);
    void display();
    void edit(E object);
}
