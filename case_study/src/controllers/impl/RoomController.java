package controllers.impl;

import controllers.IFacilityController;
import models.facility.House;
import models.facility.Room;
import services.IFacilityService;
import services.impl.HouseServiceImpl;
import services.impl.RoomServiceImpl;

public class RoomController extends FacilityCommonInforController implements IFacilityController {

    IFacilityService roomService = new RoomServiceImpl();

    public void add() {
        System.out.println("Add new Room:");
        id = getRoomIdFromInput();
        addNewCommonInfor();
        freeServiceIncluded = getFreeServiceIncludedFromInput();
        Room room = new Room(
                id,
                name,
                usableFloorArea,
                rentalCost,
                maximumPeople,
                rentalType,
                freeServiceIncluded);

        roomService.add(room);
        System.out.println("Room added!");
    }
    public void display(){
        System.out.println("------ROOM LIST--------");
        super.display(roomService.getList(),"Room");
    }

}