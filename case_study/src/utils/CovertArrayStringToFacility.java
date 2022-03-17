package utils;

import enums.AcademicLevel;
import enums.EmployeePosition;
import enums.Gender;
import enums.RentalType;
import models.facility.House;
import models.facility.Room;
import models.facility.Villa;
import models.person.Employee;

public class CovertArrayStringToFacility {
    private static String id;
    private static String name;
    private static double usableFloorArea;
    private static double rentalCost;
    private static int maximumPeople;
    private static RentalType rentalType;

    private static void convertStringToFacility(String[] array) {
        if (array.length != 0) {
            id = array[0];
            name = array[1];
            usableFloorArea = Double.parseDouble(array[2]);
            rentalCost = Double.parseDouble(array[3]);
            maximumPeople = Integer.parseInt(array[4]);
            rentalType = RentalType.valueOf(array[5]);
        }
    }

    public static House convertStringToHouse(String[] array) {
        convertStringToFacility(array);
        String standardOfRoom = array[6];
        int numberOfFloor = Integer.parseInt(array[7]);
        return new House(id, name, usableFloorArea, rentalCost, maximumPeople, rentalType,
                standardOfRoom, numberOfFloor);
    }

    public static Room convertStringToRoom(String[] array) {
        convertStringToFacility(array);
        String freeServiceIncluded = array[6];
        return new Room(id, name, usableFloorArea, rentalCost, maximumPeople, rentalType, freeServiceIncluded);
    }

    public static Villa convertStringToVilla(String[] array) {
        convertStringToFacility(array);
        String standardOfRoom = array[6];
        double poolArea = Double.parseDouble(array[7]);
        int numberOfFloor = Integer.parseInt(array[8]);

        return new Villa(id, name, usableFloorArea, rentalCost, maximumPeople, rentalType,
                standardOfRoom, poolArea, numberOfFloor);
    }
}
