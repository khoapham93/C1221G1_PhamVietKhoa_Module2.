package oop_collection_exception_regex_review.manager_vehicle_save_to_file.util;

import oop_collection_exception_regex_review.manager_vehicle_save_to_file.models.*;
import oop_collection_exception_regex_review.manager_vehicle_save_to_file.services.impl.ManufacturerServiceImpl;

public class ConverArrayStringToObject {
//    private static String licensePlate = null;
//    private static Manufacturer manufacturer = null;
//    private static int productionYear = -1;
//    private static String owner = null;
//
//    public static void conconvertStringToVehicle(String[] array) {
//        if (array.length != 0) {
//            licensePlate = array[0];
//            String manufacturerName = array[1];
//            manufacturer = ManufacturerServiceImpl.getManufacturerByName(manufacturerName);
//            productionYear = Integer.parseInt(array[2]);
//            owner = array[3];
//        }
//    }

    public static Manufacturer convertStringToManufacturer(String[] array) {
        if (array.length != 0) {
            String manufacturerId = array[0];
            String manufacturerName = array[1];
            String country = array[2];
            return new Manufacturer(manufacturerId, manufacturerName, country);
        } else {
            return new Manufacturer();
        }
    }

    public static Car convertStringToCar(String[] array) {
        if (array.length != 0) {
            //conconvertStringToVehicle(array);
            String licensePlate = array[0];
            String manufacturerName = array[1];
            Manufacturer manufacturer = ManufacturerServiceImpl.getManufacturerByName(manufacturerName);
            int productionYear= Integer.parseInt(array[2]);
            String owner= array[3];
            int seat = Integer.parseInt(array[4]);
            String carType = array[5];
            return new Car(licensePlate, manufacturer, productionYear, owner, seat, carType);
        } else {
            return new Car();
        }
    }

    public static Motorcycle convertStringToMotocycle(String[] array) {
        if (array.length != 0) {
            //conconvertStringToVehicle(array);
            String licensePlate = array[0];
            String manufacturerName = array[1];
            Manufacturer manufacturer = ManufacturerServiceImpl.getManufacturerByName(manufacturerName);
            int productionYear= Integer.parseInt(array[2]);
            String owner= array[3];
            int cylinderCapacity = Integer.parseInt(array[4]);
            return new Motorcycle(licensePlate, manufacturer, productionYear, owner, cylinderCapacity);
        } else {
            return new Motorcycle();
        }
    }

    public static Truck convertStringToTruck(String[] array) {
        if (array.length != 0) {
            //conconvertStringToVehicle(array);
            String licensePlate = array[0];
            String manufacturerName = array[1];
            Manufacturer manufacturer = ManufacturerServiceImpl.getManufacturerByName(manufacturerName);
            int productionYear= Integer.parseInt(array[2]);
            String owner= array[3];
            double maximumLoad = Double.parseDouble(array[4]);
            return new Truck(licensePlate, manufacturer, productionYear, owner, maximumLoad);
        } else {
            return new Truck();
        }
    }
}
