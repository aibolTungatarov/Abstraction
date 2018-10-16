package Task5;

public class TestSingleton {
    public static void main(String args[]){
        LoggerSingleton logger1 = LoggerSingleton.getInstance();
        LoggerSingleton logger2 = LoggerSingleton.getInstance();
        LoggerSingleton logger3 = LoggerSingleton.getInstance();
        logger1.logError("11111", "HIGH");
        logger1.logConnection("100.10.0.82", "18:12");
        logger1.logChange("Folder bin", "00:42");
        logger2.logError("11251", "LOW");
        logger2.logConnection("122.10.0.7", "11:36");
        logger3.logConnection("28.100.0.19", "06:37");
        logger3.logChange("File exam.txt", "07:44");
    }
}