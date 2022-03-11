package ss19_string_regex.bai_tap.validate_phone;

import java.util.regex.Pattern;

public class PhoneValidation {
    private static final String PHONE_REGEX = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";

    public PhoneValidation() {
    }

    public boolean validate(String phone) {
        return Pattern.matches(PHONE_REGEX, phone);
    }
}
