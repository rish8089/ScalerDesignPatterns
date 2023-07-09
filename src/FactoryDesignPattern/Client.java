package FactoryDesignPattern;

public class Client {
    public static void main(String[] args) {
        Flutter flutter=new Flutter(SupportedPlatforms.ANDROID);
        UIFactory uiFactory=flutter.createUIFactory();
        uiFactory.createButton();
        uiFactory.createMenu();
        uiFactory.createDropdown();
    }
}
