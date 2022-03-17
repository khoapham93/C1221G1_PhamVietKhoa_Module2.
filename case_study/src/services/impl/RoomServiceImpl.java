package services.impl;

import models.facility.Facility;
import models.person.Person;
import services.IFacilityService;
import utils.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class RoomServiceImpl implements IFacilityService {
    private static List<Facility> roomList = new ArrayList<>();
    private static final String ROOM_SOURCE_FILE = "src\\data\\room.csv";

    static {
        roomList = ReadAndWriteFile.readRoomListFromCSV(ROOM_SOURCE_FILE);
    }

    public RoomServiceImpl() {
    }

    @Override
    public void add(Facility object) {
        roomList.add(object);
        ReadAndWriteFile.writeAllFacilityTypeToCSV(ROOM_SOURCE_FILE,roomList);
    }

    @Override
    public List<Facility> getList() {
        return roomList;
    }
}
