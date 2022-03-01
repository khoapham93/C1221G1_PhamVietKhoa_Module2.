package oop_review.manager_vehicle.services.impl;

import oop_review.manager_vehicle.models.Truck;
import oop_review.manager_vehicle.models.Vehicle;
import oop_review.manager_vehicle.services.IService;

import java.util.ArrayList;

public class TruckImpl extends VehicleImpl implements IService {

    private static ArrayList<Vehicle> trucks = new ArrayList<>();
    private int maximumLoad;

    @Override
    public void add() {
        System.out.println("Add new truck");
        super.addNewVehicle();
        System.out.print("maximum load: ");
        maximumLoad = Integer.parseInt(scanner.nextLine());
        Truck truck = new Truck(super.licensePlate, super.manufacturer, super.productionYear, super.owner, this.maximumLoad);
        trucks.add(truck);
    }

    @Override
    public void display() {
        super.display(trucks, "truck");
    }

    @Override
    public boolean remove(String licensePlate) {
        return super.remove(licensePlate, trucks);
    }

}
