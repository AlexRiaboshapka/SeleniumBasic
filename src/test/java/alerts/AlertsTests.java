package alerts;

import base.BaseTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlertsTests extends BaseTest {
    @Test
    public void testAcceptAlert() {
        var alertsPage = mainPage.clickAlertsLink();
        alertsPage.triggerAlert();
        alertsPage.click_toAcceptAlert();
        assertEquals("You successfully clicked an alert", alertsPage.getResult());
    }

    @Test
    public void testConfirmAlert() {
        var alertsPage = mainPage.clickAlertsLink();
        alertsPage.triggerConfirm();
        assertEquals("I am a JS Confirm", alertsPage.alert_getText());
        alertsPage.alert_clickToDismissAlert();
    }

    @Test
    public void testPromptAlert() {
        var alertsPage = mainPage.clickAlertsLink();
        alertsPage.triggerPrompt();
        alertsPage.alert_sendKeys("My test");
        alertsPage.click_toAcceptAlert();
        assertEquals("You entered: My test", alertsPage.getResult());
    }
}
