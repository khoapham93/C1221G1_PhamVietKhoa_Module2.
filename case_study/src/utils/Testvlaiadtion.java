package utils;

import models.person.Person;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Testvlaiadtion {
    private static Scanner scannerTest = new Scanner(System.in);
    private static final String POSITIVE_DOUBLE_REGEX = "^[+]?(\\d*\\.)?\\d+$";

    public static void main(String[] args) {

        int[] arr = new int[10];
        System.out.println(arr[5]);

//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        String current1 = "22/02/2021";
//        LocalDate a = LocalDate.parse(current1,formatter);
//
//
//        System.out.println(a.getMonthValue());

//        LocalDate Pass100 = current.minusYears(100);
//        LocalDate Pass18 = current.minusYears(18);
//        System.out.print("Enter date Time (dd/mm/yyyy) ");
//        LocalDate date = Validation.checkDateTimeFromInput(current);
//        System.out.println(date.format(formatter));
//        System.out.print("Enter date Time (dd/mm/yyyy) greater than 18 y less than 100 ");
//        LocalDate date2 = Validation.checkDateTimeFromInput(Pass100,Pass18);
//        System.out.println(date2.format(formatter));

        //System.out.println(Boolean.valueOf(temp));
//        System.out.print("Floor area: ");
//        String input = scannerTest.nextLine();
//        double floorArea = checktemp(input,
//                "Invalid Floor area, please try again: ");
//        System.out.println(floorArea);
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
            if (checkGreaterThan30 > 30.0) {
                break;
            } else {
                System.out.print("Number must be greater than 30, try again: ");
                regex = scannerTest.nextLine();
                temp = checkDouble(regex, message);
                checkGreaterThan30 = Double.parseDouble(temp);
            }

        }
        return checkGreaterThan30;
    }
}
