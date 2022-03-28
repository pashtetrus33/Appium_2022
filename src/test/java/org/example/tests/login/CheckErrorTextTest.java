package org.example.tests.login;

import io.qameta.allure.Description;
import org.example.base.BaseTest;
import org.example.listeners.AllureListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(AllureListener.class)
public class CheckErrorTextTest extends BaseTest {

    public static final String VALID_EMAIL_ADDRESS = "Please enter a valid email address";

    @Test
    @Description("Проверяем сообщение об ошибке при невалидной email.")
    public void CheckEmptyEmail() {
        openApp()
                .clickLoginMenuButton()
                .clickLoginButton()
                .checkLoginErrorText(VALID_EMAIL_ADDRESS);
    }
}

