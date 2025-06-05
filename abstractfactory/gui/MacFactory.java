package abstractfactory.gui;

import abstractfactory.button.Button;
import abstractfactory.button.MacButton;
import abstractfactory.checkbox.CheckBox;
import abstractfactory.checkbox.MacCheckBox;

public class MacFactory implements GUIFactory {

    public Button createButton() {
        return new MacButton();
    }

    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }
    
}
