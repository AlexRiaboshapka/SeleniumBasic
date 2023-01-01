package iframes_editor;

import base.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EditorTests extends BaseTest {

    @Test
    public void testEditor() {
        var editorPage = mainPage.clickWYSIWYGEditorLink();
        editorPage.clearTextArea();
        String text1 = "My text ";
        String text2 = "Continue to type";
        editorPage.setTextArea(text1);
        editorPage.clickIncreaseIndent();
        editorPage.setTextArea(text2);
        Assertions.assertEquals(text1 + text2, editorPage.getTextFromEditor());
    }
}
