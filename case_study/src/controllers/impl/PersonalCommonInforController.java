package controllers.impl;

import enums.Gender;
import models.person.Person;
import utils.UserException;
import utils.Validation;

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
        return Validation.checkEmail(scanner.nextLine(), "Invalid email, please try again: ");
    }

    protected String getPhoneFromInput() {
        System.out.print("Phone (accept string include 10 numbers): ");
        return Validation.checkPhone(scanner.nextLine(), "Invalid phone, please try again: ");
    }

    protected String getIdCardFromInput() {
        System.out.print("Id card: ");
        return Validation.checkIdCard(scanner.nextLine(), "Invalid Id card, please try again: ");
    }

    protected Gender getGenderFromIput() {
        System.out.println("Gender:");
        int index = 0;
        for (Gender gender : Gender.values()) {
            System.out.println(index + ". " + gender);
            index++;
        }
        System.out.print("Enter your choice: ");
        int gengerIndex = Validation.checkIntegerFrom0ToRange(scanner.nextLine(),
                                    Gender.values().length-1,"Invalid index, please try again");
        return Gender.values()[gengerIndex];
    }

    protected String getBirthdayFromInput() {
        System.out.print("Birthday: ");
        return Validation.checkDayMothYearString(scanner.nextLine(),"Invalid birthday, please try again:");
    }

    protected String getFullNameFromInput() {
        System.out.print("Full name: ");

        return Validation.checkVietnameseName(scanner.nextLine(),"Invalid name, please try again: ");
    }

    protected String getIdFromInput() {
        System.out.print("id: ");
        return Validation.checkAllStringAndNumber(scanner.nextLine(),"Invalid Id, please try again: ");
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

    protected int checkTypeChoice() throws UserException {
        System.out.print("Enter your choice: ");
        String choice = scanner.nextLine();
        if (!choice.matches("^[+-]?\\d+$")) {
            throw new UserException("Number Exception, Choice must be a number!");
        }
        //String choice = Validation.checkPositiveInteger(scanner.nextLine(), "choice must be a number, please try again: ");

        return Integer.parseInt(choice);

    }
}
