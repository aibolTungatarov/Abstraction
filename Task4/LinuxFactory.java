package Task4;

public class LinuxFactory implements Factory{
    @Override
    public OS createOS() {
        return new Linux();
    }
}
