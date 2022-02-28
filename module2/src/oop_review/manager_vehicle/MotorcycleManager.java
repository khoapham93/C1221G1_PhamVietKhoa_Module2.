package oop_review.manager_vehicle;

import java.util.ArrayList;

public class MotorcycleManager extends VehicleManager {
    private static ArrayList<Motorcycle> motorcycles = new ArrayList<>();
    private int cylinderCapacity;

    public void addNewMotorcycle() {
        System.out.println("Add new motorcycle");
        super.addNewVehicle();
        System.out.print("Dung tích xi lanh");
        cylinderCapacity = Integer.parseInt(scanner.nextLine());
        Motorcycle motorcycle = new Motorcycle(super.licensePlate, super.manufacturer, super.productionYear, super.owner, this.cylinderCapacity);
        motorcycles.add(motorcycle);
    }

    public void displayMotorcycle() {
        for (Motorcycle motorcycle : motorcycles) {
            System.out.println(motorcycle);
        }
    }
}
