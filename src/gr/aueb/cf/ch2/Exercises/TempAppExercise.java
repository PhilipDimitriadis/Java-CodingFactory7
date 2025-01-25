package gr.aueb.cf.ch2.Exercises;

import java.util.Scanner;

public class TempAppExercise {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fahrenheit = 0;
        int celsius = 0;

        System.out.print("Please insert degrees Fahrenheit: ");
        fahrenheit = scanner.nextInt();

        celsius = 5 * (fahrenheit - 32) / 9;

        System.out.printf("%d\u2109 = %d\u2103\n", fahrenheit, celsius);
    }
}
