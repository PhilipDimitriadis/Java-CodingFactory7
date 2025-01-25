package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class PrintStreamWithMethod {

    public static void main(String[] args) {

        try (PrintStream ps = new PrintStream(new FileOutputStream("D:/Philip/Documents/Coding Factory/Java/file7-ps.txt", true))) {

            printMessage(ps, "Hello Coding Factory!");
            printMessage(System.out, "Hello CF!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Generic PrintStream method
     * @param ps        the input PrintStream
     * @param message   the input message
     */
    public static void printMessage(PrintStream ps, String message) {
        ps.println(message);
    }
}
