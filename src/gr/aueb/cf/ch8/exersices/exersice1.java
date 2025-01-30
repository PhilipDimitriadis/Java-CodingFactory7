package gr.aueb.cf.ch8.exersices;

import java.util.Scanner;

public class exersice1 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;

        while (true) {
            try {
                printMenu();
                choice = getChoice();
                if (choice == 5) break;
                printChoice(choice);
            } catch (IllegalArgumentException e) {
                System.out.println("Λάθος επιλογή");
            }
        }
        System.out.println("Έξοδος προγράμματος");
    }

    public static void printMenu() {
        System.out.println("Επιλέξτε ένα από τα παρακάτω: ");
        System.out.println("1. Επιλογή 1");
        System.out.println("2. Επιλογή 2");
        System.out.println("3. Επιλογή 3");
        System.out.println("4. Επιλογή 4");
        System.out.println("5. Έξοδος");
    }

    public static int getChoice() {
        int choice = 0;

        while (!in.hasNextInt()) {
            System.out.println("Εισάγετε ένα ακέραιο μεταξύ 1-5");
            in.nextLine();
        }
        choice = in.nextInt();
        in.nextLine();

        try {
            if (!isValidChoice(choice)) throw new IllegalArgumentException("Error. Choice must be between 1-5");
            return choice;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public static boolean isValidChoice(int choice) {
        return (choice >= 1) && (choice <= 5);
    }

    public static void printChoice(int choice) {
        System.out.println("Επιλογή: " + choice);
    }
}
