package Task6;

public class UndoCommand implements Command {
    TextArea textArea;
    UndoCommand(TextArea textArea){
        this.textArea = textArea ;
    }
    @Override
    public void execute() {
        textArea.undo();
    }
}
