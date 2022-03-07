package controllers;

import java.util.Scanner;

public class PersonalCommonInforController {
    protected String fullName;
    protected String birthday;
    protected String gender;
    protected String identityCard;
    protected String phoneNumber;
    protected String email;

    Scanner scanner = new Scanner(System.in);

    public void addNewPerson() {
        System.out.print("Name: ");
        this.fullName = scanner.nextLine();
        System.out.print("birthday: ");
        this.birthday = scanner.nextLine();
        System.out.print("Gender: ");
        this.gender = scanner.nextLine();
        System.out.print("Id card: ");
        this.identityCard = scanner.nextLine();
        System.out.print("Phone: ");
        this.phoneNumber = scanner.nextLine();
        System.out.print("Email: ");
        this.email = scanner.nextLine();
    }

}
