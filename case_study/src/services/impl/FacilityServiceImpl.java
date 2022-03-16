package services.impl;

import models.facility.Facility;
import services.IFacilityService;

import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityServiceImpl implements IFacilityService {
    private static Map<Facility, Integer> facilityMap = new LinkedHashMap<>();

    public FacilityServiceImpl() {
    }

    public void add(Facility facility) {
        facilityMap.put(facility, 0);
    }

    @Override
    public Map<Facility, Integer> getFacilityMap() {
        return facilityMap;
    }
}
