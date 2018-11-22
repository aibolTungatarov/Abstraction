package Task9;

import javafx.scene.media.MediaPlayer;

public class MyRunnable implements Runnable {
    MediaPlayer mediaPlayer ;
    MyRunnable(MediaPlayer mediaPlayer){
        this.mediaPlayer = mediaPlayer;
    }
    @Override
    public void run() {
        mediaPlayer.play();
    }
}
