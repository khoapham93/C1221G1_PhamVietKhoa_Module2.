package oop_collection_exception_regex_review.manager_vehicle_save_to_file.services.impl;

import oop_collection_exception_regex_review.manager_vehicle_save_to_file.models.Car;
import oop_collection_exception_regex_review.manager_vehicle_save_to_file.models.Vehicle;
import oop_collection_exception_regex_review.manager_vehicle_save_to_file.services.IService;
import oop_collection_exception_regex_review.manager_vehicle_save_to_file.util.ReadAndWriteFile;
import oop_collection_exception_regex_review.manager_vehicle_save_to_file.util.Validation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarServiceImpl extends VehicleServiceImpl implements IService {
    private static List<Vehicle> cars;

    private static List<String> carTypeList = new ArrayList<>();
    private static final String CAR_SOURCE_FILE = "src\\oop_collection_exception_regex_review\\manager_vehicle_save_to_file\\data\\Car.csv";

    static {
        cars = ReadAndWriteFile.readCarListFromCSV(CAR_SOURCE_FILE);
        carTypeList.add("Travel car");
        carTypeList.add("Bus");
    }

    @Override
    public void add() {
        System.out.println("Add new Car");
        //Nhập carType
        String carType = selectCarType();
        //Nhập LiscesePlate
        String licensePlate = checkLicensePlate(carType);
        super.addNewVehicle();
        int seat = -1;
        do {
            System.out.print("Seats: ");
            String seatInput = scanner.nextLine();
            if (Validation.checkPositiveInteger(seatInput)) {
                seat = Integer.parseInt(seatInput);
                if (seat > 0 && seat < 55) {
                    break;
                }
            }
        } while (true);

        Car car = new Car(licensePlate, super.manufacturer, super.productionYear, super.owner, seat, carType);
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

    private static String selectCarType() {
        Scanner scanner = new Scanner(System.in);
        String choose = null;
        int index = -1;
        System.out.println("Car type: ");
        for (int i = 0; i < carTypeList.size(); i++) {
            System.out.println((i) + ". " + carTypeList.get(i));
        }

        do {
            System.out.print("Enter your choice: ");
            choose = scanner.nextLine();
            if (Validation.checkPositiveInteger(choose)) {
                index = Integer.parseInt(choose);
                if (index < 2) {
                    break;
                }
            }
        } while (true);
        return carTypeList.get(index);
    }

    private static String checkLicensePlate(String carType) {
        Scanner scanner = new Scanner(System.in);
        String licensePlate = null;
        boolean check = false;
        do {
            System.out.print("License plate: ");
            licensePlate = scanner.nextLine();
            switch (carType) {
                case "Travel car": {
                    if (Validation.checkLicensePlateTravelCar(licensePlate)) {
                        if (!checkExistLicensePlate(licensePlate)) {
                            check = true;
                        } else {
                            System.out.println("License plate existed!");
                        }
                    }
                    break;
                }
                case "Bus": {
                    if (Validation.checkLicensePlateBus(licensePlate)) {
                        if (!checkExistLicensePlate(licensePlate)) {
                            check = true;
                        } else {
                            System.out.println("License plate existed!");
                        }
                    }
                    break;
                }
            }
        } while (!check);
        return licensePlate;
    }

    private static boolean checkExistLicensePlate(String licensePlate) {
        for (Vehicle vehicle : cars) {
            if (vehicle.getLicensePlate().equals(licensePlate)) {
                return true;
            }
        }
        return false;
    }
}
