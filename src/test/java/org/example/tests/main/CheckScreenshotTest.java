package org.example.tests.main;

import io.qameta.allure.Description;
import org.example.base.BaseTest;
import org.example.listeners.AllureListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(AllureListener.class)
public class CheckScreenshotTest extends BaseTest {

    @Test
    @Description("Проверяем UI главной страницы с помощью скриншота.")
    public void CheckMainPageScreenshot() {
        openApp()
                .checkScreenshot();
    }
}

