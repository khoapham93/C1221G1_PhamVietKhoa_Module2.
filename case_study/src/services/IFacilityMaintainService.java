package services;

import models.facility.Facility;

import java.util.Map;

public interface IFacilityMaintainService extends IService<Facility>{
    void add(Facility object);
    void display();
    Map<Facility,Integer> getFacilityMap();
}
