package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπάρχει ένα secret (integer) και ο χρήστης
 * με μία μόνο προσπάθεια θα πρέπει να τον βρει
 */
public class SecretFinder {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        final int SECRET = 12;

        System.out.println("Insert a num to guess the secret");
        num = in.nextInt();

        if (num == SECRET) {
            System.out.println("Found!");
        } else { //num != SECRET
            System.out.println("Not Found...");
        }
    }
}
