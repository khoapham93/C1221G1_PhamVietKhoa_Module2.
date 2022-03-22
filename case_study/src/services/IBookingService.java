package services;

import models.Booking;

import java.util.Set;

public interface IBookingService extends IService<Booking> {
    Set<Booking> getBookingSet();

    Set<Booking> sendBooking();

    void updateBookingSigned();
}
