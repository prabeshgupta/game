import java.util.Random;
import java.util.Scanner;

public class Game4 {

    public static final String ANSI_RESET = "\u001B[0m";

    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";

    public void game4() {

        Level l4 = new Level();
        Thread t4 = new Thread(l4);
        t4.start();

        String lChars = "abcdefghijklmnopqrstuvwxyz";
        String uChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String nums = "0123456789";
        String sChars = "^?<&)]`/*#=,>+@!_{.;-($}\"'[|:%";

        String combo = lChars + uChars + nums + sChars;

        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        String userText = "";
        String result = "";

        char[] text = new char[2];

        // Nested for loop, it will execute the loop 10 times so that user have to input
        // 10 answers correctly
        for (int k = 0; k < 10; k++) {

            // For generating random text of length 2
            for (int j = 0; j < 2; j++) {

                text[j] = combo.charAt(ran.nextInt(combo.length()));

            }

            // Array of chars to String
            String ranText = new String(text);

            // Reverse String
            StringBuilder revText = new StringBuilder(ranText);
            revText.reverse();

            result = revText.toString();

            // User string input
            System.out.print("Reverse  " + ranText + " => ");
            userText = sc.nextLine();

            if (!result.equals(userText)) {
                System.out.println(ANSI_RED_BACKGROUND + "Bomb is blasted!" + ANSI_RESET);
                System.exit(0);

            }
        }

        if (result.equals(userText)) {
            System.out.println(ANSI_GREEN_BACKGROUND + "Bomb is diffused!" + ANSI_RESET);
            System.exit(0);

        }

        sc.close();

    }

}