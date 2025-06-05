package abstractfactory.button;

public class MacButton implements Button {
    public void paint() {
        System.out.println("Render a button in macOS style.");
    }
}