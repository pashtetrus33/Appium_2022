package org.example.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.github.romankh3.image.comparison.ImageComparison;
import com.github.romankh3.image.comparison.ImageComparisonUtil;
import com.github.romankh3.image.comparison.model.ImageComparisonResult;
import com.github.romankh3.image.comparison.model.ImageComparisonState;
import io.qameta.allure.Step;
import org.example.locators.Android.AndroidFormsPageLocators;
import org.example.locators.LocatorService;
import org.example.locators.interfaces.FormsPageLocators;

import java.awt.image.BufferedImage;
import java.io.File;

import static com.codeborne.selenide.Selenide.$;
import static org.testng.AssertJUnit.assertEquals;

public class FormsPage {

    // Метод позволяет работать с локаторами для нужной нам страницы.
    private FormsPageLocators locator() {
        return LocatorService.FORMS_PAGE_LOCATORS;
    }


    @Step("Набираем текст в поле Input field")
    public FormsPage typeInInputField(String text) {
        Selenide.$(locator().InputField()).setValue(text);
        return new FormsPage();
    }

    @Step("Проверяем текст ошибки")
    public FormsPage checkYouHaveTypedText(String text) {
        Selenide.$(locator().YouHaveTypedFieldText()).shouldHave(Condition.text(text));
        return new FormsPage();
    }

    @Step("Делаем скриншот страницы Forms и сравниваем с требованием.")
    public FormsPage checkScreenshot() {
        // Загружаем ожидаемое изображения для сравнения.
        BufferedImage expectedImage = ImageComparisonUtil.readImageFromResources("src/test/resources/expectedScreenshots/formsPage.png");
        // Делаем актуальный скриншот, используя элемент и игнорируя другие части экрана.
        File actualScreenshot = $(locator().formsScreen()).screenshot();
        // Загружаем актуальный скриншот.
        BufferedImage actualImage = ImageComparisonUtil.readImageFromResources("screenshots/actual/" + actualScreenshot.getName());

        // Где будем хранить скриншот с различиями в случае падения теста.
        File resultDestination = new File("diff/diff_CheckMainPageScreenshot.png");

        // Сравниваем.
        ImageComparisonResult imageComparisonResult = new ImageComparison(expectedImage, actualImage, resultDestination).compareImages();
        assertEquals(ImageComparisonState.MATCH, imageComparisonResult.getImageComparisonState());
        return this;
    }
}

