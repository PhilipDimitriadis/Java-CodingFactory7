package gr.aueb.cf.ch6.Exersices;

import java.util.Scanner;

public class exersice4 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] numbers = new int[6];

        System.out.println("Please enter 6 numbers");

        for (int i = 0; i < numbers.length; i++) {
            int num;
            while (true) {
                System.out.println("Enter number " + (i + 1) + ": ");
                num = in.nextInt();

                if (num >= 1 && num <= 49) {
                    numbers[i] = num;
                    break;
                }
                else {
                    System.out.println("Invalid number!");
                }
            }
        }
    }

    public static boolean moreThanThreeEvens(int[] arr) {
        if (arr == null) return false;
        int evens = 0;
        for (int item : arr) {
            if (item % 2 == 0) {
                evens++;
            }
        }
        return evens > 3;
    }

    public static boolean moreThanThreeOdds(int[] arr) {
        if (arr == null) return false;
        int odds = 0;
        for (int items : arr) {
            if (items % 2 != 0) {
                odds++;
            }
        }
        return odds > 3;
    }

    public static boolean moreThanThreeConsecutives(int[] arr) {
        if (arr == null) return false;
        int cons = 0;
        for (int i = 0; i < arr.length - 3; i++) {
            if ((arr[i] == arr[i+1] - 1) && (arr[i] == arr[i + 2] -2)) {
                cons++;
            }
        }
        return cons >= 1;
    }

    public static boolean moreThanThreeEndings(int[] arr) {
        int[] endings = new int[10];
        boolean hasSameEndings = false;

        for (int item : arr) {
            endings[item % 10]++;
        }

        for (int item : endings) {
            if (item >= 3) {
                hasSameEndings = true;
                break;
            }
        }
        return hasSameEndings;
    }

    public static boolean moreThanThreeDecades(int[] arr) {
        int[] endings = new int[10];
        boolean hasSameDecades = false;

        for (int item : arr) {
            endings[item % 10]++;
        }

        for (int item : endings) {
            if (item >= 3) {
                hasSameDecades = true;
                break;
            }
        }
        return hasSameDecades;
    }
}
