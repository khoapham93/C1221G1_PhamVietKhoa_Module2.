package services.impl;

import java.util.ArrayList;

public class AcademicLevel {
   private static ArrayList<String> acadmicList = new ArrayList<>();
    static {
        acadmicList.add("Trung cấp");
        acadmicList.add("Cao đẳng");
        acadmicList.add("Đại học");
        acadmicList.add("Sau đại học");
    }
    
    public void display(){
        for (int i = 0; i < acadmicList.size(); i++) {
            System.out.println(i+". "+acadmicList.get(i));
        }
    }
}
