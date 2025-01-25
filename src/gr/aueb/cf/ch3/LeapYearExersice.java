package gr.aueb.cf.ch3;

import java.util.Scanner;

public class LeapYearExersice {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int year = 0;
        boolean leapYear;
        boolean yearDiv4;
        boolean yearDiv100;
        boolean yearDiv400;

        System.out.println("Insert a year: ");
        year = in.nextInt();

        yearDiv4 = year % 4 == 0;
        yearDiv100 = year % 100 != 0;
        yearDiv400 = year % 400 == 0;
//        leapYear = ((year % 4 == 0) && yearDiv100) || yearDiv400;


        if (leapYear = year % 4 == 0 && yearDiv100 || yearDiv400) {
            System.out.println("That's a leap year! ");
        } else {
            System.out.println("Not a leap year");
        }

    }
}
