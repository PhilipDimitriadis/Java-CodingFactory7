package gr.aueb.cf.ch14.exersices;

public class ValidationUtils {

    public static boolean strLength(String str) {
        if (str == null) {
            return false;
        }
        int length = str.length();
        return length >= 1 && length <= 31;
    }

    public static boolean between1and10(int number) {
        return number >=1 && number <= 10;
    }
}
