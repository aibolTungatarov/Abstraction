package Task6;

import java.util.Stack;

public class TextArea {
    String text = "";
    String buffer;
    Stack<String> history;
    TextArea(){
        history = new Stack<String>();
    }
    public void writeText(String text){
        history.push(this.text);
        this.text = text;
    }
    public void copy(){
        this.buffer = this.text;
        System.out.println("Text was coppied");
    }
    public void cut(){
        history.push(this.text);
        this.buffer = this.text;
        this.text = "";

    }
    public void paste(){
        history.push(this.text);
        this.text += this.buffer;

    }
    public void undo(){
        this.text = history.peek();
    }

}
