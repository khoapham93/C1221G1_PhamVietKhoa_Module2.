package oop_collection_exception_regex_review.manager_vehicle_save_to_file.models;

public class Car extends Vehicle {
    private int seat;
    private String carType;

    public Car(String licensePlate, Manufacturer manufacturer, int productionYear, String owner, int seat, String carType) {
        super(licensePlate, manufacturer, productionYear, owner);
        this.seat = seat;
        this.carType = carType;
    }

    public Car() {
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    @Override
    public String toString() {
        return "Car{" + super.toString() +
                ", seat: " + seat +
                ", carType: " + carType +
                '}';
    }

    @Override
    public String getInfoToCSV() {
        return super.getInfoToCSV() + "," + this.seat + "," + this.carType;
    }
}
