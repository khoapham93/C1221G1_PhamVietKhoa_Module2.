package models.person;

import enums.Gender;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Person {
    private String id;
    private String fullName;
    private LocalDate birthday;
    private Gender gender;
    private String identityCard;
    private String phoneNumber;
    private String email;

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Person(String id, String fullName, LocalDate birthday, Gender gender, String identityCard, String phoneNumber, String email) {
        this.id = id;
        this.fullName = fullName;
        this.birthday = birthday;
        this.gender = gender;
        this.identityCard = identityCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Person() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "id: " + id +
                ", fullName: " + fullName +
                ", birthday: " + birthday.format(formatter) +
                ", gender: " + gender +
                ", identityCard: " + identityCard +
                ", phoneNumber: " + phoneNumber +
                ", email: " + email;
    }

    public String getInfoToCSV() {
        return id + "," + fullName + "," + birthday.format(formatter) + "," + gender + "," + identityCard + "," + phoneNumber + "," + email;
    }
}
