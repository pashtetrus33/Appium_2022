package org.example.tests.forms;

import io.qameta.allure.Description;
import org.example.base.BaseTest;
import org.example.listeners.AllureListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(AllureListener.class)
public class CheckScreenshotFormsPageTest extends BaseTest {

    @Test
    @Description("Проверяем UI страницы Forms с помощью скриншота.")
    public void CheckFormsPageScreenshot() {
        openApp()
                .clickFormsMenuButton()
                .checkScreenshot();
    }
}

