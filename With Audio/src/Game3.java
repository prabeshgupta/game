import java.util.Random;
import java.util.Scanner;

public class Game3 {
    public static final String ANSI_RESET = "\u001B[0m";

    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    PlayMusic bomb = new PlayMusic();
    PlayClap clap = new PlayClap();

    public void game3() {

        new Thread(new LevelHard()).start();

        String lChars = "abcdefghijklmnopqrstuvwxyz";
        String uChars = lChars.toUpperCase();
        String nums = "0123456789";
        String combo = lChars + uChars + nums;

        Scanner sc = new Scanner(System.in);
        Random ran = new Random();

        char[] text = new char[2];

        String ranText = "";
        String userText = "";

        for (int j = 0; j < 2; j++) {

            text[j] = combo.charAt(ran.nextInt(combo.length()));

        }

        ranText = new String(text);
        System.out.println("Type " + ranText + " => ");

        userText = sc.nextLine();

        if (!ranText.equals(userText)) {
            System.out.println(ANSI_RED_BACKGROUND + "Bomb is blasted!" + ANSI_RESET);
            bomb.playMusic();
            System.exit(0);

        }

        if (ranText == userText) {
            System.out.println(ANSI_GREEN_BACKGROUND + "Bomb is diffused!" + ANSI_RESET);
            clap.Playsound();
            System.exit(0);

        }

    }

}
