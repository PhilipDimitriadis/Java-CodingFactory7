package gr.aueb.cf.ch4.Exersices;

import java.util.Scanner;

public class StarExersice {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;

        System.out.println("Please give the number of stars: ");
        n = in.nextInt();

        //Horizontal Star
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }

        //Vertical Stars
        for (int i = 1; i <= n; i++) {
                System.out.println("*");
        }

        //Star nxn
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //Ascending
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //Descending
        for (int i = 1; i <= 10; i++) {
            for (int j = 10; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
