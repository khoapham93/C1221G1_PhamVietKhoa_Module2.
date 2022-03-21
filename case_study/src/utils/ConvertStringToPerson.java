package utils;

import enums.AcademicLevel;
import enums.CustomerType;
import enums.EmployeePosition;
import enums.Gender;
import models.person.Customer;
import models.person.Employee;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ConvertStringToPerson {
    private static String id;
    private static String fullName;
    private static LocalDate birthday;
    private static Gender gender;
    private static String identityCard;
    private static String phoneNumber;
    private static String email;

    private static void convertStringToPerson(String[] array) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        if (array.length != 0) {
            id = array[0];
            fullName = array[1];
            birthday = LocalDate.parse(array[2], formatter);
            gender = Gender.valueOf(array[3]);
            identityCard = array[4];
            phoneNumber = array[5];
            email = array[6];
        }
    }

    public static Employee convertStringToEmployee(String[] array) {
        convertStringToPerson(array);

        AcademicLevel academicLevel = AcademicLevel.valueOf(array[7]);
        EmployeePosition position = EmployeePosition.valueOf(array[8]);
        double salary = Double.parseDouble(array[9]);

        return new Employee(id, fullName, birthday, gender, identityCard, phoneNumber, email, academicLevel, position, salary);
    }

    public static Customer convertStringToCustomer(String[] array) {
        convertStringToPerson(array);

        CustomerType custumerType = CustomerType.valueOf(array[7]);
        String address = array[8];

        return new Customer(id, fullName, birthday, gender, identityCard, phoneNumber, email, custumerType, address);
    }
}
