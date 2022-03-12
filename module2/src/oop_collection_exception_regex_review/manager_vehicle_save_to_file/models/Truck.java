package oop_collection_exception_regex_review.manager_vehicle_save_to_file.models;

public class Truck extends Vehicle {
    private int maximumLoad;

    public Truck(String licensePlate, Manufacturer manufacturer, int productionYear, String owner, int maximumLoad) {
        super(licensePlate, manufacturer, productionYear, owner);
        this.maximumLoad = maximumLoad;
    }

    public Truck() {

    }

    public int getMaximumLoad() {
        return maximumLoad;
    }

    public void setMaximumLoad(int maximumLoad) {
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
