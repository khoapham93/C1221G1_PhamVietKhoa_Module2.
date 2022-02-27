package oop_review.bai_3_manager_employee;

public class CanBo {
    private String name;
    private int birthday;
    private String gender;
    private String address;

    public CanBo(String name, int birthday, String gender, String address) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.address = address;
    }

    public CanBo() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'';
    }
}
