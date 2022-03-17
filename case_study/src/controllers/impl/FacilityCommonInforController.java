package controllers.impl;

import enums.RentalType;
import models.facility.Facility;
import models.facility.House;
import models.facility.Room;
import models.facility.Villa;
import services.IFacilityMaintainService;
import services.impl.FacilityMaintainServiceImpl;
import utils.Validation;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FacilityCommonInforController {
    protected String id;
    protected String name;
    protected double usableFloorArea;
    protected double rentalCost;
    protected int maximumPeople;
    protected RentalType rentalType;
    //House
    protected String standardOfRoom;
    protected int numberOfFloor;
    //Room
    protected String freeServiceIncluded;
    Scanner scanner = new Scanner(System.in);
    //Villa
    protected double poolArea;

    protected void addNewCommonInfor() {
        name = getNameFromInput();
        usableFloorArea = getFloorAreaFromInput();
        rentalCost = getRentalCostFromInput();
        maximumPeople = getMaximumPeopleFromInput();
        rentalType = getRentalTypeFromInput();
    }

    public void display(List<Facility> facilityList, String typeOfFacility) {
        if (facilityList.isEmpty()) {
            System.out.println("There's no " + typeOfFacility + " in list.");
        } else {
            int i = 0;
            for (Facility facility : facilityList) {
                System.out.printf("[%d] - %s\n", i++, facility);
            }
        }
    }

    protected double getPoolAreaFromInput() {
        System.out.print("Pool area: ");
        return Validation.checkPositiveDoubleGreaterThan30(scanner.nextLine(),
                "Invalid Pool area, please try again: ");
    }

    protected String getFreeServiceIncludedFromInput() {
        System.out.print("Free service included: ");
        return Validation.checkFacilityName(scanner.nextLine(),
                "Invalid Free service included, please try again: ");
    }

    protected int getNumberOfFloorFromInput() {
        System.out.print("Number of floor: ");
        String numberOfFloor = Validation.checkIntegerGreaterThan0(scanner.nextLine(), "Invalid Number of floor, please try again: ");
        return Integer.parseInt(numberOfFloor);
    }

    protected String getStandardOfRoomFromInput() {
        System.out.print("standard of room: ");
        return Validation.checkFacilityName(scanner.nextLine(), "Invalid standard of room, please try again: ");
    }

    protected RentalType getRentalTypeFromInput() {
        System.out.println("Rental type:");
        int index = 0;
        for (RentalType rentalType : RentalType.values()) {
            System.out.println(index++ + ". " + rentalType);
        }
        int positionIndex = -1;
        do {
            positionIndex = checkTypeChoice();
            if (positionIndex > (RentalType.values().length - 1)) {
                System.out.println("Index out of range, try again.");
            } else {
                break;
            }
        } while (true);

        return RentalType.values()[positionIndex];
    }

    protected int getMaximumPeopleFromInput() {
        System.out.print("Maximum people: ");
        String maximumPeople = Validation.checkPositiveFrom1To19Integer(scanner.nextLine(),
                "Invalid Maximum people, please try again: ");

        return Integer.parseInt(maximumPeople);
    }

    protected double getRentalCostFromInput() {
        System.out.print("Rental cost: ");
        String rentalCost = Validation.checkPositiveDouble(scanner.nextLine(),
                "Invalid Rental cost, please try again: ");
        return Double.parseDouble(rentalCost);
    }

    protected double getFloorAreaFromInput() {
        System.out.print("Floor area: ");
        return Validation.checkPositiveDoubleGreaterThan30(scanner.nextLine(),
                "Invalid Floor area, please try again: ");
    }

    protected String getNameFromInput() {
        System.out.print("Name: ");
        return Validation.checkFacilityName(scanner.nextLine(), "Invalid name, please try again: ");
    }

    protected String getVillaIdFromInput() {
        System.out.print("Id: ");
        return Validation.checkVillaId(scanner.nextLine(), "Invalid Id, please try again: ");
    }

    protected String getHouseIdFromInput() {
        System.out.print("Id: ");
        return Validation.checkHouseId(scanner.nextLine(), "Invalid Id, please try again: ");
    }

    protected String getRoomIdFromInput() {
        System.out.print("Id: ");
        return Validation.checkRoomId(scanner.nextLine(), "Invalid Id, please try again: ");
    }

    protected int checkTypeChoice() {
        System.out.print("Enter your choice: ");
        String choice = Validation.checkPositiveInteger(scanner.nextLine(), "Invalid number, please try again: ");
        return Integer.parseInt(choice);
    }
}
