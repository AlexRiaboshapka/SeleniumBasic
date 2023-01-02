package javascript;

import base.BaseTest;
import logger.CustomLogger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JavaScriptTests extends BaseTest {
    @Test
    public void testScrollToTable() {
        mainPage.clickLargeDomLink().scrollToTable();
    }

    @Test
    public void testInfiniteScroll() {
        mainPage.clickInfiniteScrollLink().scrollToParagraph(10);
    }

    @Test
    public void testDropDownMultiSelect() {
        var dropDownPage = mainPage.clickDropDownLink();
        dropDownPage.addMultipleAttribute();
        String option1 = "Option 1";
        String option2 = "Option 2";
        dropDownPage.selectFromDropDown(option1);
        dropDownPage.selectFromDropDown(option2);
        var selectedOptions = dropDownPage.getSelectedOption();
        CustomLogger.logger.info("option1: " + option1);
        Assertions.assertTrue(selectedOptions.contains(option1));
        Assertions.assertTrue(selectedOptions.contains(option2), "Selected options are: " + selectedOptions);
    }
}
