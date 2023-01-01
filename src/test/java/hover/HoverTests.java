package hover;

import base.BaseTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HoverTests extends BaseTest {

    @Test
    public void testHoverUser1() {
        String expectedLinkEnd = "/users/1";

        var hoversPage = mainPage.clickHoverLink();
        var caption = hoversPage.hoverOverFigure(1);
        assertTrue(caption.isCaptionDisplayed(), "Caption is not Displayed");
        String actualLink = caption.getLink();
        assertAll(
                () -> assertEquals(caption.getTitle(), "name: user1"),
                () -> assertEquals(caption.getLinkText(), "View profile"),
                () -> assertTrue(caption.getLink().contains(expectedLinkEnd), "Actual link: "
                        + actualLink + " don't contains expected text: " + expectedLinkEnd)
        );
    }
}
