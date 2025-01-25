package gr.aueb.cf.ch2;

import java.util.Locale;
import java.util.Scanner;

public class DateTimeToSecondsConverter {
    public static void main(String[] args) {
        final int SECONDS_PER_DAY = 3600 *24;
        final int SECONDS_PER_HOUR = 3600;
        final int SECONDS_PER_MINUTE = 60;

        Scanner in = new Scanner(System.in);
        int inputdays;
        int inputhours;
        int inputminutes;
        int inputseconds;
        int totalseconds = 0;

        System.out.println("Παρακαλώ δώστε ημέρες, ώρες, λεπτά και δευτερόλεπτα");
        inputdays = in.nextInt();
        inputhours = in.nextInt();
        inputminutes = in.nextInt();
        inputseconds = in.nextInt();
        totalseconds = inputdays * SECONDS_PER_DAY + inputhours * SECONDS_PER_HOUR + inputminutes * SECONDS_PER_HOUR + inputseconds;

        System.out.printf(Locale.US, "Total seconds: %,d seconds\n", totalseconds);
    }
}
