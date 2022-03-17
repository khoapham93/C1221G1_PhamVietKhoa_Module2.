package services.impl;

import models.facility.Facility;
import services.IFacilityMaintainService;

import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityMaintainServiceImpl implements IFacilityMaintainService {
    private static Map<Facility, Integer> facilityMap = new LinkedHashMap<>();

    public FacilityMaintainServiceImpl() {
    }

    @Override
    public void add(Facility facility) {
        facilityMap.put(facility, 0);
    }

    public void display() {
        for (Map.Entry<Facility, Integer> facility : facilityMap.entrySet()) {
            if (facility.getValue()>=5){
                System.out.println(facility.getKey()+" - Times used"+facility.getValue());
            }
        }
    }

    @Override
    public Map<Facility, Integer> getFacilityMap() {
        return facilityMap;
    }
}
