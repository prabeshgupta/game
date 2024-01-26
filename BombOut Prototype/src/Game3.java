import java.util.Random;
import java.util.Scanner;

public class Game3 {
    public static final String ANSI_RESET = "\u001B[0m";

    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";

    public void game3() {
        Level l3 = new Level();
        Thread t3 = new Thread(l3);
        t3.start();

        String lChars = "abcdefghijklmnopqrstuvwxyz";
        String uChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String nums = "0123456789";
        String combo = lChars + uChars + nums;

        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        String ranText = "";
        String userText = "";

        char[] text = new char[3];

        // Nested for loop, it will execute the loop 4 times so that user have to input
        // 4 answers correctly
        for (int k = 0; k < 5; k++) {

            // For generating random text of length 3
            for (int j = 0; j < 3; j++) {

                text[j] = combo.charAt(ran.nextInt(combo.length()));

            }
            ranText = new String(text);
            System.out.print("Type " + ranText + " => ");
            userText = sc.nextLine();

            if (!ranText.equals(userText)) {
                System.out.println(ANSI_RED_BACKGROUND + "Bomb is blasted!" + ANSI_RESET);
                System.exit(0);

            }
        }

        if (ranText.equals(userText)) {
            System.out.println(ANSI_GREEN_BACKGROUND + "Bomb is diffused!" + ANSI_RESET);
            System.exit(0);

        }

        sc.close();
    }

}
