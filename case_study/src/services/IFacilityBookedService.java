package services;

import models.facility.Facility;

import java.util.Map;

public interface IFacilityBookedService extends IService<String>{
    void add(String serviceId);
    void displayFacilityMaintain();
    Map<String,Integer> getFacilityBookedMap();
}
