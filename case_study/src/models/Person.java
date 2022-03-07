package models;

public abstract class Person {
    private String fullName;
    private String birthday;
    private String gender;
    private String identityCard;
    private String phoneNumber;
    private String email;

    public Person(String fullName, String birthday, String gender, String identityCard, String phoneNumber, String email) {
        this.fullName = fullName;
        this.birthday = birthday;
        this.gender = gender;
        this.identityCard = identityCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    public Person(){

    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
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
        return  "fullName: " + fullName +
                ", birthday: " + birthday +
                ", gender: " + gender +
                ", identityCard: " + identityCard +
                ", phoneNumber: " + phoneNumber +
                ", email: " + email;
    }
}
