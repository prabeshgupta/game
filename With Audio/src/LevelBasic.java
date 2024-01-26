public class LevelBasic implements Runnable {

    public static final String ANSI_RESET = "\u001B[0m";
    public final static String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";

    synchronized public void run() {

        String[] times = { "Nine", "Eight", "Seven", "Six", "Five", "Four", "Three", "Two", "One", "Zero" };

        PlayMusic bomb = new PlayMusic();

        for (int i = 0; i < times.length; i++) {
            synchronized (this) {
                try {
                    Thread.sleep(15000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            if (i < times.length - 1) {
                System.out.println(ANSI_YELLOW + "  Tick Tik:  " + times[i] + ANSI_RESET);
            } else {
                System.out.println(ANSI_RED_BACKGROUND + "  Boom!" + ANSI_RESET);
                bomb.playMusic();
                System.exit(0);
            }
        }
    }

}
