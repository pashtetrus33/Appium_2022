package org.example.tests.forms;

import io.qameta.allure.Description;
import org.example.base.BaseTest;
import org.example.listeners.AllureListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(AllureListener.class)
public class CheckYouHaveTypedFieldTextTest extends BaseTest {

    public static final String INPUT_FIELD_TEXT = "Hello world!";

    @Test
    @Description("Проверяем текст отображаемый в You Have Typed Field.")
    public void CheckYouHaveTypedFieldText() {
        openApp()
                .clickFormsMenuButton()
                .typeInInputField("Hello world!")
                .checkYouHaveTypedText(INPUT_FIELD_TEXT);
    }
}

