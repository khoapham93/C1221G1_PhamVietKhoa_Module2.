package test_case_module_2.model;

import java.time.LocalDate;

public class Student extends Person {
    private int classRoomId;

    public Student(int id, String code, String name, LocalDate birthday, String gender, String phone, int classRoomId) {
        super(id, code, name, birthday, gender, phone);
        this.classRoomId = classRoomId;
    }

    public Student() {

    }

    public int getClassRoomId() {
        return classRoomId;
    }

    public void setClassRoomId(int classRoomId) {
        this.classRoomId = classRoomId;
    }

    public String getInfoToCSV() {
        return super.getInfoToCSV() + "," + classRoomId;
    }

    @Override
    public String toString() {
        return "Student: " +
                super.toString();
    }
}
