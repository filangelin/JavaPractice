package practice7.exceptions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    static void validateEmail(String mail) {
        String regex = "^[^\\s@]+@[^\\s@]+\\.[^\\s@]+$";
        Pattern emailPattern = Pattern.compile(regex);
        Matcher matcher = emailPattern.matcher(mail);
        if (!matcher.matches()) {
            throw new MailException("Невалидный адрес электронной почты");
        }
    }

    public static void main(String[] args) {
        validateEmail("test");
    }
}
