package test_case_module_2.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Person {
    private int id;
    private String code;
    private String name;
    private LocalDate birthday;
    private String gender;
    private String phone;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu");

    public Person(int id, String code, String name, LocalDate birthday, String gender, String phone) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.phone = phone;
    }

    public Person() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getInfoToCSV() {
        return id + "," + code + "," + name + "," + birthday.format(formatter) + "," + gender + "," + phone;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                        ", code='" + code +
                        ", name='" + name +
                        ", birthday=" + birthday.format(formatter) +
                        ", gender='" + gender +
                        ", phone='" + phone;
    }
}
