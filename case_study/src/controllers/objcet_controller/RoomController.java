package controllers.objcet_controller;

import models.facility.Facility;
import models.facility.Room;
import services.IFacilityService;
import services.impl.RoomServiceImpl;

import java.util.List;

public class RoomController extends FacilityCommonInforController {

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

    public void display() {
        System.out.println("------ROOM LIST--------");
        super.display(roomService.getList(), "Room");
    }

    public List<Facility> getList() {
        return roomService.getList();
    }

}