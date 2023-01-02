package navigation;

import base.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NavigationTests extends BaseTest {
    @Test
    public void testNavigator() {
        mainPage.clickDynamicLoadingLink().clickOnExample1Button();
        getWindowManager().goBack();
        getWindowManager().refreshPage();
        getWindowManager().goForward();
    }

    @Test
    public void testTabsNavigation() {
        var multiWindowPage = mainPage.clickMultipleWindowsLink();
        multiWindowPage.clickHere();
        getWindowManager().switchToTab("New Window");
        Assertions.assertEquals("New Window", multiWindowPage.getTextField());
    }
}

