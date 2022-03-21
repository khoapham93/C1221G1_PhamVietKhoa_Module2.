package models;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Booking {
    private int id;
    private LocalDate startDate;
    private LocalDate endDate;
    private String customerId;
    private String facilityId;
    private boolean contractStatus;

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Booking(int id, LocalDate startDate, LocalDate endDate, String customerId, String facilityId,boolean contractStatus) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.customerId = customerId;
        this.facilityId = facilityId;
        this.contractStatus = contractStatus;
    }

    public Booking() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }

    public boolean isContractStatus() {
        return contractStatus;
    }

    public void setContractStatus(boolean contractStatus) {
        this.contractStatus = contractStatus;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "id: " + id +
                ", startDate: " + startDate.format(formatter) +
                ", endDate: " + endDate.format(formatter) +
                ", customerId: " + customerId +
                ", facilityId: " + facilityId +
                ", status: " + contractStatus +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Booking booking = (Booking) o;
        return getId() == booking.getId() &&
                Objects.equals(getStartDate(), booking.getStartDate()) &&
                Objects.equals(getEndDate(), booking.getEndDate()) &&
                Objects.equals(getFacilityId(), booking.getFacilityId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFacilityId());
    }

    public String getInfoToCSV() {
        return id + "," + startDate.format(formatter) + "," + endDate.format(formatter)
                + "," + customerId + "," + facilityId+ "," + contractStatus;
    }
}
