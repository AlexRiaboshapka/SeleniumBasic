package dropdown;

import base.BaseTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DropDownTests extends BaseTest {

    @Test
    public void testSelectDropDownOption() {
        var dropDownPage = mainPage.clickDropDownLink();

        String option = "Option 1";
        dropDownPage.selectFromDropDown(option);
        var selectOptions = dropDownPage.getSelectedOption();
        assertEquals(selectOptions.size(), 1);
        assertTrue(selectOptions.contains(option));
    }
}
