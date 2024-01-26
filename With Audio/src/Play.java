import java.io.IOException;
import java.util.Scanner;

public class Play {

        public static final String ANSI_RESET = "\u001B[0m";
        public static final String ANSI_CYAN = "\u001B[36m";
        public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
        public static final String ANSI_RED_BACKGROUND = "\u001B[41m";

        public static void main(String[] args) throws InterruptedException, IOException {

                Scanner sc = new Scanner(System.in);

                System.out.println();
                System.out.println(
                                ANSI_CYAN + "b                      b                      t" + ANSI_RESET);
                System.out.println(
                                ANSI_CYAN + "b                      b                      t" + ANSI_RESET);
                System.out.println(
                                ANSI_CYAN + "b b    o o o  m     m  b b    o o o  u   u  t t t" + ANSI_RESET);
                System.out.println(
                                ANSI_CYAN + "b   b  o   o  m m m m  b   b  o   o  u   u    t" + ANSI_RESET);
                System.out.println(
                                ANSI_CYAN + "b b    o o o  m  m  m  b b    o o o  u u u u  t " + ANSI_RESET);
                System.out.println();
                System.out.println(
                                "---------------------------" + ANSI_PURPLE_BACKGROUND + "Creator: Prabesh gupta"
                                                + ANSI_RESET);
                System.out.println("Choose Level \n1. Basic\n2. Normal\n3. Hard");
                System.out.print("Enter number => ");
                int choose = sc.nextInt();

                System.out.println();
                System.out.println("Try your best to diffuse Bomb");
                System.out.println("-----------------------------");
                System.out.println();

                Game g1 = new Game();
                Game2 g2 = new Game2();
                Game3 g3 = new Game3();

                switch (choose) {
                        case 1:
                                g1.game();

                                break;
                        case 2:
                                g2.game2();

                                break;
                        case 3:
                                g3.game3();

                                break;

                        default:
                                break;
                }

        }

}
