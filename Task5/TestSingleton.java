package Task5;

public class TestSingleton {
    public static void main(String args[]){
        new Thread(new Runnable() {
            @Override
            public void run() {
                LoggerSingleton logger1 = LoggerSingleton.getInstance();
                logger1.logError("113211", "HIGH");
                logger1.logConnection("122.13.1.3", "12:36");
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                LoggerSingleton logger2 = LoggerSingleton.getInstance();
                logger2.logError("11251", "LOW");
                logger2.logConnection("122.10.0.7", "11:36");
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                LoggerSingleton logger3 = LoggerSingleton.getInstance();
                logger3.logConnection("28.100.0.19", "06:37");
                logger3.logChange("File exam.txt", "07:44");
            }
        }).start();
    }
}