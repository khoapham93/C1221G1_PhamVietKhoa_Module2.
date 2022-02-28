package oop_review.manager_vehicle;

public abstract class Vehicle {
    private String licensePlate;
    private Manufacturer manufacturer;
    private int productionYear;
    private String owner;

    public Vehicle(String licensePlate, Manufacturer manufacturer, int productionYear, String owner) {
        this.licensePlate = licensePlate;
        this.manufacturer = manufacturer;
        this.productionYear = productionYear;
        this.owner = owner;
    }

    public Vehicle() {

    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "licensePlate='" + licensePlate + '\'' +
                ", manufacturer=" + manufacturer.getManufacturerName() +
                ", productionYear=" + productionYear +
                ", owner=" + owner;
    }
}
