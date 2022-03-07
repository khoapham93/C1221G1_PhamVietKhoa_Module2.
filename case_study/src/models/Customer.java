package models;

public class Customer extends Person{
    private String custumerId;
    private String custumerType;
    private String address;

    public Customer(String fullName, String birthday, String gender, String identityCard, String phoneNumber, String email, String custumerId, String custumerType, String address) {
        super(fullName, birthday, gender, identityCard, phoneNumber, email);
        this.custumerId = custumerId;
        this.custumerType = custumerType;
        this.address = address;
    }

    public Customer() {
    }

    public String getCustumerId() {
        return custumerId;
    }

    public void setCustumerId(String custumerId) {
        this.custumerId = custumerId;
    }

    public String getCustumerType() {
        return custumerType;
    }

    public void setCustumerType(String custumerType) {
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
                "custumerCode: " + custumerId + ", " +
                super.toString()+
                ", custumerType: " + custumerType +
                ", address: " + address +
                '}';
    }
}
