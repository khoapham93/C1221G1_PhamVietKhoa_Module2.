package oop_review.manager_vehicle;

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
                ", maximumLoad:" + maximumLoad +
                '}';
    }
}
