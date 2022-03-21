package utils;

import models.Booking;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;

public class BookingComparator implements Comparator<Booking> {
    @Override
    public int compare(Booking booking1, Booking booking2) {
        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate startDateBooking1 = booking1.getStartDate();
        LocalDate startDateBooking2 = booking2.getStartDate();
        LocalDate endDateBooking1 = booking1.getEndDate();
        LocalDate endDateBooking2 = booking2.getEndDate();

        if (startDateBooking1.compareTo(startDateBooking2) > 0) {
            return 1;
        } else if (startDateBooking1.compareTo(startDateBooking2) < 0) {
            return -1;
        } else {
            if (endDateBooking1.compareTo(endDateBooking2) > 0) {
                return 1;
            } else if (endDateBooking1.compareTo(endDateBooking2) < 0) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}
