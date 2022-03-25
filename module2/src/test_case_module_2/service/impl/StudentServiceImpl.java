package test_case_module_2.service.impl;

import test_case_module_2.model.Person;
import test_case_module_2.service.IStudentService;
import test_case_module_2.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements IStudentService {
    private static List<Person> studentList = new ArrayList<>();
    private static final String STUDENT_FILE = "src\\test_case_module_2\\data\\students.csv";

    static {
        studentList = ReadAndWriteFile.readStudentFromCSV(STUDENT_FILE);
    }

    @Override
    public void delete(Person person) {
        studentList.remove(person);
        ReadAndWriteFile.writeStubentListToCSV(STUDENT_FILE, studentList);
    }

    @Override
    public List<Person> getList() {
        return studentList;
    }

    @Override
    public void add(Person person) {
        studentList.add(person);
        ReadAndWriteFile.writeStubentListToCSV(STUDENT_FILE, studentList);
    }
}
