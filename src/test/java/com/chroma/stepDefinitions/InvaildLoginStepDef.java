package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.stepsImplementation.InvaildLoginStepImpl;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class InvaildLoginStepDef extends PageInitializer {

    @Given("a user is on the login page {string}")
    public void a_user_is_on_the_login_page(String url) {
        InvaildLoginStepImpl.userOnLoggingPage(url);
    }
    @When("user logs in with invaild credentials username {string} and password {string}")
    public void user_logs_in_with_invaild_credentials_username_and_password(String userName, String password) {
       InvaildLoginStepImpl.invaildCredentials(userName, password);
    }
    @Then("user sees invalid message {string}")
    public void user_sees_invalid_message(String invalidUsernameOrPassword) {
       InvaildLoginStepImpl.invaildLoginMessage(invalidUsernameOrPassword);
    }   
}
