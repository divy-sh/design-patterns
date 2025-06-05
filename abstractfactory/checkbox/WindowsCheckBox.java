package abstractfactory.checkbox;

public class WindowsCheckBox implements CheckBox {
    public void paint() {
        System.out.println("Render a checkbox in Windows style.");
    }
}