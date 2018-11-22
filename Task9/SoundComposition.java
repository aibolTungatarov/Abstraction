package Task9;

import java.util.ArrayList;

public class SoundComposition extends Music{
    private ArrayList sounds = new ArrayList<Sound>();
    void add(Sound sound){
        sounds.add(sound);
    }
    @Override
    public void setRate(double rate) {
        for (Object sound : sounds) {
            ((Sound) sound).setRate(rate);
        }
    }

    @Override
    public void play() {
        for (Object sound : sounds) {
            ((Sound) sound).play();
            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void setVolume(double volume) {
        for (Object sound : sounds) {
            ((Sound) sound).setVolume(volume);
        }
    }

    @Override
    public void setCycleCount(int count) {
        for (Object sound : sounds) {
            ((Sound) sound).setCycleCount(count);
        }
    }
}
