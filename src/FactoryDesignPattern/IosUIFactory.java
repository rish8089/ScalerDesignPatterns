package FactoryDesignPattern;

import FactoryDesignPattern.buttons.Button;
import FactoryDesignPattern.buttons.IosButton;
import FactoryDesignPattern.dropdowns.Dropdown;
import FactoryDesignPattern.dropdowns.IosDropdown;
import FactoryDesignPattern.menus.IosMenu;
import FactoryDesignPattern.menus.Menu;

public class IosUIFactory implements UIFactory{

    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public Menu createMenu() {
        return new IosMenu();
    }

    @Override
    public Dropdown createDropdown() {
        return new IosDropdown();
    }
}
