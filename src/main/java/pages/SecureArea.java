package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureArea {
    private final By statusAlert = By.id("flash");
    private WebDriver driver;

    public SecureArea(WebDriver driver) {
        this.driver = driver;
    }

    public String checkStatusAlert() {
        return driver.findElement(statusAlert).getText();
    }
}
