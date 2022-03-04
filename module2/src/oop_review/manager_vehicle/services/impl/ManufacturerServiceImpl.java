package oop_review.manager_vehicle.services.impl;

import oop_review.manager_vehicle.models.Manufacturer;

import java.util.ArrayList;

public class ManufacturerServiceImpl {
    private static ArrayList<Manufacturer> manufacturers = new ArrayList<>();

    static {
        manufacturers.add(new Manufacturer("HSX-001", "Yamaha", "Nhật Bản"));
        manufacturers.add(new Manufacturer("HSX-002", "Honda", "Nhật Bản"));
        manufacturers.add(new Manufacturer("HSX-003", "Dongfeng", "Trung Quốc"));
        manufacturers.add(new Manufacturer("HSX-004", "Huyndai", "Hàn Quốc"));
        manufacturers.add(new Manufacturer("HSX-005", "Ford", "Mỹ"));
        manufacturers.add(new Manufacturer("HSX-006", "Toyota", "Nhật Bản"));
        manufacturers.add(new Manufacturer("HSX-007", "Hino", "Nhật Bản"));
    }

    public static void displayManufacturerName() {
        for (int i = 0; i < manufacturers.size(); i++) {
            System.out.print((i) + ". ");
            System.out.println(manufacturers.get(i).getManufacturerName());
        }
    }

    public static Manufacturer getManufacturerByIndex(int index) {
        if (index < 0 || index >= manufacturers.size()) {
            return manufacturers.get(0);//default
        } else {
            return manufacturers.get(index);
        }
    }
}
