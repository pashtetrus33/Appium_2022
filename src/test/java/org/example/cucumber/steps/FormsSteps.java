package org.example.cucumber.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.base.BaseTest;
import org.example.pages.FormsPage;
import org.example.pages.MainPage;

public class FormsSteps extends BaseTest {
    MainPage mainpage;
    FormsPage formspage;

    @Given("User is on main page")
    public void user_is_on_main_page() {
        mainpage = openApp();
    }

    @When("User click forms button")
    public void user_go_to_forms_page() {
        formspage = mainpage.clickFormsMenuButton();
    }

    @Then("User should see screen as shown on screenshot")
    public void user_should_see_screen_as_shown_on_screenshot() {
        formspage.checkScreenshot();
    }


    @And("User type {string} in input field")
    public void userTypeInInputField(String text) {
        formspage.typeInInputField(text);
    }

    @Then("User should see the same text {string}")
    public void userShouldSeeTheSameText(String text) {
        formspage.checkYouHaveTypedText(text);
    }
}
