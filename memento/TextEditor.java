package memento;

public class TextEditor {
    private StringBuilder text = new StringBuilder();

    public void write(String newText) {
        text.append(newText);
    }

    public String getText() {
        return text.toString();
    }

    public TextMemento save() {
        return new TextMemento(text.toString());
    }

    public void restore(TextMemento memento) {
        text = new StringBuilder(memento.getState());
    }
}
