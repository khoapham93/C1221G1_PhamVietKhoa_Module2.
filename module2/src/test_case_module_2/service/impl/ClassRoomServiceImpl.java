package test_case_module_2.service.impl;

import test_case_module_2.model.ClassRoom;
import test_case_module_2.model.Person;
import test_case_module_2.service.IClassRoomService;
import test_case_module_2.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class ClassRoomServiceImpl implements IClassRoomService {
    private static List<ClassRoom> classRoomList = new ArrayList<>();
    private static final String CLASS_ROOM_FILE = "src\\test_case_module_2\\data\\batchs.csv";

    static {
        classRoomList = ReadAndWriteFile.readClassRoomFromCSV(CLASS_ROOM_FILE);
    }

    @Override
    public List<ClassRoom> getList() {
        return classRoomList;
    }

    @Override
    public void display() {
        System.out.println("-------Class room list");
        int index = 0;
        for (ClassRoom classRoom : classRoomList) {
            System.out.printf("[%d] - %s\n", index++, classRoom);
        }
    }
}
