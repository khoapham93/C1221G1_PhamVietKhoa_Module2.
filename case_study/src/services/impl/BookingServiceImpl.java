package services.impl;

import models.Booking;
import services.IBookingService;
import services.IFacilityBookedService;
import utils.BookingComparator;
import utils.ReadAndWriteFile;

import java.util.Set;
import java.util.TreeSet;

public class BookingServiceImpl implements IBookingService {
    IFacilityBookedService facilityService = new FacilityBookedServiceImpl();
    private static Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());

    private static final String BOOKING_SOURCE_FILE = "src\\data\\booking.csv";

    static {
        bookingSet.addAll(ReadAndWriteFile.readBookingSetFromCSV(BOOKING_SOURCE_FILE));
    }

    @Override
    public void add(Booking object) {
        bookingSet.add(object);

        // add object to Map facility to count times used.
        facilityService.add(object.getFacilityId());

        ReadAndWriteFile.writeBookingToCSV(BOOKING_SOURCE_FILE, bookingSet);
    }

    //send booking unsigned
    @Override
    public Set<Booking> sendBooking() {
        Set<Booking> bookingUnsigned = new TreeSet<>(new BookingComparator());
        for (Booking booking : bookingSet) {
            if (!booking.isContractStatus()) {
                bookingUnsigned.add(booking);
            }
        }
        return bookingUnsigned;
        //send booking not create contract yet.
    }

    /**
     * update booking status (after create contract, set booking status to true)
     *  save to file
     */
    @Override
    public void updateBookingSigned() {
        for (Booking booking : bookingSet) {
            if (!booking.isContractStatus()) {
                booking.setContractStatus(true);
            }
        }
        ReadAndWriteFile.writeBookingToCSV(BOOKING_SOURCE_FILE, bookingSet);
    }

    @Override
    public Set<Booking> getBookingSet() {
        return bookingSet;
    }

}
