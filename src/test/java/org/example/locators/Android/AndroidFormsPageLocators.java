package org.example.locators.Android;

import io.appium.java_client.MobileBy;
import org.example.locators.interfaces.FormsPageLocators;
import org.openqa.selenium.By;

public class AndroidFormsPageLocators implements FormsPageLocators {

    public By InputField() {
        return MobileBy.AccessibilityId("text-input");
    }

    public By YouHaveTypedFieldText() { return MobileBy.AccessibilityId("input-text-result"); }

    public By formsScreen() {
        return MobileBy.AccessibilityId("Forms-screen");
    }
}


