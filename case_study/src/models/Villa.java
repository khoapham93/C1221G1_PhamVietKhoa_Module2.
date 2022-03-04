package models;

public class Villa extends Facility{
    private String standardOfRoom;
    private double poolArea;
    private int numberOfFloor;

    public Villa(String serviceName, double usableFloorArea, double rentalCost, int maximumPeople, String rentalType, String standardOfRoom, double poolArea, int numberOfFloor) {
        super(serviceName, usableFloorArea, rentalCost, maximumPeople, rentalType);
        this.standardOfRoom = standardOfRoom;
        this.poolArea = poolArea;
        this.numberOfFloor = numberOfFloor;
    }

    public Villa() {

    }

    public String getStandardOfRoom() {
        return standardOfRoom;
    }

    public void setStandardOfRoom(String standardOfRoom) {
        this.standardOfRoom = standardOfRoom;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    public String toString() {
        return "Villa{" + super.toString()+
                ", standardOfRoom: " + standardOfRoom +
                ", poolArea: " + poolArea +
                ", numberOfFloor: " + numberOfFloor +
                '}';
    }
}
