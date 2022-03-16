package controllers.impl;

import enums.Gender;
import models.person.Person;

import java.util.List;
import java.util.Scanner;

public class PersonalCommonInforController {
    protected String id;
    protected String fullName;
    protected String birthday;
    protected Gender gender;
    protected String identityCard;
    protected String phoneNumber;
    protected String email;

    Scanner scanner = new Scanner(System.in);

    protected void addNewPerson() {
        this.id = getIdFromInput();
        this.fullName = getFullNameFromInput();
        this.birthday = getBirthdayFromInput();
        this.gender = getGenderFromIput();
        this.identityCard = getIdCardFromInput();
        this.phoneNumber = getPhoneFromInput();
        this.email = getEmailFromInput();
    }

    protected String getEmailFromInput() {
        System.out.print("Email: ");
        String email = scanner.nextLine();
        return email;
    }

    protected String getPhoneFromInput() {
        System.out.print("Phone: ");
        String phone = scanner.nextLine();
        return phone;
    }

    protected String getIdCardFromInput() {
        System.out.print("Id card: ");
        String idCard = scanner.nextLine();
        return idCard;
    }

    protected Gender getGenderFromIput() {
        System.out.println("Gender:");
        int index = 0;
        for (Gender gender : Gender.values()) {
            System.out.println(index + ". " + gender);
            index++;
        }
        System.out.print("Enter your choice: ");
        String choice = scanner.nextLine();
        int gengerIndex = Integer.parseInt(choice);
        return Gender.values()[gengerIndex];
    }

    protected String getBirthdayFromInput() {
        System.out.print("Birthday: ");
        String birthday = scanner.nextLine();
        return birthday;
    }

    protected String getFullNameFromInput() {
        System.out.print("Full name: ");
        String name = scanner.nextLine();
        return name;
    }

    protected String getIdFromInput() {
        System.out.print("id: ");
        String id = scanner.nextLine();
        return id;
    }

    protected void display(List<Person> personList, String typeOfPerson) {
        if (personList.size() == 0) {
            System.out.println("There's no " + typeOfPerson + " in list!");
        } else {
            int i = 0;
            for (Person person : personList) {
                System.out.printf("[%d] - %s\n", i++, person);
            }
        }
    }

    //protected String getId
    protected int getIndexById(String id, List<Person> personList) {
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

}
