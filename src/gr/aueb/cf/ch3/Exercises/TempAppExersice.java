package gr.aueb.cf.ch3.Exercises;

import java.util.Scanner;

public class TempAppExersice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tempcelsius=0;
        int tempf=0;

        System.out.println("Δώστε μία θερμοκρασία (F):");
        tempf = in.nextInt();

        tempcelsius = 5 * (tempf - 32) / 9;

        System.out.println("Η θερμοκρασία σε βαθμούς Κελσίου είναι: " + tempcelsius);
    }
}
