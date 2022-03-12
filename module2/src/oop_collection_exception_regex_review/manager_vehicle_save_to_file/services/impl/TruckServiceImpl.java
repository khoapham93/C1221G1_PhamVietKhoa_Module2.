package oop_collection_exception_regex_review.manager_vehicle_save_to_file.services.impl;

import oop_collection_exception_regex_review.manager_vehicle_save_to_file.models.Truck;
import oop_collection_exception_regex_review.manager_vehicle_save_to_file.models.Vehicle;
import oop_collection_exception_regex_review.manager_vehicle_save_to_file.services.IService;
import oop_collection_exception_regex_review.manager_vehicle_save_to_file.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class TruckServiceImpl extends VehicleServiceImpl implements IService {

    private static List<Vehicle> trucks;

    private static final String TRUCK_SOURCE_FILE = "src\\oop_collection_exception_regex_review\\manager_vehicle_save_to_file\\data\\Truck.csv";

    static {
        trucks = ReadAndWriteFile.readTruckListFromCSV(TRUCK_SOURCE_FILE);
    }

    @Override
    public void add() {
        System.out.println("Add new truck");
        super.addNewVehicle();
        System.out.print("maximum load: ");
        int maximumLoad = Integer.parseInt(scanner.nextLine());
        Truck truck = new Truck(super.licensePlate, super.manufacturer, super.productionYear, super.owner, maximumLoad);
        trucks.add(truck);
        ReadAndWriteFile.writeAllVehicleTypeToCSV(TRUCK_SOURCE_FILE, trucks);
        System.out.println("Vehicle's added!");
    }

    @Override
    public void display() {
        super.display(trucks, "truck");
    }

    @Override
    public boolean remove(String licensePlate) {
        if (super.remove(licensePlate, trucks)) {
            ReadAndWriteFile.writeAllVehicleTypeToCSV(TRUCK_SOURCE_FILE, trucks);
            return true;
        }
        return false;
    }

}
