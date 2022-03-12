package oop_collection_exception_regex_review.manager_vehicle_save_to_file.services.impl;

import oop_collection_exception_regex_review.manager_vehicle_save_to_file.models.Manufacturer;
import oop_collection_exception_regex_review.manager_vehicle_save_to_file.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class ManufacturerServiceImpl {
    private static List<Manufacturer> manufacturers = new ArrayList<>();
    final private static String MANUFACTURER_FILE = "src\\oop_collection_exception_regex_review\\manager_vehicle_save_to_file\\data\\Manufacturer.csv";

    //    static {
//        manufacturers.add(new Manufacturer("HSX-001", "Yamaha", "Nhật Bản"));
//        manufacturers.add(new Manufacturer("HSX-002", "Honda", "Nhật Bản"));
//        manufacturers.add(new Manufacturer("HSX-003", "Dongfeng", "Trung Quốc"));
//        manufacturers.add(new Manufacturer("HSX-004", "Huyndai", "Hàn Quốc"));
//        manufacturers.add(new Manufacturer("HSX-005", "Ford", "Mỹ"));
//        manufacturers.add(new Manufacturer("HSX-006", "Toyota", "Nhật Bản"));
//        manufacturers.add(new Manufacturer("HSX-007", "Hino", "Nhật Bản"));
//    }

    static {
        manufacturers = ReadAndWriteFile.readManufacturerListFromCSV(MANUFACTURER_FILE);
    }

    public static void displayManufacturerName() {
        for (int i = 0; i < manufacturers.size(); i++) {
            System.out.print((i) + ". ");
            System.out.println(manufacturers.get(i).getManufacturerName());
        }
    }

    public static Manufacturer getManufacturerByIndex(int index) {
        if (index < 0 || index >= manufacturers.size()) {
            return new Manufacturer();//default
        } else {
            return manufacturers.get(index);
        }
    }

    public static Manufacturer getManufacturerByName(String name) {
        for (Manufacturer manufacturer : manufacturers) {
            if (manufacturer.getManufacturerName().equals(name)) {
                return manufacturer;
            }
        }
        return new Manufacturer();
    }
}
