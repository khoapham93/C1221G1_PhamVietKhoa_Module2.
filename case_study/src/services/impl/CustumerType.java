package services.impl;

import java.util.ArrayList;

public class CustumerType {
    private static ArrayList<String> CustumerTypeList = new ArrayList<>();

    static {
        CustumerTypeList.add("Diamond");
        CustumerTypeList.add("Platinium");
        CustumerTypeList.add("Gold");
        CustumerTypeList.add("Silver");
        CustumerTypeList.add("Member");
    }

    public void display(){
        for (int i = 0; i < CustumerTypeList.size(); i++) {
            System.out.println(i+". "+CustumerTypeList.get(i));
        }
    }
}
