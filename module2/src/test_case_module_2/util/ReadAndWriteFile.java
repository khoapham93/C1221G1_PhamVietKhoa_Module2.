package test_case_module_2.util;


import test_case_module_2.model.ClassRoom;
import test_case_module_2.model.Person;
import test_case_module_2.model.Student;
import test_case_module_2.model.Teacher;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu");

    public static List<ClassRoom> readClassRoomFromCSV(String filePath) {
        List<ClassRoom> classRoomList = new ArrayList<>();
        List<String> stringList = readListStringFromCSV(filePath);
        String[] arr = null;

        if (stringList.size() != 0) {
            for (String string : stringList) {
                arr = string.split(",");
                ClassRoom classRoom = new ClassRoom(Integer.parseInt(arr[0]),arr[1],Integer.parseInt(arr[2]));
                classRoomList.add(classRoom);
            }
        }
        return classRoomList;
    }
    public static List<Person> readStudentFromCSV(String filePath) {
         int id;
         String code;
         String name;
         LocalDate birthday;
         String gender;
         String phone;
         int classRoomId;

        List<Person> studentList = new ArrayList<>();
        List<String> stringList = readListStringFromCSV(filePath);
        String[] arr = null;

        if (stringList.size() != 0) {
            for (String string : stringList) {
                arr = string.split(",");
                id = Integer.parseInt(arr[0]);
                code = arr[1];
                name = arr[2];
                birthday = LocalDate.parse(arr[3],formatter);
                gender = arr[4];
                phone = arr[5];
                classRoomId = Integer.parseInt(arr[6]);
                Student student = new Student(id,code,name,birthday,gender,phone,classRoomId);
                studentList.add(student);
            }
        }
        return studentList;
    }
    public static List<Person> readTeacherFromCSV(String filePath) {
        int id;
        String code;
        String name;
        LocalDate birthday;
        String gender;
        String phone;

        List<Person> teacherList = new ArrayList<>();
        List<String> stringList = readListStringFromCSV(filePath);
        String[] arr = null;

        if (stringList.size() != 0) {
            for (String string : stringList) {
                arr = string.split(",");
                id = Integer.parseInt(arr[0]);
                code = arr[1];
                name = arr[2];
                birthday = LocalDate.parse(arr[3],formatter);
                gender = arr[4];
                phone = arr[5];

                Teacher teacher = new Teacher(id,code,name,birthday,gender,phone);
                teacherList.add(teacher);
            }
        }
        return teacherList;
    }

    public static void writeStubentListToCSV(String filePath, List<Person> studentList) {
        List<String> stringList = new ArrayList<>();
        for (Person person : studentList) {
            stringList.add(person.getInfoToCSV());
        }
        writeListStringToCSV(filePath, stringList);
    }

    //Pattern
    private static void writeListStringToCSV(String filePath, List<String> stringList) {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String string : stringList) {
                bufferedWriter.write(string);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<String> readListStringFromCSV(String pathFile) {
        List<String> stringList = new ArrayList<>();
        try {
            File file = new File(pathFile);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }
}
