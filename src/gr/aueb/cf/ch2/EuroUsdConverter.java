package gr.aueb.cf.ch2;

import java.util.Scanner;

public class EuroUsdConverter {
    public static void main(String[] args) {
        int inputEuros = 0;
        int totalUsdCents = 0;
        int usd = 0;
        int cents = 0;
        final int PARITY = 99;
        Scanner in = new Scanner(System.in);

        System.out.println("Please insert an integer amount (Euro)");
        inputEuros = in.nextInt();

        totalUsdCents = inputEuros * PARITY;
        usd = totalUsdCents / 100;
        cents = totalUsdCents % 100;

        System.out.printf("%d€ = %d$ and %d cents", inputEuros, usd, cents);
    }
}
