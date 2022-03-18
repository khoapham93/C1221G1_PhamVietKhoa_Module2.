package utils;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Validation {
    private static Scanner scannerValidate = new Scanner(System.in);

    private static final String VILLA_ID_REGEX = "^SVVL-\\d{4}$";
    private static final String HOUSE_ID_REGEX = "^SVHO-\\d{4}$";
    private static final String ROOM_ID_REGEX = "^SVRO-\\d{4}$";
    private static final String FACILITY_NAME_REGEX = "^\\p{Lu}\\p{Ll}+( \\p{Lu}\\p{Ll}+)*( [0-9]+)*$";
    private static final String YEAR_REGEX = "^[+]?\\d{4}$";
    private static final String DDMMYYYY_REGEX = "^(0?[1-9]|[12][0-9]|3[01])\\/(0?[1-9]|1[0-2])\\/\\d\\d\\d\\d$";
    private static final String POSITIVE_INTEGER_REGEX = "^[+]?\\d+$";
    private static final String INTEGER_GREATER_THAN_0_REGEX = "^[+]?[0]*[1-9][0-9]*$";
    private static final String POSITIVE_INTEGER_FROM_1_TO_19_REGEX = "^[+]?([1-9]|1[0-9])$";
    private static final String POSITIVE_DOUBLE_REGEX = "^[+]?(\\d*\\.)?\\d+$";
    private static final String EMAIL_REGEX = "^\\w+([\\.-]?\\w+)*@[a-z]+\\.(\\w+)(\\.\\w{2,3})?";
    private static final String PHONE_REGEX = "^0[1-9]\\d{8}$";
    private static final String IDCARD_REGEX = "^[1-9]\\d{8,11}$";
    private static final String ALL_STRING_NUMBER_REGEX = "^\\w+( \\w+)*$";

    //Tên Tiếng Việt có dấu \p{L}: Tất cả Các ký tự Unicode.
    //                     \p{Ll}: Các ký tự Unicode lowercase .
    //                     \p{Lu}: Các ký tự Unicode Uppercase .
    private static final String VIETNAMESE_NAME_REGEX = "^\\p{Lu}\\p{Ll}+( \\p{Lu}\\p{Ll}+)*$";

    private static String regexStringFromPattern(String pattern, String inputString, String message) {
        do {
            if (Pattern.matches(pattern, inputString)) {
                break;
            } else {
                System.out.print(message);
                inputString = scannerValidate.nextLine();
            }
        } while (true);

        return inputString;
    }

    public static String checkFacilityName(String regex, String message) {
        return regexStringFromPattern(FACILITY_NAME_REGEX, regex, message);
    }

    public static String checkAllStringAndNumber(String regex, String message) {
        return regexStringFromPattern(ALL_STRING_NUMBER_REGEX, regex, message);
    }

    public static String checkIdCard(String regex, String message) {
        return regexStringFromPattern(IDCARD_REGEX, regex, message);
    }

    public static String checkPhone(String regex, String message) {
        return regexStringFromPattern(PHONE_REGEX, regex, message);
    }

    public static String checkDayMothYearString(String regex, String message) {
        return regexStringFromPattern(DDMMYYYY_REGEX, regex, message);
    }

    public static String checkHouseId(String regex, String message) {
        return regexStringFromPattern(HOUSE_ID_REGEX, regex, message);
    }

    public static String checkRoomId(String regex, String message) {
        return regexStringFromPattern(ROOM_ID_REGEX, regex, message);
    }

    public static String checkVillaId(String regex, String message) {
        return regexStringFromPattern(VILLA_ID_REGEX, regex, message);
    }

    public static String checkYear(String regex, String message) {
        return regexStringFromPattern(YEAR_REGEX, regex, message);
    }

    public static String checkPositiveInteger(String regex, String message) {
        return regexStringFromPattern(POSITIVE_INTEGER_REGEX, regex, message);
    }

    public static String checkIntegerGreaterThan0(String regex, String message) {
        return regexStringFromPattern(INTEGER_GREATER_THAN_0_REGEX, regex, message);
    }

    public static String checkPositiveFrom1To19Integer(String regex, String message) {
        return regexStringFromPattern(POSITIVE_INTEGER_FROM_1_TO_19_REGEX, regex, message);
    }

    public static String checkPositiveDouble(String regex, String message) {
        return regexStringFromPattern(POSITIVE_DOUBLE_REGEX, regex, message);
    }

    public static double checkPositiveDoubleGreaterThan30(String regex, String message) {
        String temp = checkPositiveDouble(regex, message);
        double checkGreaterThan30 = Double.parseDouble(temp);
        while (true) {
            if (checkGreaterThan30 > 30.0) {
                break;
            } else {
                System.out.print("Number must be greater than 30, try again: ");
                regex = scannerValidate.nextLine();
                temp = checkPositiveDouble(regex, message);
                checkGreaterThan30 = Double.parseDouble(temp);
            }
        }
        return checkGreaterThan30;
    }

    public static int checkIntegerFrom0ToRange(String regex, int range, String message) {
        String temp = checkPositiveInteger(regex, message);
        int checkFrom0ToRange = Integer.parseInt(temp);
        while (true) {
            if (checkFrom0ToRange <= range) {
                break;
            } else {
                System.out.print("Number must be less than length, try again: ");
                regex = scannerValidate.nextLine();
                temp = checkPositiveInteger(regex, message);
                checkFrom0ToRange = Integer.parseInt(temp);
            }
        }
        return checkFrom0ToRange;
    }

    public static String checkVietnameseName(String regex, String message) {
        return regexStringFromPattern(VIETNAMESE_NAME_REGEX, regex, message);
    }

    public static String checkEmail(String regex, String message) {
        return regexStringFromPattern(EMAIL_REGEX, regex, message);
    }
}
