package keys;

import base.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

public class KeysTests extends BaseTest {
    @Test
    public void testBackspace() {
        var keyPressPage = mainPage.clickKeyPressLink();
        keyPressPage.enterText("keySent" + Keys.BACK_SPACE);
        Assertions.assertEquals(keyPressPage.getResult(), "You entered: BACK_SPACE");
    }

    @Test
    public void testPi() {
        var keyPressPage = mainPage.clickKeyPressLink();
        keyPressPage.enterPi();
        keyPressPage.getResult();
    }
}
