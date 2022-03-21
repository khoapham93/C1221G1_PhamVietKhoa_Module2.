package services;

import models.Booking;
import models.person.Person;

import java.util.List;
import java.util.Set;

public interface IPromotionService {
    Set<Person> getCustomerBookingInYear(int year);

    void giveVoucher(int tenPercentOff, int twentyPercentOff, int fiftyPercentOff, Set<Booking> bookingInCurrentMonth);

}
