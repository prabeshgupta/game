//Creation of Thread using Runnable interface
public class Level implements Runnable {

    public static final String ANSI_RESET = "\u001B[0m";
    public final static String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";

    // Synchronized method
    synchronized public void run() {

        // Array of time
        String[] times = { "Nine", "Eight", "Seven", "Six", "Five", "Four", "Three", "Two", "One", "Zero" };

        for (int i = 0; i < times.length; i++) {
            // Synchronized block
            synchronized (this) {
                try {

                    // Set Timer sleep
                    Thread.sleep(2499);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            if (i < times.length - 1) {
                System.out.println(ANSI_YELLOW + "  Tick Tik:  " + times[i] + ANSI_RESET);
            } else {
                System.out.println(ANSI_RED_BACKGROUND + "  Boom!" + ANSI_RESET);
                System.exit(0);
            }
        }
    }

}
