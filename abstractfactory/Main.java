package abstractfactory;

import abstractfactory.gui.GUIFactory;
import abstractfactory.gui.MacFactory;
import abstractfactory.gui.WindowsFactory;

public class Main {
    public static void main(String[] args) {
        GUIFactory windowsFactory = new WindowsFactory();
        Application windowsApp = new Application(windowsFactory);
        windowsApp.paint();

        GUIFactory macFactory = new MacFactory();
        Application macApp = new Application(macFactory);
        macApp.paint();
    }
}