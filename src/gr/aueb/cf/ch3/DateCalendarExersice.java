package gr.aueb.cf.ch3;

import java.util.Scanner;

public class DateCalendarExersice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int day = 0;
        int month = 0;
        int year = 0;

        System.out.println("What's the date? (date/month/year)");
        day = in.nextInt();
        month = in.nextInt();
        year = in.nextInt();

        System.out.printf("Date: %02d/%02d/%d", day, month, year);
    }
}
