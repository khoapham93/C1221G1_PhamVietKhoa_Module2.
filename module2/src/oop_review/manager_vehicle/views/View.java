package oop_review.manager_vehicle.views;

import oop_review.manager_vehicle.controllers.VehicleController;

public class View {
    public static void main(String[] args) {
        VehicleController vehicleController = new VehicleController();
        vehicleController.mainMenu();
    }
}
