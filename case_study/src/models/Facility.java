package models;

public abstract class Facility {
    private String serviceName;
    private double usableFloorArea;
    private double rentalCost;
    private int maximumPeople;
    private String rentalType;

    public Facility(String serviceName, double usableFloorArea, double rentalCost, int maximumPeople, String rentalType) {
        this.serviceName = serviceName;
        this.usableFloorArea = usableFloorArea;
        this.rentalCost = rentalCost;
        this.maximumPeople = maximumPeople;
        this.rentalType = rentalType;
    }

    public Facility() {

    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getUsableFloorArea() {
        return usableFloorArea;
    }

    public void setUsableFloorArea(double usableFloorArea) {
        this.usableFloorArea = usableFloorArea;
    }

    public double getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(double rentalCost) {
        this.rentalCost = rentalCost;
    }

    public int getMaximumPeople() {
        return maximumPeople;
    }

    public void setMaximumPeople(int maximumPeople) {
        this.maximumPeople = maximumPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "serviceName: " + serviceName +
                ", usableFloorArea: " + usableFloorArea +
                ", rentalCost: " + rentalCost +
                ", maximumPeople: " + maximumPeople +
                ", rentalType: " + rentalType;
    }
}
