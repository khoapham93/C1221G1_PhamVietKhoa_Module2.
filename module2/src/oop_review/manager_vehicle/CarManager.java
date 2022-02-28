package oop_review.manager_vehicle;

import java.util.ArrayList;

public class CarManager extends VehicleManager {
    private static ArrayList<Car> cars = new ArrayList<>();
    private String carType;
    private int seat;

    public void addNewCar() {
        System.out.println("Add new Car");
        super.addNewVehicle();
        System.out.print("Kiểu xe: ");
        carType = scanner.nextLine();
        System.out.print("Số chỗ ngồi: ");
        seat = Integer.parseInt(scanner.nextLine());
        Car car = new Car(super.licensePlate, super.manufacturer, super.productionYear, super.owner, this.seat, this.carType);
        cars.add(car);
    }

    public void displayCar() {
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
