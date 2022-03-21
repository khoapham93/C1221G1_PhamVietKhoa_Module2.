package models;

public class Contract {
    private int contractNumber;
    private int bookingId;
    private String customerId;
    private double deposit;
    private double totalCost;

    public Contract(int contractNumber, int bookingId, String customerId, double deposit, double totalCost) {
        this.contractNumber = contractNumber;
        this.bookingId = bookingId;
        this.customerId = customerId;
        this.deposit = deposit;
        this.totalCost = totalCost;
    }

    public Contract() {

    }

    public int getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(int contractNumber) {
        this.contractNumber = contractNumber;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "contractNumber: " + contractNumber +
                ", bookingId: " + bookingId +
                ", customerId: " + customerId +
                ", deposit: " + String.format("%.2f", deposit) +
                ", totalCost: " + String.format("%.2f", totalCost) +
                '}';
    }

    public String getInfoToCSV() {
        return contractNumber + "," + bookingId + "," + customerId + "," + deposit + "," + totalCost;
    }
}
