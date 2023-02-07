package com.chroma.stepDefinitions;

import org.testng.Assert;
import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.WebDriverUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDef extends PageInitializer {

    @Given("Chroma Tech Academy teacher\\/admin is on a login page {string}")
    public void chroma_Tech_Academy_teacher_admin_is_on_a_login_page(String url) {
        WebDriverUtils.driver.get(url);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    @When("Chroma Tech Academy teacher\\/admin logs in with valid credentials username {string} and password {string}")
    public void chroma_Tech_Academy_teacher_admin_logs_in_with_valid_credentials_username_and_password(String login,
            String password) {
        loginPage.userNameTextBox.sendKeys(login);
        loginPage.passwordTextBox.sendKeys(password);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
        loginPage.signButton.click();
    }

    @Then("Chroma Tech Academy teacher\\/admin is succesfully loged in on CTSMS web page {string}")
    public void chroma_Tech_Academy_teacher_admin_is_succesfully_loged_in_on_CTSMS_web_page(String url) {
        String actualHomePageURL = WebDriverUtils.driver.getCurrentUrl();
        Assert.assertEquals(actualHomePageURL, url);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }
}
