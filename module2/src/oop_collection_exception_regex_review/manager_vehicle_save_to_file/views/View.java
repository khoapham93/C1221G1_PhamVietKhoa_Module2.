package oop_collection_exception_regex_review.manager_vehicle_save_to_file.views;

import oop_collection_exception_regex_review.manager_vehicle_save_to_file.controllers.VehicleController;

import java.util.Scanner;

public class View {
    public static void main(String[] args) {
        VehicleController vehicleController = new VehicleController();
        vehicleController.mainMenu();
    }
}
