package abstractfactory.gui;

import abstractfactory.button.Button;
import abstractfactory.button.WindowsButton;
import abstractfactory.checkbox.CheckBox;
import abstractfactory.checkbox.WindowsCheckBox;

public class WindowsFactory implements GUIFactory {
    
    public Button createButton() {
        return new WindowsButton();
    }

    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
}