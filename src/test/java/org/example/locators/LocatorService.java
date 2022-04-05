package org.example.locators;

import org.example.locators.Android.AndroidFormsPageLocators;
import org.example.locators.Android.AndroidLoginPageLocators;
import org.example.locators.Android.AndroidMainPageLocators;
import org.example.locators.interfaces.FormsPageLocators;
import org.example.locators.interfaces.LoginPageLocators;
import org.example.locators.interfaces.MainPageLocators;

public class LocatorService {

    public static final MainPageLocators MAIN_PAGE_LOCATORS = new AndroidMainPageLocators();
    public static final LoginPageLocators LOGIN_PAGE_LOCATORS = new AndroidLoginPageLocators();
    public static final FormsPageLocators FORMS_PAGE_LOCATORS = new AndroidFormsPageLocators();


}

