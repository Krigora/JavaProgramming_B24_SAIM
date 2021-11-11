package day57_polymorphism.driver;

public class Link implements WebElement{

    @Override
    public void sendKeys(String txt) {
        System.out.println("Not valid");
    }

    @Override
    public void click() {
        System.out.println("Opening link");
    }

    @Override
    public String getText() {
        return "Links text";
    }
}
