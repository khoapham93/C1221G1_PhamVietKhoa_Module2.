package utils;

import models.facility.Facility;
import models.facility.House;
import models.facility.Room;
import models.facility.Villa;
import models.person.Customer;
import models.person.Employee;
import models.person.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReadAndWriteFile {

    public static List<Facility> readVillaListFromCSV(String filePath) {
        List<Facility> villaList = new ArrayList<>();
        List<String> stringList = readListStringFromCSV(filePath);
        String[] arr = null;
        if (stringList.size() != 0) {
            for (String string : stringList) {
                arr = string.split(",");
                Villa villa = CovertArrayStringToFacility.convertStringToVilla(arr);
                villaList.add(villa);
            }
        }
        return villaList;
    }

    public static List<Facility> readRoomListFromCSV(String filePath) {
        List<Facility> houseList = new ArrayList<>();
        List<String> stringList = readListStringFromCSV(filePath);
        String[] arr = null;
        if (stringList.size() != 0) {
            for (String string : stringList) {
                arr = string.split(",");
                Room room = CovertArrayStringToFacility.convertStringToRoom(arr);
                houseList.add(room);
            }
        }
        return houseList;
    }

    public static List<Facility> readHouseListFromCSV(String filePath) {
        List<Facility> houseList = new ArrayList<>();
        List<String> stringList = readListStringFromCSV(filePath);
        String[] arr = null;
        if (stringList.size() != 0) {
            for (String string : stringList) {
                arr = string.split(",");
                House house = CovertArrayStringToFacility.convertStringToHouse(arr);
                houseList.add(house);
            }
        }
        return houseList;
    }

    public static List<Person> readEmployeeListFromCSV(String filePath) {
        List<Person> employeeList = new ArrayList<>();
        List<String> stringList = readListStringFromCSV(filePath);
        String[] arr = null;
        if (stringList.size() != 0) {
            for (String string : stringList) {
                arr = string.split(",");
                Employee employee = ConvertArrayStringToPerson.convertStringToEmployee(arr);
                employeeList.add(employee);
            }
        }
        return employeeList;
    }

    public static List<Person> readCustomerListFromCSV(String filePath) {
        List<Person> customerList = new LinkedList<>();
        List<String> stringList = readListStringFromCSV(filePath);
        String[] arr = null;
        if (stringList.size() != 0) {
            for (String string : stringList) {
                arr = string.split(",");
                Customer customer = ConvertArrayStringToPerson.convertStringToCustomer(arr);
                customerList.add(customer);
            }
        }
        return customerList;
    }

    public static void writeAllFacilityTypeToCSV(String filePath, List<Facility> facilityList) {
        List<String> stringList = new ArrayList<>();
        for (Facility facility : facilityList) {
            stringList.add(facility.getInfoToCSV());
        }
        writeListStringToCSV(filePath, stringList);
    }

    public static void writeAllPersonTypeToCSV(String filePath, List<Person> personList) {
        List<String> stringList = new ArrayList<>();
        for (Person person : personList) {
            stringList.add(person.getInfoToCSV());
        }
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
