package services.impl;

import models.Booking;
import models.person.Customer;
import models.person.Person;
import services.IBookingService;
import services.IPersonService;
import services.IPromotionService;
import utils.BookingComparator;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class PromotionServiceImpl implements IPromotionService {

    IBookingService bookingService = new BookingServiceImpl();
    IPersonService customerService = new CustomerServiceImpl();

    @Override
    public Set<Person> getCustomerBookingInYear(int year) {
        Set<Booking> bookingSet = bookingService.getBookingSet();
        List<Person> customerBookingInYear = new ArrayList<>();
        for (Booking booking : bookingSet) {
            if (booking.getStartDate().getYear() == year || booking.getEndDate().getYear() == year) {
                customerBookingInYear.add(getCustomerByid(booking.getCustomerId()));
            }
        }
        Set<Person> customerBookingInYearSet = new HashSet<>();

        customerBookingInYearSet.addAll(customerBookingInYear);
        return customerBookingInYearSet;
    }

    @Override
    public void giveVoucher(int tenPercentOff, int twentyPercentOff, int fiftyPercentOff, Set<Booking> bookingInCurrentMonth) {
        Stack<Booking> bookingStack = new Stack<>();
        bookingStack.addAll(bookingInCurrentMonth);

        System.out.println("Customer will receive voucher discount 10%: ");
        while (tenPercentOff > 0 && !bookingStack.isEmpty()) {
            Booking booking = bookingStack.pop();
            System.out.println(getCustomerByid(booking.getCustomerId()));
            tenPercentOff--;
        }

        System.out.println("Customer will receive voucher discount 20%: ");
        while (twentyPercentOff > 0 && !bookingStack.isEmpty()) {
            Booking booking = bookingStack.pop();
            System.out.println(getCustomerByid(booking.getCustomerId()));
            twentyPercentOff--;
        }

        System.out.println("Customer will receive voucher discount 50%: ");
        while (fiftyPercentOff > 0 && !bookingStack.isEmpty()) {
            Booking booking = bookingStack.pop();
            System.out.println(getCustomerByid(booking.getCustomerId()));
            fiftyPercentOff--;
        }
    }

    private Person getCustomerByid(String customerId) {
        for (Person customer : customerService.getList()) {
            if (customer.getId().equals(customerId)) {
                return customer;
            }
        }
        return null;
    }
}
