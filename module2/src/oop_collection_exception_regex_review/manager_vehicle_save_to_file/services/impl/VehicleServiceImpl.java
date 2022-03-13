package oop_collection_exception_regex_review.manager_vehicle_save_to_file.services.impl;

import oop_collection_exception_regex_review.manager_vehicle_save_to_file.models.Manufacturer;
import oop_collection_exception_regex_review.manager_vehicle_save_to_file.models.Vehicle;
import oop_collection_exception_regex_review.manager_vehicle_save_to_file.util.Validation;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class VehicleServiceImpl {
    protected Scanner scanner = new Scanner(System.in);
    protected Manufacturer manufacturer;
    protected int productionYear;
    protected String owner;

    protected void addNewVehicle() {

        VehicleServiceImpl vehicleService = new VehicleServiceImpl();
        manufacturer = vehicleService.selectManufacturerFromList();

        do {
            System.out.print("Year of production: ");
            String yearString = scanner.nextLine();
            if (Validation.checkYear(yearString)){
                productionYear = Integer.parseInt(yearString);
                int currentYear = Calendar.getInstance().get(Calendar.YEAR);
                if (productionYear>=1800 && productionYear<=currentYear){
                    break;
                }
            }
        }while (true);

        do {
            System.out.print("Owner: ");
            owner = scanner.nextLine();
        } while (!Validation.checkVietnameseName(owner));

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
            if (vehicle.getLicensePlate().equals(licensePlate)) {
                System.out.println("Vehicle found: ");
                System.out.println(vehicle);
                System.out.print("Are you sure want to remove vehicle (Y/N)");
                String choose = scanner.nextLine();
                if (choose.equals("Y")) {
                    vehicleList.remove(vehicle);
                    System.out.println("The vehicle was deleted!");
                    return true;
                }
            }
        }
        return false;
    }

    private Manufacturer selectManufacturerFromList() {
        int manufacturerIndex = -1;
        do {
            System.out.println("Manufacturer: ");
            ManufacturerServiceImpl.displayManufacturerName();
            System.out.print("Manufacturer index (invalid value will return Yamaha): ");
            String indexString = scanner.nextLine();
            if (Validation.checkPositiveInteger(indexString)) {
                manufacturerIndex = Integer.parseInt(indexString);
                if (manufacturerIndex < 7) {
                    break;
                }
            }
        } while (true);
        return ManufacturerServiceImpl.getManufacturerByIndex(manufacturerIndex);
    }

}
