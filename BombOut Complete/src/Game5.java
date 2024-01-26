import java.util.Random;
import java.util.Scanner;

public class Game5 {
    public static final String ANSI_RESET = "\u001B[0m";

    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";

    public void game5() {

        Level l5 = new Level();
        Thread t5 = new Thread(l5);
        t5.start();

        String lChars = "abcdefghijklmnopqrstuvwxyz";
        String uChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String nums = "0123456789";
        String sChars = "^?<&)]`/*#=,>+@!_{.;-($}\"'[|:%";

        String combo = lChars + uChars + nums + sChars;

        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        String userText = "";
        String result = "";

        char[] text = new char[4];

        // Nested for loop, it will execute the loop 5 times so that user have to input
        // 5 answers correctly
        for (int k = 0; k < 5; k++) {

            // For generating random text of length 5
            for (int j = 0; j < 4; j++) {

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

        int userNum = 0;
        int sum = 0;
        int diff = 0;
        for (int l = 0; l < 2; l++) {

            int num1 = ran.nextInt(100);
            int num2 = ran.nextInt(100);

            sum = num1 + num2;

            System.out.print("Add " + num1 + " + " + num2 + " => ");
            userNum = sc.nextInt();

            if (!(userNum == sum)) {
                System.out.println(ANSI_RED_BACKGROUND + "Bomb is blasted!" + ANSI_RESET);
                System.exit(0);

            }

        }

        for (int m = 0; m < 2; m++) {

            int num1 = ran.nextInt(100);
            int num2 = ran.nextInt(100);

            diff = num1 - num2;

            System.out.print("Diff " + num1 + " - " + num2 + " => ");
            userNum = sc.nextInt();

            if (!(userNum == diff)) {
                System.out.println(ANSI_RED_BACKGROUND + "Bomb is blasted!" + ANSI_RESET);
                System.exit(0);

            }

        }

        // Select yes or no by computer- It depends on luck
        String[] options = { "yes", "no" };
        String select = options[ran.nextInt(options.length)];

        System.out.println("Messi is better player than Christiano ronaldo ? =>  ");
        sc.nextLine();
        String player = sc.nextLine();

        if (!player.equalsIgnoreCase(select)) {
            System.out.println(ANSI_RED_BACKGROUND + "Bomb is blasted!" + ANSI_RESET);
            System.exit(0);

        } else {
            System.out.println(ANSI_GREEN_BACKGROUND + "Bomb is diffused!" + ANSI_RESET);
            System.exit(0);

        }

        sc.close();

    }
}
