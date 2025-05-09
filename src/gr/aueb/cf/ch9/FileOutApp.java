package gr.aueb.cf.ch9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FileOutApp {

    public static void main(String[] args) {
        File inFd = new File("D:/Philip/Documents/Coding Factory/Java/file7.txt");
        File outFd = new File("D:/Philip/Documents/Coding Factory/Java/file7-out.txt");
        String line;
        String[] tokens;

        try (Scanner in = new Scanner(inFd);
        PrintStream ps = new PrintStream(outFd, StandardCharsets.UTF_8)) {
            while (in.hasNextLine()) {
                line = in.nextLine();
                tokens = line.split("\\s+");

                for (String token : tokens) {
                    System.out.println(token + " ");
                    ps.printf("%s ", token);
                    ps.flush();
                }
                System.out.println();
                ps.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
