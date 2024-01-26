import java.util.Random;
import java.util.Scanner;

public class Game2 {

    public static final String ANSI_RESET = "\u001B[0m";

    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";

    PlayMusic bomb = new PlayMusic();
    PlayClap clap = new PlayClap();

    public void game2() {
        new Thread(new LevelMedium()).start();

        String chars = "abcdefghijklmnopqrstuvwxyz";
        // System.out.println(chars.length());

        Scanner sc = new Scanner(System.in);
        Random ran = new Random();

        char ranCh = 0;
        char userCh = 0;

        for (int j = 0; j < 5; j++) {

            ranCh = chars.charAt(ran.nextInt(chars.length()));

            System.out.println("Type " + ranCh + " =>");
            userCh = sc.nextLine().charAt(0);

            if (ranCh != userCh) {
                System.out.println(ANSI_RED_BACKGROUND + "Bomb is blasted!" + ANSI_RESET);
                bomb.playMusic();
                System.exit(0);

            }
        }
        if (ranCh == userCh) {
            System.out.println(ANSI_GREEN_BACKGROUND + "Bomb is Diffused" + ANSI_RESET);
            clap.Playsound();
            System.exit(0);
        }

        sc.close();

    }

}
