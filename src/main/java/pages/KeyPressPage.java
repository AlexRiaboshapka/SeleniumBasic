package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressPage {
    private final By inputField = By.id("target");
    private final By resultField = By.id("result");
    private WebDriver driver;

    public KeyPressPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterText(String text) {
        driver.findElement(inputField).sendKeys(text);
    }

    public String getResult() {
        return driver.findElement(resultField).getText();
    }

    public void enterPi() {
        enterText(Keys.ALT + Keys.chord(Keys.NUMPAD2, Keys.NUMPAD2, Keys.NUMPAD7) + "=3.14");
    }
}
