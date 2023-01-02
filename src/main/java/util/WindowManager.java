package util;

import logger.CustomLogger;
import org.openqa.selenium.WebDriver;

public class WindowManager {
    private WebDriver driver;
    private WebDriver.Navigation navigation;

    public WindowManager(WebDriver driver) {
        this.driver = driver;
        navigation = driver.navigate();
    }

    public void goBack() {
        navigation.back();
    }

    public void goForward() {
        navigation.forward();
    }

    public void refreshPage() {
        navigation.refresh();
    }

    public void gotTo(String url) {
        navigation.to(url);
    }

    public void switchToTab(String tabTitle) {
        var windows = driver.getWindowHandles();
        CustomLogger.logger.info("Number of tabs: " + windows.size());
        CustomLogger.logger.info("Present tabs: " + windows);

        for (String window : windows) {
            CustomLogger.logger.info("Switching to window" + window);
            driver.switchTo().window(window);
            CustomLogger.logger.info("Window title: " + driver.getTitle());
            if (tabTitle.equals(driver.getTitle())) {
                break;
            }
        }
    }
}
