package oop_review.manager_vehicle;

public class Manufacturer {
    private String manufacturerId;
    private String manufacturerName;
    private String country;

    public Manufacturer(String manufacturerId, String manufacturerName, String country) {
        this.manufacturerId = manufacturerId;
        this.manufacturerName = manufacturerName;
        this.country = country;
    }

    public Manufacturer() {

    }

    public String getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(String manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "HangSanXuat{" +
                "manufacturerId:'" + manufacturerId + '\'' +
                ", manufacturerName:'" + manufacturerName + '\'' +
                ", country:'" + country + '\'' +
                '}';
    }
}
