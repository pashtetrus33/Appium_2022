package org.example.locators.Android;

import io.appium.java_client.MobileBy;
import org.example.locators.interfaces.MainPageLocators;
import org.openqa.selenium.By;

public class AndroidMainPageLocators implements MainPageLocators {

    public By loginButton() {
        return MobileBy.AccessibilityId("Login");
    }

    public By formsButton() {
        return MobileBy.AccessibilityId("Forms");
    }

    public By homeScreen() {
        return MobileBy.AccessibilityId("Home-screen");
    }
}
