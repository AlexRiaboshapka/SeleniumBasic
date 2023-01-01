package load;

import base.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ElementLoadTests extends BaseTest {

    @Test
    public void testElementLoad() {
        var dynamicLoadPage = mainPage.clickDynamicLoadingLink();
        var dynamicLoadExample1Page = dynamicLoadPage.clickOnExample1Button();
        dynamicLoadExample1Page.clickOnStartButton();
        Assertions.assertEquals("Hello World!", dynamicLoadExample1Page.getLoadedText());
    }
}
