package oop_review.manager_vehicle;

public class Motorcycle extends Vehicle {
    private int cylinderCapacity;

    public Motorcycle(String licensePlate, Manufacturer manufacturer, int productionYear, String owner, int cylinderCapacity) {
        super(licensePlate, manufacturer, productionYear, owner);
        this.cylinderCapacity = cylinderCapacity;
    }

    public Motorcycle() {

    }

    public int getCylinderCapacity() {
        return cylinderCapacity;
    }

    public void setCylinderCapacity(int cylinderCapacity) {
        this.cylinderCapacity = cylinderCapacity;
    }

    @Override
    public String toString() {
        return "motorcycle{" + super.toString() +
                ", cylinderCapacity:" + cylinderCapacity +
                '}';
    }
}
