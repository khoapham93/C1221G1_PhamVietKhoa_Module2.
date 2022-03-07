package controllers;

import services.IService;
import services.impl.EmployeeServiceImpl;

public class EmployeeController extends PersonalCommonInforController{
    private String employeeId;
    private String academicLevel;
    private String position;
    private double salary;

    static IService employeeService = new EmployeeServiceImpl();

}
