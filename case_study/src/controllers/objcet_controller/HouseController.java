package controllers.objcet_controller;

import models.facility.Facility;
import models.facility.House;
import services.IFacilityService;
import services.impl.HouseServiceImpl;

import java.util.List;

public class HouseController extends FacilityCommonInforController {

    IFacilityService houseService = new HouseServiceImpl();

    public void add() {
        System.out.println("Add new house:");
        id = getHouseIdFromInput();
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

    public void display() {
        System.out.println("------HOUSE LIST--------");
        super.display(houseService.getList(), "House");
    }

    public List<Facility> getList() {
        return houseService.getList();
    }

}
