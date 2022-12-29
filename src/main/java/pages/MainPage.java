package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    private final By formAuthenticationLink = By.linkText("Form Authentication");
    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage clickFormAuthentication() {
        driver.findElement(formAuthenticationLink).click();
        return new LoginPage(driver);
    }
}
