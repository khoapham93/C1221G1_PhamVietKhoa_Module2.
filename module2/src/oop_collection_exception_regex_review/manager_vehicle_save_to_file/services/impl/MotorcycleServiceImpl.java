package oop_collection_exception_regex_review.manager_vehicle_save_to_file.services.impl;

import oop_collection_exception_regex_review.manager_vehicle_save_to_file.models.Motorcycle;
import oop_collection_exception_regex_review.manager_vehicle_save_to_file.models.Vehicle;
import oop_collection_exception_regex_review.manager_vehicle_save_to_file.services.IService;
import oop_collection_exception_regex_review.manager_vehicle_save_to_file.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class MotorcycleServiceImpl extends VehicleServiceImpl implements IService {
    private static List<Vehicle> motorcycles;
    private static final String MOTORCYCLE_SOURCE_FILE = "src\\oop_collection_exception_regex_review\\manager_vehicle_save_to_file\\data\\Motorcycle.csv";

    static {
        motorcycles = ReadAndWriteFile.readMotocycleListFromCSV(MOTORCYCLE_SOURCE_FILE);
    }
    @Override
    public void add() {
        System.out.println("Add new motorcycle");
        super.addNewVehicle();
        System.out.print("Cylinder capacity: ");
        int cylinderCapacity = Integer.parseInt(scanner.nextLine());
        Motorcycle motorcycle = new Motorcycle(super.licensePlate, super.manufacturer, super.productionYear, super.owner, cylinderCapacity);
        motorcycles.add(motorcycle);

        ReadAndWriteFile.writeAllVehicleTypeToCSV(MOTORCYCLE_SOURCE_FILE, motorcycles);

        System.out.println("Vehicle's added!");
    }

    @Override
    public void display() {
        super.display(motorcycles, "motorcycle");
    }

    @Override
    public boolean remove(String licensePlate) {
        if (super.remove(licensePlate, motorcycles)){
            ReadAndWriteFile.writeAllVehicleTypeToCSV(MOTORCYCLE_SOURCE_FILE, motorcycles);
            return true;
        }
        return false;
    }

}
