package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    WebDriver driver;
    private final By inputField = By.id("file-upload");
    private final By uploadButton = By.id("file-submit");
    private final By uploadedFile = By.id("uploaded-files");

    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickUploadButton() {
        driver.findElement(uploadButton).click();
    }

    /**
     * Provides path of file to the form then click Upload button
     *
     * @param absolutePathOfFile The complete path of the uploaded file to upload
     */
    public void uploadFile(String absolutePathOfFile) {
        driver.findElement(inputField).sendKeys(absolutePathOfFile);
        clickUploadButton();
    }

    public String getResult() {
        return driver.findElement(uploadedFile).getText();
    }
}
