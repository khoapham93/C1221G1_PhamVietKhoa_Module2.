package services.impl;

import models.facility.Facility;
import models.facility.House;
import services.IFacilityService;
import utils.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class HouseServiceImpl implements IFacilityService {
    private static List<Facility> houseList = new ArrayList<>();
    private static final String HOUSE_SOURCE_FILE = "src\\data\\house.csv";

    static {
        houseList = ReadAndWriteFile.readHouseListFromCSV(HOUSE_SOURCE_FILE);
    }

    @Override
    public List<Facility> getList() {
        return houseList;
    }

    @Override
    public void add(Facility object) {
        houseList.add(object);
        ReadAndWriteFile.writeAllFacilityTypeToCSV(HOUSE_SOURCE_FILE, houseList);
    }
}
