import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Game {

    public static final String ANSI_RESET = "\u001B[0m";

    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";

    PlayMusic bomb = new PlayMusic();
    PlayClap clap = new PlayClap();

    public void game() throws InterruptedException, IOException {

        new Thread(new LevelBasic()).start();

        Scanner sc = new Scanner(System.in);
        Random ran = new Random();

        int ranNum = 0;
        int userNum = 0;

        for (int j = 0; j < 5; j++) {

            ranNum = ran.nextInt(9);
            System.out.println("Type " + ranNum + " => ");
            userNum = sc.nextInt();

            if (ranNum != userNum) {
                System.out.println(ANSI_RED_BACKGROUND + "Bomb is blasted!" + ANSI_RESET);
                bomb.playMusic();
                System.out.println(ANSI_RED_BACKGROUND + "Try Again!" + ANSI_RESET);
                System.exit(0);
                Thread.currentThread().join();
            }

        }

        if (ranNum == userNum) {
            System.out.println(ANSI_GREEN_BACKGROUND + "Bomb is diffused." + ANSI_RESET);
            System.out.println();
            clap.Playsound();
            System.out.println(ANSI_GREEN_BACKGROUND + "Well Done" + ANSI_RESET);

            System.exit(0);
        }

        sc.close();

    }

}
