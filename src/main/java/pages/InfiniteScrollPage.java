package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class InfiniteScrollPage {
    WebDriver driver;
    private final By textBlocks = By.className("jscroll-added");

    public InfiniteScrollPage(WebDriver driver) {
        this.driver = driver;
    }

    public void scrollToParagraph(int index) {
        String script = "window.scrollTo(0, document.body.scrollHeight)";
        var jsExecutor = (JavascriptExecutor) driver;
        while (getNumberOfParagraphsPresent() < index) {
            jsExecutor.executeScript(script);
        }
    }

    private int getNumberOfParagraphsPresent() {
        return driver.findElements(textBlocks).size();
    }
}
