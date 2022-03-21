package utils;

import models.Booking;
import models.Contract;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ConvertStringToBookingAndContract {
    private static int id;
    private static LocalDate startDate;
    private static LocalDate endDate;
    private static String customerId;
    private static String facilityId;
    private static boolean status;
    //contract
    private static int contractNumber;
    private static int bookingId;
    //    private String customerId;
    private static double deposit;
    private static double totalCost;

    public static Booking convertStringToBooking(String[] array) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        if (array.length != 0) {
            id = Integer.parseInt(array[0]);
            startDate = LocalDate.parse(array[1], formatter);
            endDate = LocalDate.parse(array[2], formatter);
            customerId = array[3];
            facilityId = array[4];
            status = Boolean.valueOf(array[5]);
            return new Booking(id, startDate, endDate, customerId, facilityId, status);
        } else {
            return null;
        }
    }

    public static Contract convertStringToContract(String[] array) {
        if (array.length != 0) {
            contractNumber = Integer.parseInt(array[0]);
            bookingId = Integer.parseInt(array[1]);
            customerId = array[2];
            deposit = Double.parseDouble(array[3]);
            totalCost = Double.parseDouble(array[4]);
            return new Contract(contractNumber, bookingId, customerId, deposit, totalCost);
        } else {
            return null;
        }
    }
}
