package services;

import models.facility.Facility;

import java.util.Map;

public interface IFacilityService extends IService<Facility>{
    Map<Facility,Integer> getFacilityMap();
}
