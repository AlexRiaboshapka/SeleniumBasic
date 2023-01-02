package login;

import base.BaseTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import pages.LoginPage;
import pages.SecureArea;

import static org.junit.jupiter.api.Assertions.assertTrue;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class LoginTests extends BaseTest {
    protected LoginPage loginPage;
    protected SecureArea secureArea;
    String expectedText = "You logged into a secure area";

    @Test
    public void testSuccessfulLogin() {
        loginPage = mainPage.clickFormAuthentication();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        secureArea = loginPage.clickLogin();
        String statusAlertText = secureArea.checkStatusAlert();
        assertTrue(statusAlertText.contains(expectedText), "Expected text is not found: "
                + expectedText + "\n" + "Actual text: " + statusAlertText);
    }
}
