package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
<<<<<<< HEAD
import com.chroma.web.CommonUtils;
import com.chroma.web.WebDriverUtils;
=======
import com.chroma.stepsImplementation.LoginStepImpl;
>>>>>>> d37f4a0010f919e85f377489e8dbfff579daf2dc
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDef extends PageInitializer {

    @Given("Chroma Tech Academy teacher\\/admin is on a login page {string}")
    public void chroma_Tech_Academy_teacher_admin_is_on_a_login_page(String url) {
<<<<<<< HEAD
        WebDriverUtils.driver.get(url);
        CommonUtils.nonMobileScreenshots();
=======
       LoginStepImpl.adminOnLoginPage(url);
>>>>>>> d37f4a0010f919e85f377489e8dbfff579daf2dc
    }

    @When("Chroma Tech Academy teacher\\/admin logs in with valid credentials username {string} and password {string}")
    public void chroma_Tech_Academy_teacher_admin_logs_in_with_valid_credentials_username_and_password(String login,
            String password) {
<<<<<<< HEAD
        loginPage.userNameTextBox.sendKeys(login);
        loginPage.passwordTextBox.sendKeys(password);
        CommonUtils.nonMobileScreenshots();
        loginPage.signButton.click();
=======
       LoginStepImpl.adminIsLoggingIn(login, password);
>>>>>>> d37f4a0010f919e85f377489e8dbfff579daf2dc
    }

    @Then("Chroma Tech Academy teacher\\/admin is succesfully loged in on CTSMS web page {string}")
    public void chroma_Tech_Academy_teacher_admin_is_succesfully_loged_in_on_CTSMS_web_page(String url) {
<<<<<<< HEAD
        String actualHomePageURL = WebDriverUtils.driver.getCurrentUrl();
        Assert.assertEquals(actualHomePageURL, url);
        CommonUtils.nonMobileScreenshots();
=======
        LoginStepImpl.adminIsLoggedIn(url);
>>>>>>> d37f4a0010f919e85f377489e8dbfff579daf2dc
    }
}
