package abstractfactory.checkbox;

public class MacCheckBox implements CheckBox {
    public void paint() {
        System.out.println("Render a checkbox in macOS style.");
    }
}