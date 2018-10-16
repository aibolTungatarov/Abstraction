package Task4;

public class Test {
    public static void main(String[] args) {
        String osName = System.getProperty("os.name").toLowerCase();
        Factory factory = Factory.createFactoryByOs(osName);
        OS os = factory.createOS();
        os.createTerminal();
        os.createCommandLine();
        os.createApp();
    }
}
