package controllers.impl;

import controllers.IPersonController;
import enums.CustomerType;
import models.person.Customer;
import services.IPersonService;
import services.impl.CustomerServiceImpl;

public class CustomerController extends PersonalCommonInforController implements IPersonController {
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
        super.display(customerService.getList(), "Customer");
    }

    public void edit() {
        this.display();
        System.out.println("Enter index of Customer you want to edit:");
        int index = Integer.parseInt(scanner.nextLine());
        Customer customerEditing = (Customer) customerService.getList().get(index);
        customerEditing = editCustomerFromInput(customerEditing);
        customerService.edit(index,customerEditing);
        System.out.println("Edit successfully!");
    }

    private Customer editCustomerFromInput(Customer customer) {
        String menu = "[0]. id: " + customer.getId() + "\n" +
                "[1]. fullName: " + customer.getFullName() + "\n" +
                "[2]. birthday: " + customer.getBirthday() + "\n" +
                "[3]. gender: " + customer.getGender() + "\n" +
                "[4]. identityCard: " + customer.getIdentityCard() + "\n" +
                "[5]. phoneNumber: " + customer.getPhoneNumber() + "\n" +
                "[6]. email: " + customer.getEmail() + "\n" +
                "[7]. custumerType: " + customer.getCustumerType() + "\n" +
                "[8]. address: " + customer.getAddress();
        System.out.println("Employee Information:");
        System.out.println(menu);
        do {
            System.out.print("Enter you choice:");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 0:
                    customer.setId(super.getIdFromInput());
                    break;
                case 1:
                    customer.setFullName(super.getFullNameFromInput());
                    break;
                case 2:
                    customer.setBirthday(super.getBirthdayFromInput());
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
            System.out.print("Do you want to continue editing(Y/N): ");
            String stopEdit = scanner.nextLine();
            if ("N".equals(stopEdit.toUpperCase())){
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
        String choice = scanner.nextLine();
        int customerTypeIndex = Integer.parseInt(choice);
        return CustomerType.values()[customerTypeIndex];
    }

    private String getAddressFromInput() {
        System.out.print("Address: ");
        String address = scanner.nextLine();
        return address;
    }
}
