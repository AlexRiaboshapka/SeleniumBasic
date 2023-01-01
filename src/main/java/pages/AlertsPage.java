package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {
    WebDriver driver;
    private final By triggerAlertButton = By.xpath("//button[text()='Click for JS Alert']");
    private final By triggerConfirmButton = By.xpath("//button[text()='Click for JS Confirm']");
    private final By triggerPromptButton = By.xpath("//button[text()='Click for JS Prompt']");
    private final By alertResult = By.id("result");

    public AlertsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void triggerAlert() {
        driver.findElement(triggerAlertButton).click();
    }

    public void triggerConfirm() {
        driver.findElement(triggerConfirmButton).click();
    }

    public void triggerPrompt() {
        driver.findElement(triggerPromptButton).click();
    }

    public void click_toAcceptAlert() {
        driver.switchTo().alert().accept();
    }

    public void alert_clickToDismissAlert() {
        driver.switchTo().alert().dismiss();
    }

    public void alert_sendKeys(String text) {
        driver.switchTo().alert().sendKeys(text);
    }

    public String alert_getText() {
        return driver.switchTo().alert().getText();
    }

    public String getResult() {
        return driver.findElement(alertResult).getText();
    }
}
