package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Να λαμβάνει ως input από τον χρήστη ένα
 * διψήφιο ακέραιο και να υπολογίζει και να
 * εκτυπώνει το άθροισμα των ψηφίων του.
 * Για παράδειγμα, αν ο χρήστης δώσει τον ακέραιο 15, θα πρέπει το αποτέλεσμα να είναι
 * 1 + 5 = 6
 */
public class DigitsSum {

    public static void main(String[] args) {
        int digit = 0;
        int digitLeft = 0;
        int digitRight = 0;
        int sum = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter a double digit integer");
        digit = in.nextInt();

        digitLeft = digit / 10;
        digitRight = digit % 10;
        sum = digitLeft + digitRight;

        System.out.printf("Το άθροισμα του %d και του %d είναι: %d", digitLeft, digitRight, sum);
    }
}
