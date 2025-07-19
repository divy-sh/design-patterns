package memento;

import java.util.Stack;

public class History {
    private Stack<TextMemento> history = new Stack<>();

    public void push(TextMemento memento) {
        history.push(memento);
    }

    public TextMemento pop() {
        if (!history.isEmpty()) {
            return history.pop();
        }
        return null;
    }
}
