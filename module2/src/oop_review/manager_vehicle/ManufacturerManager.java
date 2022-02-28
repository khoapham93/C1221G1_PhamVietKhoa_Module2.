package oop_review.manager_vehicle;

import java.util.ArrayList;

public class ManufacturerManager {
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
            System.out.print(manufacturers.get(i).getManufacturerId() + ": ");
            System.out.println(manufacturers.get(i).getManufacturerName());
        }
    }

    public static Manufacturer getManufacturer(String manufacturerID) {
        for (int i = 0; i < manufacturers.size(); i++) {
            if (manufacturers.get(i).getManufacturerId().equals(manufacturerID)) {
                return manufacturers.get(i);
            }
        }
        return manufacturers.get(0);//default
    }
}
