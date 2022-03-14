package oop_collection_exception_regex_review.manager_vehicle_save_to_file.controllers;

import oop_collection_exception_regex_review.manager_vehicle_save_to_file.services.IService;
import oop_collection_exception_regex_review.manager_vehicle_save_to_file.services.impl.CarServiceImpl;
import oop_collection_exception_regex_review.manager_vehicle_save_to_file.services.impl.MotorcycleServiceImpl;
import oop_collection_exception_regex_review.manager_vehicle_save_to_file.services.impl.TruckServiceImpl;
import oop_collection_exception_regex_review.manager_vehicle_save_to_file.util.NotFoundVehicelException;
import oop_collection_exception_regex_review.manager_vehicle_save_to_file.util.Validation;

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
            choice = checkTypeChoice();
            System.out.println();
            switch (choice) {
                case 1:
                    addNewVehicle();
                    break;
                case 2:
                    displayVehicle();
                    break;
                case 3:
                    try {
                        removeVehicle();
                    } catch (NotFoundVehicelException e) {
                        System.err.println(e.getMessage());
                        String backToMainMenu = "choice";
                        while (!"".equals(backToMainMenu)) {
                            System.out.println();
                            System.out.print("Press Enter to return main menu:");
                            System.out.println();
                            backToMainMenu = scanner.nextLine();
                        }
                    }
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

        choice = checkTypeChoice();
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
        choice = checkTypeChoice();
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

    public static void removeVehicle() throws NotFoundVehicelException {
        System.out.print("Enter license plate of vehicle want to remove: ");
        String licensePlateRemove = scanner.nextLine();
        boolean carRemoved = car.remove(licensePlateRemove);
        boolean truckRemoved = truck.remove(licensePlateRemove);
        boolean motorcycleRemoved = motorcycle.remove(licensePlateRemove);
        if (!carRemoved && !truckRemoved && !motorcycleRemoved) {
            throw new NotFoundVehicelException("The license plate doesn't exist!");
        }
        System.out.println();
    }

    public static int checkTypeChoice() {
        int choice = -1;
        do {
            System.out.print("Enter your choice: ");
            String choiceString = scanner.nextLine();
            if (Validation.checkPositiveInteger(choiceString)) {
                choice = Integer.parseInt(choiceString);
                break;
            }
        } while (true);
        System.out.println();
        return choice;
    }
}

