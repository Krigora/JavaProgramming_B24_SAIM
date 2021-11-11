package day57_polymorphism.driver;

public interface WebElement {

    void sendKeys(String txt);
    void click();
    String getText();

}

/*
create a interface WebElement

	abstract methods:
		get();
		click();
		getText();

 */