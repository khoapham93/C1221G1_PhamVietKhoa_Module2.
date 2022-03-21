package models.facility;

import enums.RentalType;

public abstract class Facility {
    private String id;
    private String name;
    private double usableFloorArea;
    private double rentalCost;
    private int maximumPeople;
    private RentalType rentalType;

    public Facility(String id, String Name, double usableFloorArea, double rentalCost, int maximumPeople, RentalType rentalType) {
        this.id = id;
        this.name = Name;
        this.usableFloorArea = usableFloorArea;
        this.rentalCost = rentalCost;
        this.maximumPeople = maximumPeople;
        this.rentalType = rentalType;
    }

    public Facility() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public RentalType getRentalType() {
        return rentalType;
    }

    public void setRentalType(RentalType rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "id: " + id +
                ", name: " + name +
                ", usableFloorArea: " + String.format("%.2f", usableFloorArea) +
                ", rentalCost: " + String.format("%.2f", rentalCost) +
                ", maximumPeople: " + maximumPeople +
                ", rentalType: " + rentalType;
    }

    public String getInfoToCSV() {
        return id + "," + name + "," + usableFloorArea + "," + rentalCost + "," + maximumPeople + "," + rentalType;
    }
}
