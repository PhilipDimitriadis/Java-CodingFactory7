package gr.aueb.cf.ch9.exersices;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class LocationsExersice {

    public static void main(String[] args) {
        String inFile = "/Users/filipposdimitriadis/Documents/locations2.txt";
        String outFile = "/Users/filipposdimitriadis/Documents/formatted-locations2.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inFile));
             PrintStream ps = new PrintStream(outFile, StandardCharsets.UTF_8)) {

            String line;
            String firstLine = reader.readLine();
            String[] tokens;
            String[] headerTokens = firstLine.split(",");

            while ((line = reader.readLine()) != null) {
                tokens = line.split(",");
                ps.printf("{ location: '%s', latitude: %s, longitude: %s },\n", tokens[0], tokens[1], tokens[2]);
                System.out.printf("{ location: '%s', latitude: %s, longitude: %s },\n", tokens[0], tokens[1], tokens[2]);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

    }
}
