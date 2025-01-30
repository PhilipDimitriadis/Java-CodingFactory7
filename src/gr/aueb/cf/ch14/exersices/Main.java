package gr.aueb.cf.ch14.exersices;

public class Main {

    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.logMessage("Error message");

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Max: " + MathHelper.findMax(numbers));
        System.out.println("Min: " + MathHelper.findMin(numbers));
        System.out.println("Average: " + MathHelper.findAverage(numbers));

        String text = "madam";

        System.out.println("Reversed: " + StringUtils.reverse(text));
        System.out.println("To Upper Case: " + StringUtils.upperCase(text));
        System.out.println("Is it palindrome: " + StringUtils.isPalindrome(text));

        String str = "Hello";
        int number = 10;

        System.out.println("String length: " + ValidationUtils.strLength(str));
        System.out.println("Number is between 1 and 10: " + ValidationUtils.between1and10(number));
    }
}
