package controllers;

import controllers.objcet_controller.*;
import services.IFacilityBookedService;
import services.impl.FacilityBookedServiceImpl;
import utils.UserException;

import java.util.Scanner;

public class FuramaController {
    static Scanner scanner = new Scanner(System.in);

    static EmployeeController employeeController = new EmployeeController();
    static CustomerController customerController = new CustomerController();
    static HouseController houseController = new HouseController();
    static VillaController villaController = new VillaController();
    static RoomController roomController = new RoomController();
    static IFacilityBookedService facilityMaintainService = new FacilityBookedServiceImpl();
    static BookingController bookingController = new BookingController();
    static ContractController contractController = new ContractController();
    static PromotionController promotionController = new PromotionController();

    public void displayMainMenu() {
        int choice = -1;
        while (choice != 0) {
            System.out.println();
            System.out.println("-------------------------------------\n" +
                    "FURAMA RESORT MANAGEMENT PROGRAM\n" +
                    "Main menu:\n" +
                    "1. Employee Management\n" +
                    "2. Customer Management\n" +
                    "3. Facility Management \n" +
                    "4. Booking Management \n" +
                    "5. Promotion Management\n" +
                    "6. Exit");
            try {
                choice = checkTypeChoice();
                switch (choice) {
                    case 1:
                        employeeManagement();
                        break;
                    case 2:
                        customerManagement();
                        break;
                    case 3:
                        facilityManagement();
                        break;
                    case 4:
                        bookingManagement();
                        break;
                    case 5:
                        promotionManagement();
                        break;
                    case 6:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("No choice selected");
                }
            } catch (UserException e) {
                System.err.println(e.getMessage());
            }
            System.out.println();

        }
    }

    private void promotionManagement() {
        int choice = -1;
        while (choice != 0) {
            System.out.println();
            System.out.println("Promotion Management\n" +
                    "1. Display list customers use service\n" +
                    "2. Create voucher for customer booking in current month\n" +
                    "3. Return main menu");
            try {
                choice = checkTypeChoice();
                System.out.println();
                switch (choice) {
                    case 1:
                        promotionController.displayCustomerBookingInYear();
                        break;
                    case 2:
                        promotionController.giveVoucher();
                        break;
                    case 3:
                        choice = 0;
                        break;
                    default:
                        System.out.println("No choice selected");
                }
            } catch (UserException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    private void bookingManagement() {
        int choice = -1;
        while (choice != 0) {
            System.out.println();
            System.out.println("Booking Management\n" +
                    "1. Add new booking\n" +
                    "2. Display list booking\n" +
                    "3. Create new contracts\n" +
                    "4. Display list contracts\n" +
                    "5. Edit contracts\n" +
                    "6. Return main menu");
            try {
                choice = checkTypeChoice();
                System.out.println();
                switch (choice) {
                    case 1:
                        bookingController.add();
                        break;
                    case 2:
                        bookingController.display();
                        break;
                    case 3:
                        contractController.add();
                        break;
                    case 4:
                        contractController.display();
                        break;
                    case 5:
                        contractController.edit();
                        break;
                    case 6:
                        choice = 0;
                        break;
                    default:
                        System.out.println("No choice selected");
                }
            } catch (UserException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    private void facilityManagement() {
        int choice = -1;
        while (choice != 0) {
            System.out.println();
            System.out.println("Facility Management\n" +
                    "1. Display list facility\n" +
                    "2. Add new facility\n" +
                    "3. Display list facility maintenance\n" +
                    "4. Return main menu");
            try {
                choice = checkTypeChoice();
                System.out.println();
                switch (choice) {
                    case 1:
                        houseController.display();
                        roomController.display();
                        villaController.display();
                        break;
                    case 2:
                        addnewFacilityMenu();
                        break;
                    case 3:
                        facilityMaintainService.displayFacilityMaintain();
                        break;
                    case 4:
                        choice = 0;
                        break;
                    default:
                        System.out.println("No choice selected");
                }
            } catch (UserException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    private void customerManagement() {
        int choice = -1;
        while (choice != 0) {
            System.out.println();
            System.out.println("Customer Management\n" +
                    "1. Display list customers\n" +
                    "2. Add new customer\n" +
                    "3. Edit customer\n" +
                    "4. Return main menu");
            try {
                choice = checkTypeChoice();
                System.out.println();
                switch (choice) {
                    case 1:
                        customerController.display();
                        break;
                    case 2:
                        customerController.add();
                        break;
                    case 3:
                        customerController.edit();
                        break;
                    case 4:
                        choice = 0;
                        break;
                    default:
                        System.out.println("No choice selected");
                }
            } catch (UserException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    private void employeeManagement() {
        int choice = -1;
        while (choice != 0) {
            System.out.println();
            System.out.println("Employee Management\n" +
                    "1. Display list employees\n" +
                    "2. Add new employee\n" +
                    "3. Edit employee\n" +
                    "4. Return main menu");
            try {
                choice = checkTypeChoice();
                System.out.println();
                switch (choice) {
                    case 1:
                        employeeController.display();
                        break;
                    case 2:
                        employeeController.add();
                        break;
                    case 3:
                        employeeController.edit();
                        break;
                    case 4:
                        choice = 0;
                        break;
                    default:
                        System.out.println("No choice selected");
                }
            } catch (UserException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    private void addnewFacilityMenu() {
        int choice = -1;
        while (choice != 0) {
            System.out.println();
            System.out.println("Add new facility menu:\n" +
                    "1. Add new Villa\n" +
                    "2. Add new House\n" +
                    "3. Add new Room\n" +
                    "4. Return main menu");
            try {
                choice = checkTypeChoice();
                System.out.println();
                switch (choice) {
                    case 1:
                        villaController.add();
                        break;
                    case 2:
                        houseController.add();
                        break;
                    case 3:
                        roomController.add();
                        break;
                    case 4:
                        choice = 0;
                        break;
                    default:
                        System.out.println("No choice selected");
                }
            } catch (UserException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    private int checkTypeChoice() throws UserException {
        System.out.print("Enter your choice: ");
        String choice = scanner.nextLine();
        if (!choice.matches("^[+-]?\\d+$")) {
            throw new UserException("Number Exception, Choice must be a number!");
        }
        //String choice = Validation.checkPositiveInteger(scanner.nextLine(), "choice must be a number, please try again: ");

        return Integer.parseInt(choice);
    }
}
