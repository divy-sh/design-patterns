package abstractfactory;

import abstractfactory.button.Button;
import abstractfactory.checkbox.CheckBox;
import abstractfactory.gui.GUIFactory;

class Application {
    private Button button;
    private CheckBox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckBox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}