package gr.aueb.cf.ch9.exersices;

import java.util.Scanner;

public class GetUserInputApp {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
       int num = getInput("Please enter a valid number: ");

        System.out.println("The valid number you entered is: " + num);

    }

    private static int getInput(String message) {
        while(true) {
            System.out.print(message);
            String userInput = in.nextLine();
            try {
                return Integer.parseInt(userInput);
            } catch (Exception e) {
                System.out.printf("%s isn't a number%n", userInput);
            }
        }
    }
}
