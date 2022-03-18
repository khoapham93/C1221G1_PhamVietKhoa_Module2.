package services.impl;

import enums.RentalType;
import models.facility.Facility;
import models.facility.House;
import models.facility.Room;
import models.facility.Villa;
import services.IFacilityMaintainService;

import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityMaintainServiceImpl implements IFacilityMaintainService {
    private static Map<Facility, Integer> facilityMap = new LinkedHashMap<>();

    static {
        facilityMap.put(new House("SVHO-0002","House 1",50.0,400000.0,3, RentalType.Day,"Normal",2),5);
        facilityMap.put(new House("SVHO-0003","House 2",60,400000.0,3, RentalType.Month,"Normal",2),4);
        facilityMap.put(new Room("SVRO-0003","Room 1",31.0,600000.0,2,RentalType.Day,"Breakfast"),6);
        facilityMap.put(new Room("SVRO-0004","Room 2",40,600000.0,2,RentalType.Month,"Breakfast"),3);
        facilityMap.put(new Villa("SVVL-0005","Villa 1",35.0,5000000.0,15,RentalType.Year,"Vip",36.0,3),10);
        facilityMap.put(new Villa("SVVL-0006","Villa 2",45,5000000.0,15,RentalType.Year,"Vip",36.0,3),20);
    }

    public FacilityMaintainServiceImpl() {
    }

    @Override
    public void add(Facility facility) {
        facilityMap.put(facility, 0);
    }

    public void display() {
        for (Map.Entry<Facility, Integer> facility : facilityMap.entrySet()) {
            if (facility.getValue() >= 5) {
                System.out.println(facility.getKey() + " - Times used: " + facility.getValue());
            }
        }
    }

    @Override
    public Map<Facility, Integer> getFacilityMap() {
        return facilityMap;
    }
}
