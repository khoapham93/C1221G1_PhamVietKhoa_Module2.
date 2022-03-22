package controllers.objcet_controller;

import models.Booking;
import models.person.Person;
import services.IPromotionService;
import services.impl.PromotionServiceImpl;
import utils.Validation;

import java.util.Scanner;
import java.util.Set;

public class PromotionController {
    IPromotionService promotionService = new PromotionServiceImpl();
    BookingController bookingController = new BookingController();
    Scanner scanner = new Scanner(System.in);

    public void displayCustomerBookingInYear() {
        int year = Integer.parseInt(getYearFromInput());
        Set<Person> customerBookingInYear = promotionService.getCustomerBookingInYear(year);
        System.out.printf("-----------Customer Booking in %d List-------------\n", year);
        if (customerBookingInYear.isEmpty()) {
            System.out.printf("There is no Customer booking in %d\n", year);
        } else {
            for (Person customer : customerBookingInYear) {
                System.out.println(customer);
            }
        }
    }

    public void giveVoucher() {
        Set<Booking> bookingInCurrentMonth = bookingController.getBookingInCurrentMonth();
        int tenPercentOff;
        int twentyPercentOff;
        int fiftyPercentOff;
        int totalVoucher = bookingInCurrentMonth.size();

        do {
            System.out.printf("Total of voucher can give %d\n", totalVoucher);
            tenPercentOff = Integer.parseInt(getVoucherFromInput("10%"));
            twentyPercentOff = Integer.parseInt(getVoucherFromInput("20%"));
            fiftyPercentOff = Integer.parseInt(getVoucherFromInput("50%"));
            if (totalVoucher == (tenPercentOff + twentyPercentOff + fiftyPercentOff)) {
                System.out.println("Vouchers added successful!");
                break;
            } else {
                System.out.println("Total of voucher must be equal of booking amount in month");
            }
        } while (true);
        promotionService.giveVoucher(tenPercentOff, twentyPercentOff, fiftyPercentOff, bookingInCurrentMonth);
    }

    private String getYearFromInput() {
        System.out.print("Enter a year to display: ");
        return Validation.checkYear(scanner.nextLine(), "Invalid year, please try again: ");
    }

    private String getVoucherFromInput(String voucher) {
        System.out.printf("Enter amount of voucher %s: ", voucher);
        return Validation.checkPositiveInteger(scanner.nextLine(),
                "Amount must be a positive number, try again: ");
    }
}
