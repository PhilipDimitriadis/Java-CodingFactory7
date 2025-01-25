package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Δίνει ως output τον πολλαπλασιασμό ενός ακεραίου
 * που δίνει ο χρήστης με όλους τους ακεραίους από
 * 1 - 10
 */
public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;
        int i = 1;


        System.out.println("Enter an integer");
        inputNum = in.nextInt();

        while (i <=10) {
//            System.out.println(inputNum + " * " + i + " = " + (inputNum * i));
            System.out.printf("%d * %2d = %2d\n", inputNum, i, inputNum * i);
            i++;
        }
    }
}
