package ss19_string_regex.bai_tap.validate_class_name;

import java.util.regex.Pattern;

public class ClassNameValidation {

    private static final String CLASS_NAME_REGEX = "^[CAP]\\d{4}[GHIKLM]$";

    public ClassNameValidation() {
    }
    public boolean validate(String regex) {
        return Pattern.matches(CLASS_NAME_REGEX,regex);
    }
}
