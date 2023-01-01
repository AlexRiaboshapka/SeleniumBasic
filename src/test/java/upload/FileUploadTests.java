package upload;

import base.BaseTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FileUploadTests extends BaseTest {
    @Test
    public void testFileUpload() {
        var uploadFilePage = mainPage.clickFileUploadLink();
        uploadFilePage.uploadFile(
                "C:/Users/oria/IdeaProjects/pure_selenium/src/test/resources/driver/chromedriver.exe");
        assertEquals("chromedriver.exe", uploadFilePage.getResult());
    }
}
