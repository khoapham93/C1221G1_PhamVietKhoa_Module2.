package controllers.objcet_controller;

import models.Booking;
import models.Contract;
import models.person.Employee;
import services.IContractService;
import services.impl.ContractServiceImpl;
import utils.Validation;

import java.beans.IntrospectionException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class ContractController {

    IContractService contractService = new ContractServiceImpl();
    BookingController bookingController = new BookingController();
    Scanner scanner = new Scanner(System.in);

    public void add() {
        int contractNumber;
        int bookingId;
        String customerId;
        double deposit;
        double totalCost;

        Queue<Booking> bookingQueue = new LinkedList<>();
        Set<Booking> bookingSet = bookingController.sendBooking();

        for (Booking booking : bookingSet) {
            bookingQueue.add(booking);
        }
        boolean checkBookingQueue = false;
        while (!bookingQueue.isEmpty()) {
            checkBookingQueue = true;
            Booking booking = bookingQueue.poll();
            customerId = booking.getCustomerId();
            bookingId = booking.getId();

            System.out.printf("Creating contract for customer has Id [%s] and booking id [%d]\n", customerId, bookingId);
            System.out.println("Your booking details: " + booking);

            if (contractService.getList().isEmpty() || contractService.getList().size() == 0) {
                contractNumber = 1;
            } else {
                contractNumber = contractService.getList().size() + 1;
            }

            System.out.print("Enter deposit: ");
            deposit = getMoneyFromInput();
            System.out.print("Enter total amount: ");
            totalCost = getMoneyFromInput();
            Contract contract = new Contract(contractNumber, booking.getId(), customerId, deposit, totalCost);
            contractService.add(contract);
            System.out.println("Contract create successful!");
            System.out.println();
        }

        if (!checkBookingQueue){
            System.out.println("There is no booking! Create booking first");
        }else {
            bookingController.setBookingAfterContractSigned();
        }
    }

    public void display() {
        System.out.println("---------Contract List----------");
        if (contractService.getList().isEmpty()) {
            System.out.println("There is no Contract in list");
        } else {
            int i = 0;
            for (Contract contract : contractService.getList()) {
                System.out.printf("[%d] - %s\n", i++, contract);
            }
        }
    }

    public void edit() {
        this.display();
        System.out.print("Enter index of Contract you want to edit:");

        int index = Validation.checkIntegerFrom0ToRange(scanner.nextLine(), contractService.getList().size() - 1,
                "Index must be positive and less than range of list, try again: ");

        Contract editingContract = contractService.getList().get(index);
        editingContract = editContractFromInput(editingContract);
        contractService.edit(index, editingContract);
        System.out.println("Edit successfully!");
    }

    private Contract editContractFromInput(Contract contract) {
        String menu = "[-]. Contract number: " + contract.getContractNumber() + "\n" +
                "[-]. Booking id: " + contract.getBookingId() + "\n" +
                "[-]. Customer id: " + contract.getCustomerId() + "\n" +
                "[1]. Deposit: " + contract.getDeposit() + "\n" +
                "[2]. Total amount: " + contract.getTotalCost();
        System.out.println("Contract Information:");
        System.out.println(menu);
        do {
            System.out.println("Only edit numbered information!");
            System.out.print("Enter your choice: ");
            String input = Validation.checkPositiveInteger(scanner.nextLine(),
                    "Index must be a positive number, try again: ");
            int choice = Integer.parseInt(input);

            switch (choice) {
                case 1:
                    System.out.print("Enter new deposit: ");
                    contract.setDeposit(getMoneyFromInput());
                    break;
                case 2:
                    System.out.print("Enter new total amount: ");
                    contract.setTotalCost(getMoneyFromInput());
                    break;
                default:
                    System.out.println("No choice selected!");
            }

            System.out.print("Do you want to continue editing(Y/N): ");
            String stopEdit = scanner.nextLine();
            if ("N".equals(stopEdit.toUpperCase())) {
                break;
            }

        } while (true);

        return contract;
    }

    private double getMoneyFromInput() {
        String amount = Validation.checkPositiveDouble(scanner.nextLine(),
                "amount must be positive number, try again: ");
        return Double.parseDouble(amount);
    }

}
