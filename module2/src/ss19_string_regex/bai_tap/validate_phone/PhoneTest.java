package ss19_string_regex.bai_tap.validate_phone;

import java.util.Scanner;

public class PhoneTest {
    public static void main(String[] args) {
        PhoneValidation phoneValidation = new PhoneValidation();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Phone number: ");
        String phoneNumber = scanner.nextLine();

        if (phoneValidation.validate(phoneNumber)) {
            System.out.println(phoneNumber + " is valid");
        } else {
            System.out.println(phoneNumber + " is invalid");
        }
    }
}
