package gr.aueb.cf.ch20.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordAssertion {

    public static void main(String[] args) {
        String password = "AUEB!!32145";

        Pattern pattern = Pattern.compile("^(?!.*?[a-z])(?=.*?[A-Z])(?=.*?[0-9])(?=.*?[!?@#$%^&*()-]).{8,}$");
        Matcher matcher = pattern.matcher(password);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
