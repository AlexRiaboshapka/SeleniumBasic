package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditorPage {
    WebDriver driver;
    private String editorIframeId = "mce_0_ifr";
    private final By textArea = By.id("tinymce");
    private final By increaseIndentButton = By.xpath("//div/button[@aria-label='Increase indent']");

    public EditorPage(WebDriver driver) {
        this.driver = driver;
    }

    private void switchToEditArea() {
        driver.switchTo().frame(editorIframeId);
    }

    public void clearTextArea() {
        switchToEditArea();
        driver.findElement(textArea).clear();
        switchToMainArea();
    }

    public void setTextArea(String text) {
        switchToEditArea();
        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();
    }

    public String getTextFromEditor() {
        switchToEditArea();
        String text = driver.findElement(textArea).getText();
        switchToMainArea();
        return text;
    }


    private void switchToMainArea() {
        driver.switchTo().parentFrame();
    }

    public void clickIncreaseIndent() {
        driver.findElement(increaseIndentButton).click();
    }
}
