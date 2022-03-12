package oop_collection_exception_regex_review.manager_vehicle_save_to_file.services.impl;

import oop_collection_exception_regex_review.manager_vehicle_save_to_file.models.Car;
import oop_collection_exception_regex_review.manager_vehicle_save_to_file.models.Vehicle;
import oop_collection_exception_regex_review.manager_vehicle_save_to_file.services.IService;
import oop_collection_exception_regex_review.manager_vehicle_save_to_file.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl extends VehicleServiceImpl implements IService {
    private static List<Vehicle> cars;

    private static final String CAR_SOURCE_FILE = "src\\oop_collection_exception_regex_review\\manager_vehicle_save_to_file\\data\\Car.csv";

    static {
        cars = ReadAndWriteFile.readCarListFromCSV(CAR_SOURCE_FILE);
    }

    @Override
    public void add() {
        System.out.println("Add new Car");
        super.addNewVehicle();
        System.out.print("Car type: ");
        String carType = scanner.nextLine();
        System.out.print("Seats: ");
        int seat = Integer.parseInt(scanner.nextLine());
        Car car = new Car(super.licensePlate, super.manufacturer, super.productionYear, super.owner, seat, carType);
        cars.add(car);
        ReadAndWriteFile.writeAllVehicleTypeToCSV(CAR_SOURCE_FILE, cars);
        System.out.println("Vehicle's added!");
    }

    @Override
    public void display() {
        super.display(cars, "car");
    }

    @Override
    public boolean remove(String licensePlate) {
        if (super.remove(licensePlate, cars)) {
            ReadAndWriteFile.writeAllVehicleTypeToCSV(CAR_SOURCE_FILE, cars);
            return true;
        }
        return false;
    }

}
