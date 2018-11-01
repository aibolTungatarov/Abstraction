package Task6;

public class TextAreaCutCommand implements Command{
    TextArea textArea;
    TextAreaCutCommand(TextArea textArea){
        this.textArea = textArea ;
    }
    @Override
    public void execute() {
        textArea.cut();
    }
}
