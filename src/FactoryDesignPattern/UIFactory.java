package FactoryDesignPattern;

import FactoryDesignPattern.buttons.Button;
import FactoryDesignPattern.dropdowns.Dropdown;
import FactoryDesignPattern.menus.Menu;

public interface UIFactory {
    Button createButton();
    Menu createMenu();
    Dropdown createDropdown();
}
