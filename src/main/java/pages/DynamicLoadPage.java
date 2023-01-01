package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadPage {
    private final WebDriver driver;

    private final String linkXpath_format = ".//a[contains(text(), '%s')]";
    private final By linkExample1 = By.xpath(String.format(linkXpath_format,"Example 1"));

    public DynamicLoadPage(WebDriver driver) {
        this.driver = driver;
    }

    public DynamicLoadExample1Page clickOnExample1Button() {
        driver.findElement(linkExample1).click();
        return new DynamicLoadExample1Page(driver);
    }


}
