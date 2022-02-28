package oop_review.manager_vehicle;

public class TestCar {
    static CarManager carManager = new CarManager();

    public static void main(String[] args) {
        carManager.addNewCar();
        carManager.displayCar();
    }
}
