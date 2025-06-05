package abstractfactory.gui;

import abstractfactory.button.Button;
import abstractfactory.checkbox.CheckBox;

public interface GUIFactory {
    Button createButton();
    CheckBox createCheckBox();
}