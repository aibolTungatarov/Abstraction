package Task9;

import javafx.scene.media.AudioClip;

import java.net.URL;

public class Sound extends Music{
    private AudioClip audioClip ;
    Sound(String musicFile){
        URL resource = getClass().getResource(musicFile);
        audioClip = new AudioClip(resource.toString());
    }
    @Override
    public void setRate(double rate) {
        audioClip.setRate(rate);
    }

    @Override
    public void play() {
        audioClip.play();
    }

    @Override
    public void setVolume(double volume) {
        audioClip.setVolume(volume);
    }

    @Override
    public void setCycleCount(int count) {
        audioClip.setCycleCount(count);
    }
}
