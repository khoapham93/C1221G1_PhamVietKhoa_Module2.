package controllers.objcet_controller;

import enums.CustomerType;
import models.person.Customer;
import models.person.Person;
import services.IPersonService;
import services.impl.CustomerServiceImpl;
import utils.UserException;
import utils.Validation;

import java.util.List;

public class CustomerController extends PersonalCommonInforController {
    CustomerType custumerType;
    String address;

    IPersonService customerService = new CustomerServiceImpl();

    public void add() {
        System.out.println("Add new customer:");
        super.addNewPerson();
        custumerType = getCustumerTypeFromInput();
        address = getAddressFromInput();
        Customer customer = new Customer(
                super.id,
                super.fullName,
                super.birthday,
                super.gender,
                super.identityCard,
                super.phoneNumber,
                super.email,
                custumerType,
                address);
        customerService.add(customer);
        System.out.println("Customer added.");
    }

    public void display() {
        System.out.println("----------Customer List-----------");
        super.display(customerService.getList(), "Customer");
    }

    public void edit() {
        this.display();
        System.out.println("Enter index of Customer you want to edit:");
        int index = Validation.checkIntegerFrom0ToRange(scanner.nextLine(), customerService.getList().size() - 1, "Invalid index, try agian: ");
        Customer customerEditing = (Customer) customerService.getList().get(index);
        customerEditing = editCustomerFromInput(customerEditing);
        customerService.edit(index, customerEditing);
        System.out.println("Edit successfully!");
    }

    public List<Person> getCustomerList() {
        return customerService.getList();
    }

    private Customer editCustomerFromInput(Customer customer) {
        String menu =
                "[1]. fullName: " + customer.getFullName() + "\n" +
                        "[2]. birthday: " + customer.getBirthday().format(formatter) + "\n" +
                        "[3]. gender: " + customer.getGender() + "\n" +
                        "[4]. identityCard: " + customer.getIdentityCard() + "\n" +
                        "[5]. phoneNumber: " + customer.getPhoneNumber() + "\n" +
                        "[6]. email: " + customer.getEmail() + "\n" +
                        "[7]. custumerType: " + customer.getCustumerType() + "\n" +
                        "[8]. address: " + customer.getAddress();
        System.out.println("Employee Information:");
        System.out.println(menu);
        do {
            try {
                int choice = super.checkTypeChoice();
                switch (choice) {
                    case 1:
                        customer.setFullName(super.getFullNameFromInput());
                        break;
                    case 2:
                        customer.setBirthday(Validation.checkDateTimeFromInput("Birthday", pass100year, pass18year));
                        break;
                    case 3:
                        customer.setGender(super.getGenderFromIput());
                        break;
                    case 4:
                        customer.setIdentityCard(super.getIdCardFromInput());
                        break;
                    case 5:
                        customer.setPhoneNumber(super.getPhoneFromInput());
                        break;
                    case 6:
                        customer.setEmail(super.getEmailFromInput());
                        break;
                    case 7:
                        customer.setCustumerType(getCustumerTypeFromInput());
                        break;
                    case 8:
                        customer.setAddress(getAddressFromInput());
                        break;
                    default:
                        System.out.println("No choice select!");
                }
            } catch (UserException e) {
                System.err.println(e.getMessage());
            }
            System.out.print("Do you want to continue editing(Y/N): ");
            String stopEdit = scanner.nextLine();
            if ("N".equals(stopEdit.toUpperCase())) {
                break;
            }
        } while (true);

        return customer;
    }

    private CustomerType getCustumerTypeFromInput() {
        System.out.println("Customer type:");
        int index = 0;
        for (CustomerType customerType : CustomerType.values()) {
            System.out.println(index++ + ". " + customerType);
        }
        System.out.print("Enter your choice: ");
        int customerTypeIndex = Validation.checkIntegerFrom0ToRange(scanner.nextLine(),
                CustomerType.values().length - 1, "Invalid index, please try again");

        return CustomerType.values()[customerTypeIndex];
    }

    private String getAddressFromInput() {
        System.out.print("Address: ");
        String address = scanner.nextLine();
        return address;
    }
}
