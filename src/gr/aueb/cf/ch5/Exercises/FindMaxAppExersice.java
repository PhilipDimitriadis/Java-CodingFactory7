package gr.aueb.cf.ch5.Exercises;

import java.util.Scanner;

public class FindMaxAppExersice {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = 0;
        double b = 0;
        double c = 0;

        System.out.println("Give 3 integers");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

//        System.out.println("The max number is: " + findMax(a, b, c));
        System.out.println("The max number is: " + findMax2(a, b, c));

    }

//    public static double findMax(double a, double b, double c) {
//        double max1 = Math.max(a, b);
//        double max2 = Math.max(b, c);
//
//        if (max1 > max2) {
//            return max1;
//        } else {
//            return max2;
//        }
//    }

    public static double findMax2(double a, double b, double c) {
        double max1 = Math.max(a, b);
        double max2 = Math.max(b, c);

        return Math.max(max1, max2);
    }
}
