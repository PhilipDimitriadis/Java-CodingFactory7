package gr.aueb.cf.ch14.exersices;

public class StringUtils {

    public static String reverse(String str){
        if (str == null) {
            return null;
        }
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }

    public static String upperCase(String str){
        if (str == null) {
            return null;
        }
        return str.toUpperCase();
    }

    public static boolean isPalindrome(String str){
        if (str == null) {
            return false;
        }
        String reversedStr = reverse(str);
        return str.equals(reversedStr);
    }
}
