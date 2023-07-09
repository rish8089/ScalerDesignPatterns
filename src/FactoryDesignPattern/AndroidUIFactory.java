package FactoryDesignPattern;

import FactoryDesignPattern.buttons.AndroidButton;
import FactoryDesignPattern.buttons.Button;
import FactoryDesignPattern.dropdowns.AndroidDropdown;
import FactoryDesignPattern.dropdowns.Dropdown;
import FactoryDesignPattern.menus.AndroidMenu;
import FactoryDesignPattern.menus.Menu;

public class AndroidUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public Dropdown createDropdown() {
        return new AndroidDropdown();
    }
}
