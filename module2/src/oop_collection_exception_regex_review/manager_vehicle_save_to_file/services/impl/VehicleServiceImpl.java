package oop_collection_exception_regex_review.manager_vehicle_save_to_file.services.impl;

import oop_collection_exception_regex_review.manager_vehicle_save_to_file.models.Manufacturer;
import oop_collection_exception_regex_review.manager_vehicle_save_to_file.models.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleServiceImpl {
    protected Scanner scanner = new Scanner(System.in);
    protected String licensePlate;
    protected Manufacturer manufacturer;
    protected int productionYear;
    protected String owner;

    protected void addNewVehicle() {
        System.out.print("License plate: ");
        licensePlate = scanner.nextLine();
        System.out.println("Manufacturer: ");
        ManufacturerServiceImpl.displayManufacturerName();
        System.out.print("Manufacturer index (invalid value will return Yamaha): ");
        int manufacturerIndex = Integer.parseInt(scanner.nextLine());
        manufacturer = ManufacturerServiceImpl.getManufacturerByIndex(manufacturerIndex);
        System.out.print("Year of production: ");
        productionYear = Integer.parseInt(scanner.nextLine());
        System.out.print("Owner: ");
        owner = scanner.nextLine();
    }

    protected void display(List<Vehicle> vehicleArrayList, String typeOfVehicle) {
        if (vehicleArrayList.size() == 0) {
            System.out.println("There's no " + typeOfVehicle + " in list!");
        } else {
            for (Vehicle vehicle : vehicleArrayList) {
                System.out.println(vehicle);
            }
        }
    }

    protected boolean remove(String licensePlate, List<Vehicle> vehicleList) {
        for (Vehicle vehicle : vehicleList) {
            if (vehicle.getLicensePlate().equals(licensePlate)){
                System.out.print("Are you sure want to remove vehicle has license plate: " + licensePlate + " (Y/N)");
                String choose = scanner.nextLine();
                if (choose.equals("Y")) {
                    vehicleList.remove(vehicle);
                    return true;
                }
            }
        }
        return false;
    }

}
