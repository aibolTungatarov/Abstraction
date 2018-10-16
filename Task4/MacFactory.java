package Task4;

public class MacFactory implements Factory {
    @Override
    public OS createOS() {
        return new Mac();
    }
}
