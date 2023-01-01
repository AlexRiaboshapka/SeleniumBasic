package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class DynamicLoadExample1Page {
    private final By startButton = By.xpath("//button");
    private final By loadingSpinner = By.id("loading");
    private final By loadedText = By.id("finish");
    WebDriver driver;

    public DynamicLoadExample1Page(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnStartButton() {
        driver.findElement(startButton).click();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.invisibilityOf(
//                driver.findElement(loadingSpinner)));

        FluentWait<WebDriver> wait1 = new FluentWait<>(driver).
                withTimeout(Duration.ofSeconds(10)).
                pollingEvery(Duration.ofSeconds(1)).
                ignoring(NoSuchElementException.class);
        wait1.until(ExpectedConditions.invisibilityOf(
                driver.findElement(loadingSpinner)));
    }

    public String getLoadedText() {
        return driver.findElement(loadedText).getText();
    }

}
