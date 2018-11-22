package Task6;

public class TextAreaCopyCommand implements Command {
    TextArea textArea;
    TextAreaCopyCommand(TextArea textArea){
        this.textArea = textArea;
    }
    @Override
    public void execute() {
        textArea.copy();
    }
}
