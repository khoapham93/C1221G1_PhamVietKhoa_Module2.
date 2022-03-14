package oop_collection_exception_regex_review.manager_vehicle_save_to_file.util;

import javax.sound.midi.Soundbank;
import java.util.Scanner;
import java.util.regex.Pattern;

public class TestValidation {
    public static void main(String[] args) {
        String REGEX = "^\\p{Lu}\\p{Ll}+( \\p{Lu}\\p{Ll}+)*$";
        Scanner scanner= new Scanner(System.in);
        System.out.print("Nhập ký tự: ");
        String string = scanner.nextLine();
        System.out.println(Pattern.matches(REGEX,string));
    }
}
