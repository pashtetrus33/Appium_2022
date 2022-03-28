package org.example.tests.login;

import io.qameta.allure.Description;
import org.example.base.BaseTest;
import org.example.listeners.AllureListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(AllureListener.class)
public class CheckFailErrorTextTest extends BaseTest {

    public static final String VALID_EMAIL_ADDRESS = "Please enter a valid email address";

    @Test
    @Description("Проверяем поведения теста при падении проверки сообщения об ошибке валидного email")
    public void CheckFailEmptyEmail() {
        openApp()
                .clickLoginMenuButton()
                .clickLoginButton()
                .checkLoginErrorText(VALID_EMAIL_ADDRESS);
    }
}

