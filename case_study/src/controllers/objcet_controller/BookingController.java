package controllers.objcet_controller;

import models.Booking;
import models.facility.Facility;
import models.person.Person;
import services.IBookingService;
import services.impl.BookingServiceImpl;
import utils.Validation;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.Set;

public class BookingController {
    IBookingService bookingService = new BookingServiceImpl();

    CustomerController customerController = new CustomerController();
    HouseController houseController = new HouseController();
    RoomController roomController = new RoomController();
    VillaController villaController = new VillaController();

    Scanner scanner = new Scanner(System.in);

    public void add() {
        int id;
        LocalDate startDate;
        LocalDate endDate;
        String customerId;
        String facilityId;
        System.out.println("Add new booking:");

        if (bookingService.getBookingSet().isEmpty()) {
            id = 1;
        } else {
            id = bookingService.getBookingSet().size() + 1;
        }

        startDate = Validation.checkDateTimeFromInput("start date", LocalDate.now());
        endDate = Validation.checkDateTimeFromInput("end date", startDate);

        customerId = getCustomerIdFromInput();
        System.out.println();
        facilityId = getFacilityIdFromInput();
        System.out.println();
        Booking booking = new Booking(id, startDate, endDate, customerId, facilityId, false);
        bookingService.add(booking);
        System.out.println("Booking added!");
    }

    public void display() {
        System.out.println("---------Booking List-----------");
        if (bookingService.getBookingSet().isEmpty()) {
            System.out.println("There is no Booking in list");
        } else {
            for (Booking booking : bookingService.getBookingSet()) {
                System.out.println(booking);
            }
        }
    }

    public Set<Booking> sendBooking() {
        return bookingService.sendBooking();
    }

    public void setBookingAfterContractSigned() {
        bookingService.updateBookingSigned();
    }

    private String getCustomerIdFromInput() {
        boolean checkID = false;
        String id;
        do {
            System.out.println();
            customerController.display();
            System.out.println();
            System.out.print("Enter Customer id booking: ");
            id = scanner.nextLine();
            for (Person customer : customerController.getCustomerList()) {
                if (customer.getId().equals(id)) {
                    checkID = true;
                    break;
                }
            }
            if (!checkID) {
                System.out.println("Customer id doesn't exist, try again.");
            }
        } while (!checkID);
        return id;
    }

    private String getFacilityIdFromInput() {
        boolean checkID = false;
        String id;
        do {
            System.out.println();

            houseController.display();
            roomController.display();
            villaController.display();
            System.out.println();

            System.out.print("Enter Facility id you want to book: ");
            id = scanner.nextLine().toUpperCase();
            for (Facility house : houseController.getList()) {
                if (house.getId().equals(id)) {
                    checkID = true;
                    break;
                }
            }
            if (!checkID) {
                for (Facility room : roomController.getList()) {
                    if (room.getId().equals(id)) {
                        checkID = true;
                        break;
                    }
                }
            }
            if (!checkID) {
                for (Facility villa : villaController.getList()) {
                    if (villa.getId().equals(id)) {
                        checkID = true;
                        break;
                    }
                }
            }
            if (!checkID) {
                System.out.println("Facility id doesn't exist, try again.");
            }
        } while (!checkID);

        return id;
    }

}
