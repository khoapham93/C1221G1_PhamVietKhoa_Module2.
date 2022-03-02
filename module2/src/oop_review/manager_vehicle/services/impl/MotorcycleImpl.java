package oop_review.manager_vehicle.services.impl;

import oop_review.manager_vehicle.models.Motorcycle;
import oop_review.manager_vehicle.models.Vehicle;
import oop_review.manager_vehicle.services.IService;

import java.util.ArrayList;

public class MotorcycleImpl extends VehicleImpl implements IService {
    private static ArrayList<Vehicle> motorcycles = new ArrayList<>();
    private int cylinderCapacity;

    @Override
    public void add() {
        System.out.println("Add new motorcycle");
        super.addNewVehicle();
        System.out.print("Cylinder capacity: ");
        cylinderCapacity = Integer.parseInt(scanner.nextLine());
        Motorcycle motorcycle = new Motorcycle(super.licensePlate, super.manufacturer, super.productionYear, super.owner, this.cylinderCapacity);
        motorcycles.add(motorcycle);
        System.out.println("Vehicle's added!");
    }

    @Override
    public void display() {
        super.display(motorcycles, "motorcycle");
    }

    @Override
    public boolean remove(String licensePlate) {
        return super.remove(licensePlate, motorcycles);
    }

}
