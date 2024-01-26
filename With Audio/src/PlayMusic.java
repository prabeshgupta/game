import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class PlayMusic {
    public void playMusic() {

        File Clap = new File("C:/Users/gamer/Documents/Coding/Java/Game Develop/Music/bomb.wav");
        sound(Clap);
    }

    static void sound(File sound) {
        try {

            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(sound));
            clip.start();

            Thread.sleep(clip.getMicrosecondLength() / 1000);

        } catch (Exception e) {

            e.printStackTrace();
        }

    }
}