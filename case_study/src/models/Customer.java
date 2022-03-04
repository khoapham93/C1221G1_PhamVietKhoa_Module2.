package models;

public class Customer extends Person{
    private String custumerCode;
    private String custumerType;
    private String address;

    public Customer(String fullName, String birthday, String gender, long identityCard, long phoneNumber, String email, String custumerCode, String custumerType, String address) {
        super(fullName, birthday, gender, identityCard, phoneNumber, email);
        this.custumerCode = custumerCode;
        this.custumerType = custumerType;
        this.address = address;
    }

    public Customer() {
    }

    public String getCustumerCode() {
        return custumerCode;
    }

    public void setCustumerCode(String custumerCode) {
        this.custumerCode = custumerCode;
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
                "custumerCode: " + custumerCode + ", " +
                super.toString()+
                ", custumerType: " + custumerType +
                ", address: " + address +
                '}';
    }
}
