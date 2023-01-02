package base;

import com.google.common.io.Files;
import logger.CustomLogger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.MainPage;
import util.WindowManager;

import java.io.File;
import java.io.IOException;


public class BaseTest {
    protected MainPage mainPage;

    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
        driver = new ChromeDriver(getChromeOptions());
        driver.get("https://the-internet.herokuapp.com/");
        CustomLogger.logger.info(driver.getTitle());
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //driver.manage().window().setSize(new Dimension(390, 844));
        mainPage = new MainPage(driver);
        setCookie();
    }

    public WindowManager getWindowManager() {
        return new WindowManager(driver);
    }

    @AfterEach
    public void takeScreenshotsAndTearDown() {
        var camera = (TakesScreenshot) driver;
        File screenshot = camera.getScreenshotAs(OutputType.FILE);
        try {
            Files.move(screenshot, new File("build/test.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        driver.quit();
    }

    private ChromeOptions getChromeOptions() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
        //options.setHeadless(true);
        return options;
    }

    private void setCookie() {
        Cookie cookie = new Cookie
                .Builder("user", "123")
                .domain("the-internet.herokuapp.com").build();
        driver.manage().addCookie(cookie);
    }
}
