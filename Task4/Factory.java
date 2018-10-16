package Task4;

public interface Factory {
    OS createOS();
    static Factory createFactoryByOs(String type){
        if(type.contains("mac"))
        {
            return new MacFactory();
        }
        else if(type.contains("windows"))
        {
            return new WindowsFactory();
        }
        else if(type.contains("linux"))
        {
            return new LinuxFactory();
        }
        else {
            return null;
        }
    }
}
