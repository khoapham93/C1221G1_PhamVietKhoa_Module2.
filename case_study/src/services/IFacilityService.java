package services;

import models.facility.Facility;

import java.util.List;

public interface IFacilityService extends IService<Facility>{
    void add(Facility object);
    List<Facility> getList();
}
