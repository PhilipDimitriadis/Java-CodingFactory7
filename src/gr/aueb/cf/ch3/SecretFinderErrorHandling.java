package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Linearize the branches and check
 * errors first
 */
public class SecretFinderErrorHandling {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        final int SECRET = 12;
        boolean isSuccess = false;

        while (true) {
            System.out.println("Insert a num to guess the secret");
            num = in.nextInt();

            if (num != SECRET) {
                System.out.println("Try Again");
                continue;
            }

            System.out.println("Bingo!");
            break;
        }
    }
}
