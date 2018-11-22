package Task6;

import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        TextArea textArea = new TextArea();
        textArea.writeText("Aibol");
        Command copy = new TextAreaCopyCommand(textArea);
            copy.execute();
            System.out.println(textArea.buffer + " is  buffer");
            System.out.println(textArea.text);
        Command cut = new TextAreaCutCommand(textArea);
            cut.execute();
            System.out.println(textArea.buffer + " is buffer");
            System.out.println(textArea.text);
        Command paste = new TextAreaPasteCommand(textArea);
            paste.execute();
            System.out.println(textArea.buffer + " is buffer");
            System.out.println(textArea.text);
        paste.execute();
        System.out.println(textArea.buffer + " is buffer");
        System.out.println(textArea.text);

        paste.execute();
        System.out.println(textArea.buffer + " is buffer");
        System.out.println(textArea.text);

        Command undo = new UndoCommand(textArea);
            undo.execute();
            System.out.println(textArea.buffer + " is buffer");
            System.out.println(textArea.text);

            textArea.writeText("AB");
        System.out.println(textArea.text + " End");
        textArea.cut();
        textArea.writeText("Aibol");
        System.out.println(textArea.text + " 1");
        textArea.paste();
        System.out.println(textArea.text + " 2");
        textArea.undo();
        System.out.println(textArea.text + " 3");

        Stack stack = textArea.history;
        System.out.println("_______Stack_____");
            for (int i =0;i<stack.size();i++){
                System.out.println(stack.pop());
            }
    }
}
