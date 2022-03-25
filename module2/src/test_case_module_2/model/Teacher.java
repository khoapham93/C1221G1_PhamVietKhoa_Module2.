package test_case_module_2.model;

import java.time.LocalDate;

public class Teacher extends Person{

    public Teacher(int id, String code, String name, LocalDate birthday, String gender, String phone) {
        super(id, code, name, birthday, gender, phone);
    }
    public Teacher(){

    }


    @Override
    public String toString() {

        return "Teacher: " +super.toString();
    }
}
