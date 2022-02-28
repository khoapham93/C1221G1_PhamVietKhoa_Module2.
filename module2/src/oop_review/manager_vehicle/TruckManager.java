package oop_review.manager_vehicle;

import java.util.ArrayList;

public class TruckManager extends VehicleManager {

    private static ArrayList<Truck> trucks = new ArrayList<>();
    private int maximumLoad;

    public void addNewTruck() {
        System.out.println("Add new truck");
        super.addNewVehicle();
        System.out.print("Tải trọng: ");
        maximumLoad = Integer.parseInt(scanner.nextLine());
        Truck truck = new Truck(super.licensePlate, super.manufacturer, super.productionYear, super.owner, this.maximumLoad);
        trucks.add(truck);
    }

    public void displayTruck() {
        for (Truck truck : trucks) {
            System.out.println(truck);
        }
    }
}
