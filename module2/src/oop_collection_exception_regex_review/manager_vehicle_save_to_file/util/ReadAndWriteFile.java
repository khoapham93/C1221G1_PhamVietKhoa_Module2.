package oop_collection_exception_regex_review.manager_vehicle_save_to_file.util;

import oop_collection_exception_regex_review.manager_vehicle_save_to_file.models.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {

    // đọc ra một danh sách car
    public static List<Vehicle> readCarListFromCSV(String filePath) {
        List<Vehicle> CarList = new ArrayList<>();
        List<String> stringList = readListStringFromCSV(filePath);
        String[] arr = null;
        if (stringList.size() != 0) {
            for (String string : stringList) {
                arr = string.split(",");
                Car car = ConverArrayStringToObject.convertStringToCar(arr);
                CarList.add(car);
            }
        }
        return CarList;
    }

    public static List<Vehicle> readTruckListFromCSV(String filePath) {
        List<Vehicle> truckList = new ArrayList<>();
        List<String> stringList = readListStringFromCSV(filePath);
        String[] arr = null;
        if (stringList.size() != 0) {
            for (String string : stringList) {
                arr = string.split(",");
                Truck truck = ConverArrayStringToObject.convertStringToTruck(arr);
                truckList.add(truck);
            }
        }
        return truckList;
    }

    public static List<Vehicle> readMotocycleListFromCSV(String filePath) {
        List<Vehicle> motorcycleList = new ArrayList<>();
        List<String> stringList = readListStringFromCSV(filePath);
        String[] arr = null;
        if (stringList.size() != 0) {
            for (String string : stringList) {
                arr = string.split(",");
                Motorcycle motorcycle = ConverArrayStringToObject.convertStringToMotocycle(arr);
                motorcycleList.add(motorcycle);
            }
        }
        return motorcycleList;
    }

    public static List<Manufacturer> readManufacturerListFromCSV(String filePath) {
        List<Manufacturer> manufacturerList = new ArrayList<>();
        List<String> stringList = readListStringFromCSV(filePath);
        String[] arr = null;
        if (stringList.size() != 0){
            for (String string : stringList) {
                arr = string.split(",");
                Manufacturer manufacturer = ConverArrayStringToObject.convertStringToManufacturer(arr);
                manufacturerList.add(manufacturer);
            }
        }
        return manufacturerList;
    }

    public static void writeAllVehicleTypeToCSV(String filePath, List<Vehicle> vehicleList) {
        List<String> stringList = new ArrayList<>();
        for (Vehicle vehicle : vehicleList) {
            stringList.add(vehicle.getInfoToCSV());
        }
        // gọi phương thức dùng chung để ghi file
        writeListStringToCSV(filePath, stringList);
    }

    private static void writeListStringToCSV(String filePath, List<String> stringList) {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String string : stringList) {
                bufferedWriter.write(string);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<String> readListStringFromCSV(String pathFile) {
        List<String> stringList = new ArrayList<>();
        try {
            File file = new File(pathFile);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }
}
