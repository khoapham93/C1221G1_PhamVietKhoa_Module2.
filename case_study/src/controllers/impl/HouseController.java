package controllers.impl;

import controllers.IFacilityController;
import models.facility.House;
import services.IFacilityService;
import services.impl.HouseServiceImpl;

public class HouseController extends FacilityCommonInforController implements IFacilityController {

    IFacilityService houseService = new HouseServiceImpl();

    public void add() {
        System.out.println("Add new house:");
        id  = getHouseIdFromInput();
        addNewCommonInfor();
        standardOfRoom = getStandardOfRoomFromInput();
        numberOfFloor = getNumberOfFloorFromInput();
        House house = new House(
                id,
                name,
                usableFloorArea,
                rentalCost,
                maximumPeople,
                rentalType,
                standardOfRoom,
                numberOfFloor);

        houseService.add(house);
        System.out.println("House added!");
    }
    public void display(){
        System.out.println("------HOUSE LIST--------");
        super.display(houseService.getList(),"House");
    }

}
