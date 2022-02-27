package oop_review.bai_1_vehicle_information;

import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[100];
        vehicles[0] = new Vehicle("Khoa", "92F1-4400", 125, 90000000);
        vehicles[1] = new Vehicle("Thao", "92F1-4300", 125, 80000000);
        Scanner scanner = new Scanner(System.in);
        double registrationTax = 0;
        int choice = -1;
        while (choice != 0) {
            System.out.println("Main menu:\n" +
                    "1. Add vehicle\n" +
                    "2. Display registration tax of vehicles\n" +
                    "3. Exit\n");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.print("Enter vehicle information: ");
                    int index = -1;
                    for (int i = 0; i < vehicles.length; i++) {
                        if (vehicles[i] == null) {
                            index = i;
                            break;
                        }
                    }
                    if (index != -1) {
                        vehicles[index] = addNewVehicle();
                        System.out.println("The new vehicle's added!");
                    }
                    break;
                case 2:
                    System.out.printf("%-100s%s", "Vehicle information", "Registration tax\n");
                    for (Vehicle vehicle : vehicles) {
                        if (vehicle != null) {
                            registrationTax = calCulateRegistrationTax(vehicle);
                            System.out.printf("%-100s%1.2f", vehicle, registrationTax);
                            System.out.println();
                        } else {
                            break;
                        }
                    }
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("No choice selected");
            }
        }

    }

    public static double calCulateRegistrationTax(Vehicle vehicle) {
        double registrationTax = 0;

        if (vehicle.getCylinderCapacity() < 100) {
            registrationTax = vehicle.getVehiclePrice() * 0.01;
        } else if (vehicle.getCylinderCapacity() < 200) {
            registrationTax = vehicle.getVehiclePrice() * 0.03;
        } else {
            registrationTax = vehicle.getVehiclePrice() * 0.05;
        }

        return registrationTax;
    }

    public static Vehicle addNewVehicle() {
        Scanner scanner = new Scanner(System.in);
        String owner;
        String licensePlate;
        int cylinderCapacity;
        long vehiclePrice;
        boolean isValidInformation;
        System.out.println("Enter vehicle information: ");

        do {
            System.out.print("Vehicle's owner: ");
            owner = scanner.nextLine();

            System.out.print("Vehicle's license plate: ");
            licensePlate = scanner.nextLine();

            System.out.print("Vehicle's cylinder capacity: ");
            cylinderCapacity = Integer.parseInt(scanner.nextLine());

            System.out.print("Vehicle's price: ");
            vehiclePrice = Long.parseLong(scanner.nextLine());
            isValidInformation = (!owner.equals("")) && (!licensePlate.equals("")) && (cylinderCapacity > 0) && (vehiclePrice > 0);
            if (!isValidInformation) {
                System.out.println("The information of vehicle is invalid, please try again!");
            }
        } while (!isValidInformation);

        Vehicle vehicle = new Vehicle(owner, licensePlate, cylinderCapacity, vehiclePrice);

        return vehicle;
    }
}
