package gr.aueb.cf.ch7.exersices;

import java.util.Scanner;

public class JuliusCeasar {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nonEncryption;
        String encryption;
        String decrypted;
        int pivot = 3;

        System.out.println("Enter the non-encrypted word: ");
        nonEncryption = in.next();

        encryption = encrypt(nonEncryption);
        decrypted = decrypt(encryption);

        System.out.println("The encrypted word is: " + encryption);

        System.out.println("The decrypted word is: " + decrypted);


    }

    public static String encrypt(String input) {
        StringBuilder ecnryptedString = new StringBuilder();

            for (int i =0; i < input.length(); i++) {
                char c = input.charAt(i);
                ecnryptedString.append((char) (c + 1));
            }

            return ecnryptedString.toString();
    }

    public static String decrypt(String input) {
        StringBuilder decryptedString = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            decryptedString.append((char) (c - 1));
        }

        return decryptedString.toString();
    }
}
