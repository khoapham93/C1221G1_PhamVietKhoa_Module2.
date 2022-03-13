package oop_collection_exception_regex_review.manager_vehicle_save_to_file.models;

public class Truck extends Vehicle {
    private double maximumLoad;

    public Truck(String licensePlate, Manufacturer manufacturer, int productionYear, String owner, double maximumLoad) {
        super(licensePlate, manufacturer, productionYear, owner);
        this.maximumLoad = maximumLoad;
    }

    public Truck() {

    }

    public double getMaximumLoad() {
        return maximumLoad;
    }

    public void setMaximumLoad(double maximumLoad) {
        this.maximumLoad = maximumLoad;
    }

    @Override
    public String toString() {
        return "Truck{" + super.toString() +
                ", maximumLoad: " + maximumLoad +
                '}';
    }

    @Override
    public String getInfoToCSV() {
        return super.getInfoToCSV() + "," + this.maximumLoad;
    }
}
