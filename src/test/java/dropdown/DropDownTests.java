package dropdown;

import base.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DropDownTests extends BaseTest {

    @Test
    public void testSelectDropDownOption() {
        var dropDownPage = mainPage.clickDropDownLink();

        String option = "Option 1";
        dropDownPage.selectFromDropDown(option);
        var selectOptions = dropDownPage.getSelectedOption();
        Assertions.assertEquals(selectOptions.size(), 1);
        Assertions.assertTrue(selectOptions.contains(option));

    }
}
