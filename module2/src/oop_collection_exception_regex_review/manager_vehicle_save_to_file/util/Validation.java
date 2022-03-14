package oop_collection_exception_regex_review.manager_vehicle_save_to_file.util;

import oop_collection_exception_regex_review.manager_vehicle_save_to_file.models.Vehicle;

import java.util.List;
import java.util.regex.Pattern;

public class Validation {

    //XXA-XXX.XX (X : 0÷9)
    private static final String LICENSE_PLATE_TRAVEL_CAR_REGEX = "^\\d{2}A-\\d{3}\\.\\d{2}$";
    //XXB-XXX.XX (X : 0÷9)
    private static final String LICENSE_PLATE_BUS_REGEX = "^\\d{2}B-\\d{3}\\.\\d{2}$";
    //XXC-XXX.XX (X : 0÷9)
    private static final String LICENSE_PLATE_TRUCK_REGEX = "^\\d{2}C-\\d{3}\\.\\d{2}$";
    //XX-YZ-XXX.XX (X : 0÷9, Y= (Chữ cái in hoa), Z =(0÷9) hoặc (Chữ cái in Hoa).
    private static final String LICENSE_PLATE_MOTORCYCLE_REGEX = "^\\d{2}-[A-Z](\\d|[A-Z])-\\d{3}\\.\\d{2}$";
    private static final String YEAR_REGEX = "^[+]?\\d{4}$";
    private static final String POSITIVE_INTEGER_REGEX = "^[+]?\\d+$";
    private static final String POSITIVE_DOUBLE_REGEX = "^[+]?(\\d*\\.)?\\d+$";

    //Tên Tiếng Việt có dấu \p{L}: Tất cả Các ký tự Unicode.
    //                     \p{Ll}: Các ký tự Unicode lowercase .
    //                     \p{Lu}: Các ký tự Unicode Uppercase .
    private static final String VIETNAMESE_NAME_REGEX = "^\\p{Lu}\\p{Ll}+( \\p{Lu}\\p{Ll}+)*$";

    public static boolean checkLicensePlateTravelCar(String regex) {
        return Pattern.matches(LICENSE_PLATE_TRAVEL_CAR_REGEX, regex);
    }

    public static boolean checkLicensePlateBus(String regex) {
        return Pattern.matches(LICENSE_PLATE_BUS_REGEX, regex);
    }

    public static boolean checkLicensePlateTruck(String regex) {
        return Pattern.matches(LICENSE_PLATE_TRUCK_REGEX, regex);
    }

    public static boolean checkLicensePlateMotorcycle(String regex) {
        return Pattern.matches(LICENSE_PLATE_MOTORCYCLE_REGEX, regex);
    }

    public static boolean checkYear(String regex) {
        return Pattern.matches(YEAR_REGEX, regex);
    }

    public static boolean checkPositiveInteger(String regex) {
        return Pattern.matches(POSITIVE_INTEGER_REGEX, regex);
    }

    public static boolean checkPositiveDouble(String regex) {
        return Pattern.matches(POSITIVE_DOUBLE_REGEX, regex);
    }

    public static boolean checkVietnameseName(String regex) {
        return Pattern.matches(VIETNAMESE_NAME_REGEX, regex);
    }
}
