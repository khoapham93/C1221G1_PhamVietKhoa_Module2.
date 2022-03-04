package oop_review.manager_vehicle.controllers;

import oop_review.manager_vehicle.services.IService;
import oop_review.manager_vehicle.services.impl.CarServiceImpl;
import oop_review.manager_vehicle.services.impl.MotorcycleServiceImpl;
import oop_review.manager_vehicle.services.impl.TruckServiceImpl;

import java.util.Scanner;

public class VehicleController {
    static IService car = new CarServiceImpl();
    static IService truck = new TruckServiceImpl();
    static IService motorcycle = new MotorcycleServiceImpl();

    static Scanner scanner = new Scanner(System.in);

    public void mainMenu() {
        int choice = -1;
        while (choice != 0) {
            System.out.println("-------------------------------------\n" +
                    "VEHICLE MANAGEMENT PROGRAM\n" +
                    "Select function:\n" +
                    "1. Add new vehicle\n" +
                    "2. Display vehicles\n" +
                    "3. Delete vehicle\n" +
                    "4. Exit");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            System.out.println();
            switch (choice) {
                case 1:
                    addNewVehicle();
                    break;
                case 2:
                    displayVehicle();
                    break;
                case 3:
                    removeVehicle();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("No choice selected");
            }
        }
    }

    public static void addNewVehicle() {
        int choice;
        System.out.println(
                "Which vehicle do you want to add?\n" +
                        "1. Truck\n" +
                        "2. Car\n" +
                        "3. Motorcycle\n");
        System.out.print("Enter your choice: ");
        choice = Integer.parseInt(scanner.nextLine());
        System.out.println();
        switch (choice) {
            case 1:
                truck.add();
                break;
            case 2:
                car.add();
                break;
            case 3:
                motorcycle.add();
                break;
            default:
                System.out.println("No choice selected");
        }
    }

    public static void displayVehicle() {
        int choice;
        System.out.println(
                "Which vehicle do you want to display?\n" +
                        "1. Truck\n" +
                        "2. Car\n" +
                        "3. Motorcycle\n");
        System.out.print("Enter your choice: ");
        choice = Integer.parseInt(scanner.nextLine());
        System.out.println();
        switch (choice) {
            case 1:
                truck.display();
                break;
            case 2:
                car.display();
                break;
            case 3:
                motorcycle.display();
                break;
            default:
                System.out.println("No choice selected");
        }
    }

    public static void removeVehicle() {
        System.out.print("Enter license plate of vehicle want to remove: ");
        String licensePlateRemove = scanner.nextLine();
        boolean carRemoved = car.remove(licensePlateRemove);
        boolean truckRemoved = truck.remove(licensePlateRemove);
        boolean motorcycleRemoved = motorcycle.remove(licensePlateRemove);
        if (!carRemoved && !truckRemoved && !motorcycleRemoved) {
            System.out.println("There's no vehicle deleted!");
        } else {
            System.out.println("The vehicle was deleted!");
        }
        System.out.println();
    }
}

