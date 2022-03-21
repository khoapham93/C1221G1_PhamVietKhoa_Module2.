package services.impl;

import services.IFacilityBookedService;
import utils.ReadAndWriteFile;

import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityBookedServiceImpl implements IFacilityBookedService {
    private static Map<String, Integer> facilityBookedMap = new LinkedHashMap<>();
    private static final String FACILITY_BOOKED_SOURCE_FILE = "src\\data\\bookedFacility.csv";

    static {
        facilityBookedMap = ReadAndWriteFile.readBookedFacilityFromCSV(FACILITY_BOOKED_SOURCE_FILE);
    }

    public FacilityBookedServiceImpl() {
    }

    @Override
    public void add(String serviceId) {
        //check service id in map, if exist, increase value, else put with value =1;
        if (!facilityBookedMap.containsKey(serviceId)) {
            facilityBookedMap.put(serviceId, 1);
        } else {
            int newValue = facilityBookedMap.get(serviceId) + 1;
            facilityBookedMap.put(serviceId, newValue);
        }

        ReadAndWriteFile.writeFacilityBookedToCSV(FACILITY_BOOKED_SOURCE_FILE, facilityBookedMap);
    }

    @Override
    public void displayFacilityMaintain() {
        System.out.println("---------Facitily maintenance-----------");
        for (Map.Entry<String, Integer> facility : facilityBookedMap.entrySet()) {
            if (facility.getValue() >= 5) {
                //find service id (key) in Facility list (Room, house, villa) and display follow facility.
                System.out.println("Facility ID: " + facility.getKey() + " - Times used: " + facility.getValue());
            }
        }
    }

    @Override
    public Map<String, Integer> getFacilityBookedMap() {
        return facilityBookedMap;
    }
}
