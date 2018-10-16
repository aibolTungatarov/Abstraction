package Task4;

public abstract class OS {
    static String osType;

    public void createApp() {
        System.out.println(osType + "APP was created");
    }

    public void createTerminal() {
        System.out.println(osType + "Terminal was created");
    }

    public void createCommandLine() {
        System.out.println(osType + "CommandLine was created");
    }

    public static void setOsType(String osType) {
        OS.osType = osType;
    }
}
