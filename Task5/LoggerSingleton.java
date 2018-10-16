package Task5;
import java.io.FileWriter;
import java.io.PrintWriter;

public class LoggerSingleton {
    private static LoggerSingleton uniqueInstance;
    private final String logFile = "test.txt";
    private PrintWriter writer;
    public static synchronized LoggerSingleton getInstance(){
        if (uniqueInstance == null){
            uniqueInstance = new LoggerSingleton();
        }
        return uniqueInstance;
    }
    private LoggerSingleton() {
        try {
            FileWriter fw = new FileWriter(logFile);
            writer = new PrintWriter(fw, true);
        } catch (Exception e) {
        }
    }

    public void logError(String error, String priority) {
        writer.println("Error: " + error + ". Priority: " + priority + "!");
    }

    public void logConnection(String account, String time) {
        writer.println("Connection: " + account + " has connected at: " + time + ".");
    }

    public void logChange(String obj, String time) {
        writer.println("Change: "+ obj + " has been changed at " + time + "!");
    }
}