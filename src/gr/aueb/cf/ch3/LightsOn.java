package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Turn lights on if it's raining AND car is speeding (>100) OR is dark
 */
public class LightsOn {

    public static void main(String[] args) {
        final int MAX_CAR_SPEED = 100;
        Scanner in = new Scanner(System.in);
        boolean isRaining = false;
        boolean isDark = false;
        int speed = 0;
        boolean areLightsOn = false;

        System.out.println("Please insert if it's raining");
        isRaining = in.nextBoolean();

        System.out.println("Please insert if it's dark outside");
        isDark = in.nextBoolean();

        System.out.println("Please insert car speed (Km)");
        speed = in.nextInt();

        areLightsOn = isRaining && ((speed > 100) || isDark);

        System.out.println("Turn light on: " + areLightsOn);
    }
}
