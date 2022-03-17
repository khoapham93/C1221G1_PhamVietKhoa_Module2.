package services.impl;

import models.facility.Facility;
import services.IFacilityService;
import utils.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class VillaServiceImpl implements IFacilityService {
    private static List<Facility> villaList = new ArrayList<>();
    private static final String VILLA_SOURCE_FILE = "src\\data\\villa.csv";
    static {
        villaList = ReadAndWriteFile.readVillaListFromCSV(VILLA_SOURCE_FILE);
    }

    @Override
    public List<Facility> getList() {
        return villaList;
    }

    @Override
    public void add(Facility object) {
        villaList.add(object);
        ReadAndWriteFile.writeAllFacilityTypeToCSV(VILLA_SOURCE_FILE,villaList);
    }
}
