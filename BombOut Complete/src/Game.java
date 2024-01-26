import java.util.Random;
import java.util.Scanner;

public class Game {

    public static final String ANSI_RESET = "\u001B[0m";

    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";

    public void game() {

        // Creating object of Class Level and Thread
        // Staring Thread
        new Thread(new Level()).start();

        Scanner sc = new Scanner(System.in);
        Random ran = new Random();

        int ranNum = 0;
        int userNum = 0;

        for (int j = 0; j < 5; j++) {

            // To generate Random number
            ranNum = ran.nextInt(9);
            System.out.println("Type " + ranNum + " => ");
            userNum = sc.nextInt();

            if (ranNum != userNum) {
                System.out.println(ANSI_RED_BACKGROUND + "Bomb is blasted!" + ANSI_RESET);
                System.exit(0);
            }

        }

        if (ranNum == userNum) {
            System.out.println(ANSI_GREEN_BACKGROUND + "Bomb is diffused." + ANSI_RESET);
            System.exit(0);
        }

        sc.close();

    }

}
