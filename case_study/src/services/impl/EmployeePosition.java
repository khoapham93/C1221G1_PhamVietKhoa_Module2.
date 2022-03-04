package services.impl;

import java.util.ArrayList;

public class EmployeePosition {
    private static ArrayList<String> employeePositionList = new ArrayList<>();
    static {
        employeePositionList.add("Lễ tân");
        employeePositionList.add("Phục vụ");
        employeePositionList.add("Chuyên viên");
        employeePositionList.add("Giám sát");
        employeePositionList.add("Quản lý");
        employeePositionList.add("Giám đốc");
    }

    public void display(){
        for (int i = 0; i < employeePositionList.size(); i++) {
            System.out.println(i+". "+employeePositionList.get(i));
        }
    }
}
