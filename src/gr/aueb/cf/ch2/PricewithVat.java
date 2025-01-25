package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Calculates the price with VAT
 */
public class PricewithVat {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final double VAT_RATE = 0.24;
        double inputPrice = 0.0;
        double priceWithVat = 0.0;
        double vat = 0.0;

        System.out.println("Please give the price");
        inputPrice = in.nextDouble();

        vat = inputPrice * VAT_RATE;
        priceWithVat = inputPrice + vat;

        System.out.printf("Price: %.2f, Vat: %.2f, Price with Vat: %.2f", inputPrice, vat, priceWithVat);

    }
}
