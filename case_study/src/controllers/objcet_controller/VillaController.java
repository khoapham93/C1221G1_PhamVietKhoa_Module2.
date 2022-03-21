package controllers.objcet_controller;

import models.facility.Facility;
import models.facility.Villa;
import services.IFacilityService;
import services.impl.VillaServiceImpl;

import java.util.List;

public class VillaController extends FacilityCommonInforController{
    IFacilityService villaervice = new VillaServiceImpl();

    public void add() {
        System.out.println("Add new villa:");
        id = getVillaIdFromInput();
        addNewCommonInfor();
        standardOfRoom = getStandardOfRoomFromInput();
        poolArea = getPoolAreaFromInput();
        numberOfFloor = getNumberOfFloorFromInput();
        Villa villa = new Villa(
                id,
                name,
                usableFloorArea,
                rentalCost,
                maximumPeople,
                rentalType,
                standardOfRoom,
                poolArea,
                numberOfFloor);
        villaervice.add(villa);
        System.out.println("Villa added!");
    }
    public void display(){
        System.out.println("------VILLA LIST--------");
        super.display(villaervice.getList(),"Villa");
    }

    public List<Facility> getList(){
        return villaervice.getList();
    }
}
