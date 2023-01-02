package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LargeDomPage {
    private WebDriver driver;
    private final By largeTable = By.id("large-table");

    public LargeDomPage(WebDriver driver) {
        this.driver = driver;
    }

    public void scrollToTable(){
        WebElement tableElement = driver.findElement(largeTable);
        String script = "arguments[0].scrollIntoView();";
        ((JavascriptExecutor)driver).executeScript(script, tableElement);

    }
}
