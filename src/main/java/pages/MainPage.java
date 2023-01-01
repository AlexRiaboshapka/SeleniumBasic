package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {

    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    private void clickLink(String linkText) {
        driver.findElement(By.linkText(linkText)).click();
    }

    public LoginPage clickFormAuthentication() {
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    public DropDownPage clickDropDownLink() {
        clickLink("Dropdown");
        return new DropDownPage(driver);
    }

    public HoversPage clickHoverLink() {
        clickLink("Hovers");
        return new HoversPage(driver);
    }

    public KeyPressPage clickKeyPressLink() {
        clickLink("Key Presses");
        return new KeyPressPage(driver);
    }

    public AlertsPage clickAlertsLink() {
        clickLink("JavaScript Alerts");
        return new AlertsPage(driver);
    }

    public FileUploadPage clickFileUploadLink() {
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }

    public EditorPage clickWYSIWYGEditorLink() {
        clickLink("WYSIWYG Editor");
        return new EditorPage(driver);
    }

    public DynamicLoadPage clickDynamicLoadingLink() {
        clickLink("Dynamic Loading");
        return new DynamicLoadPage(driver);
    }
}
