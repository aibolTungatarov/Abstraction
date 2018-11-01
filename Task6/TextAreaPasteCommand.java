package Task6;

public class TextAreaPasteCommand implements Command {
    TextArea textArea;
    TextAreaPasteCommand(TextArea textArea){
        this.textArea = textArea ;
    }
    @Override
    public void execute() {
        this.textArea.paste();
    }
}
