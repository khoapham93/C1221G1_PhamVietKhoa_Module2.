package oop_review.manager_vehicle;

import java.util.Scanner;

public class VehicleManager {
    Scanner scanner = new Scanner(System.in);
    protected String licensePlate;
    protected Manufacturer manufacturer;
    protected int productionYear;
    protected String owner;

    public void addNewVehicle() {
        System.out.print("Biển kiểm soát: ");
        licensePlate = scanner.nextLine();
        System.out.println("Hãng sản xuất: ");
        ManufacturerManager.displayManufacturerName();
        System.out.print("nhập mã hãng sản xuất: ");
        String manufacturerID = scanner.nextLine();
        manufacturer = ManufacturerManager.getManufacturer(manufacturerID);
        System.out.print("Năm sản xuất: ");
        productionYear = Integer.parseInt(scanner.nextLine());
        System.out.print("Chủ sở hữu: ");
        owner = scanner.nextLine();
    }
}
