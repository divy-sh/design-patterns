package memento;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        History history = new History();

        editor.write("Hello, ");
        history.push(editor.save());  // Save state

        editor.write("World!");
        System.out.println("Current Text: " + editor.getText());  // Hello, World!

        editor.restore(history.pop());  // Undo
        System.out.println("After Undo: " + editor.getText());    // Hello,
    }
}
