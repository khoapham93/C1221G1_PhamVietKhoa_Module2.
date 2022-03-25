package test_case_module_2.service.impl;

import test_case_module_2.model.Person;
import test_case_module_2.service.ITeacherService;
import test_case_module_2.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class TeacherServiceImpl implements ITeacherService {
    private static List<Person> teacherList = new ArrayList<>();
    private static final String TEACHER_FILE = "src\\test_case_module_2\\data\\teachers.csv";

    static {
        teacherList = ReadAndWriteFile.readTeacherFromCSV(TEACHER_FILE);
    }

    @Override
    public List<Person> getList() {
        return teacherList;
    }

    public void display() {
        System.out.println("----Teacher List------");
        int index = 0;
        for (Person teacher : teacherList) {
            System.out.printf("[%d] - %s\n", index++, teacher);
        }
    }
    
}
