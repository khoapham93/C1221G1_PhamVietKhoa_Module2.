package models.facility;

import enums.RentalType;

public class House extends Facility{
    private String standardOfRoom;
    private int numberOfFloor;

    public House(String id, String name, double usableFloorArea, double rentalCost, int maximumPeople, RentalType rentalType, String standardOfRoom, int numberOfFloor) {
        super(id, name, usableFloorArea, rentalCost, maximumPeople, rentalType);
        this.standardOfRoom = standardOfRoom;
        this.numberOfFloor = numberOfFloor;
    }


    public House() {

    }

    public String getStandardOfRoom() {
        return standardOfRoom;
    }

    public void setStandardOfRoom(String standardOfRoom) {
        this.standardOfRoom = standardOfRoom;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    public String toString() {
        return "House{" + super.toString()+
                ", standardOfRoom: " + standardOfRoom +
                ", numberOfFloor: " + numberOfFloor +
                '}';
    }
}
