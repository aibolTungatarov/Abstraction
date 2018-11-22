package Task9;

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.File;
import java.util.ArrayList;


public class Test extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        ArrayList sounds = new ArrayList<Sound>();

        File source = new File("/Users/macpro/Desktop/Aibol/Abstraction/src/src/Task9/resources");
        String[] files = source.list();
        assert files != null;
        for (Object file : files) {
            sounds.add(new Sound("resources/" + file.toString()));
        }

        SoundComposition soundComposition = new SoundComposition();
        for(Object sound: sounds){
            soundComposition.add((Sound) sound);
        }
        soundComposition.play();
    }
}

