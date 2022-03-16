package controllers.impl;

import enums.RentalType;
import models.facility.Facility;
import models.facility.House;
import models.facility.Room;
import models.facility.Villa;
import services.IFacilityService;
import services.impl.FacilityServiceImpl;

import java.util.Map;
import java.util.Scanner;

public class FacilityController {
    private String id;
    private String name;
    private double usableFloorArea;
    private double rentalCost;
    private int maximumPeople;
    private RentalType rentalType;
    //House
    private String standardOfRoom;
    private int numberOfFloor;
    //Room
    private String freeServiceIncluded;
    Scanner scanner = new Scanner(System.in);
    //Villa
    private double poolArea;

    IFacilityService facilityService = new FacilityServiceImpl();

    public void addNewHouse() {
        System.out.println("Add new house:");
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
        facilityService.add(house);
        System.out.println("House added!");
    }

    public void addNewRoom() {
        System.out.println("Add new Room:");
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

        facilityService.add(room);
        System.out.println("Room added!");
    }

    public void addNewVilla(){
        System.out.println("Add new villa:");
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
        facilityService.add(villa);
        System.out.println("Villa added!");
    }

    public void display(){

        for (Map.Entry<Facility,Integer> facility:facilityService.getFacilityMap().entrySet()){
            System.out.println("Facility: "+facility.getKey()+"Times of used: "+facility.getValue());
        }
    }
    private void addNewCommonInfor() {
        id = getIdFromInput();
        name = getNameFromInput();
        usableFloorArea = getFloorAreaFromInput();
        rentalCost = getRentalCostFromInput();
        maximumPeople = getMaximumPeopleFromInput();
        rentalType = getRentalTypeFromInput();
    }

    private double getPoolAreaFromInput() {
        System.out.print("Pool area: ");
        double poolArea = Double.parseDouble(scanner.nextLine());
        return poolArea;
    }

    private String getFreeServiceIncludedFromInput() {
        System.out.print("Free service included: ");
        String freeServiceIncluded = scanner.nextLine();
        return freeServiceIncluded;
    }

    private int getNumberOfFloorFromInput() {
        System.out.print("Number of floor: ");
        int numberOfFloor = Integer.parseInt(scanner.nextLine());
        return numberOfFloor;
    }

    private String getStandardOfRoomFromInput() {
        System.out.print("standard of room: ");
        String standardOfRoom = scanner.nextLine();
        return standardOfRoom;
    }

    private RentalType getRentalTypeFromInput() {
        System.out.println("Rental type:");
        int index = 0;
        for (RentalType rentalType : RentalType.values()) {
            System.out.println(index++ + ". " + rentalType);
        }
        System.out.print("Enter your choice: ");
        String choice = scanner.nextLine();
        int positionIndex = Integer.parseInt(choice);
        return RentalType.values()[positionIndex];
    }

    private int getMaximumPeopleFromInput() {
        System.out.print("Rental cost: ");
        int maximumPeople = Integer.parseInt(scanner.nextLine());
        return maximumPeople;
    }

    private double getRentalCostFromInput() {
        System.out.print("Rental cost: ");
        double rentalCost = Double.parseDouble(scanner.nextLine());
        return rentalCost;
    }

    private double getFloorAreaFromInput() {
        System.out.print("Floor area: ");
        double floorArea = Double.parseDouble(scanner.nextLine());
        return floorArea;
    }

    private String getNameFromInput() {
        System.out.print("Name: ");
        String name = scanner.nextLine();
        return name;
    }

    private String getIdFromInput() {
        System.out.print("Id: ");
        String id = scanner.nextLine();
        return id;
    }
}
