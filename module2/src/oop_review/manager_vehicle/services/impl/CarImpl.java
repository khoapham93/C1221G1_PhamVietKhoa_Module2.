package oop_review.manager_vehicle.services.impl;

import oop_review.manager_vehicle.models.Car;
import oop_review.manager_vehicle.models.Vehicle;
import oop_review.manager_vehicle.services.IService;

import java.util.ArrayList;

public class CarImpl extends VehicleImpl implements IService {
    private static ArrayList<Vehicle> cars = new ArrayList<>();
    private String carType;
    private int seat;

    @Override
    public void add() {
        System.out.println("Add new Car");
        super.addNewVehicle();
        System.out.print("Car type: ");
        carType = scanner.nextLine();
        System.out.print("Seats: ");
        seat = Integer.parseInt(scanner.nextLine());
        Car car = new Car(super.licensePlate, super.manufacturer, super.productionYear, super.owner, this.seat, this.carType);
        cars.add(car);
        System.out.println("Vehicle's added!");
    }

    @Override
    public void display() {
        super.display(cars, "car");
    }

    @Override
    public boolean remove(String licensePlate) {
        return super.remove(licensePlate, cars);
    }

}
