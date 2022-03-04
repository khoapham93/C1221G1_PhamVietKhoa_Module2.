package models;

public class Room extends Facility{
    private String freeServiceIncluded;

    public Room(String serviceName, double usableFloorArea, double rentalCost, int maximumPeople, String rentalType, String freeServiceIncluded) {
        super(serviceName, usableFloorArea, rentalCost, maximumPeople, rentalType);
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public Room() {

    }

    public String getFreeServiceIncluded() {
        return freeServiceIncluded;
    }

    public void setFreeServiceIncluded(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }

    @Override
    public String toString() {
        return "Room{" + super.toString()+
                ", freeServiceIncluded: " + freeServiceIncluded +
                '}';
    }
}
