package models.facility;

import enums.RentalType;

public class Room extends Facility{
    private String freeServiceIncluded;

    public Room(String id, String name, double usableFloorArea, double rentalCost, int maximumPeople, RentalType rentalType, String freeServiceIncluded) {
        super(id, name, usableFloorArea, rentalCost, maximumPeople, rentalType);
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
