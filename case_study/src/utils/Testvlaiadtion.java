package utils;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Testvlaiadtion {
    private static Scanner scannerTest = new Scanner(System.in);
    private static final String POSITIVE_DOUBLE_REGEX = "^[+]?(\\d*\\.)?\\d+$";

    public static void main(String[] args) {
        System.out.print("Floor area: ");
        String input = scannerTest.nextLine();
        double floorArea = checktemp(input,
                "Invalid Floor area, please try again: ");
        System.out.println(floorArea);
    }
    private static String regexStringFromPattern(String pattern, String inputString, String message) {
        do {
            if (Pattern.matches(pattern, inputString)) {
                break;
            } else {
                System.out.print(message);
                inputString = scannerTest.nextLine();
            }
        } while (true);

        return inputString;
    }
    private static String checkDouble(String regex, String message) {
        return regexStringFromPattern(POSITIVE_DOUBLE_REGEX, regex, message);
    }

    private static double checktemp(String regex, String message) {
        String temp = checkDouble(regex, message);
        double checkGreaterThan30 = Double.parseDouble(temp);
        while (true) {
            if (checkGreaterThan30 >30.0){
                break;
            }else {
                System.out.print("Number must be greater than 30, try again: ");
                regex = scannerTest.nextLine();
                temp = checkDouble(regex, message);
                checkGreaterThan30 = Double.parseDouble(temp);
            }

        }
        return checkGreaterThan30;
    }
}
