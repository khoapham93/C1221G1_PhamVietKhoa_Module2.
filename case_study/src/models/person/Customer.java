package models.person;

import enums.CustomerType;
import enums.Gender;

import java.time.LocalDate;

public class Customer extends Person {
    private CustomerType custumerType;
    private String address;

    public Customer(String id, String fullName, LocalDate birthday, Gender gender, String identityCard, String phoneNumber, String email, CustomerType custumerType, String address) {
        super(id, fullName, birthday, gender, identityCard, phoneNumber, email);
        this.custumerType = custumerType;
        this.address = address;
    }

    public Customer() {
    }

    public CustomerType getCustumerType() {
        return custumerType;
    }

    public void setCustumerType(CustomerType custumerType) {
        this.custumerType = custumerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                super.toString() +
                ", custumerType: " + custumerType +
                ", address: " + address +
                '}';
    }

    public String getInfoToCSV() {
        return super.getInfoToCSV() + "," + custumerType + "," + address;
    }
}
