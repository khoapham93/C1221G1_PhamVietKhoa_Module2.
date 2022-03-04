package models;

public class House extends Facility{
    private String standardOfRoom;
    private int numberOfFloor;

    public House(String serviceName, double usableFloorArea, double rentalCost, int maximumPeople, String rentalType, String standardOfRoom, int numberOfFloor) {
        super(serviceName, usableFloorArea, rentalCost, maximumPeople, rentalType);
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
