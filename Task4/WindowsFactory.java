package Task4;

public class WindowsFactory implements Factory {
    @Override
    public OS createOS() {
        return new Windows();
    }
}
