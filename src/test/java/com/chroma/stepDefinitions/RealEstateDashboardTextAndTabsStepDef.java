package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import com.chroma.web.JavascriptUtils;
import com.chroma.web.WebDriverUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class RealEstateDashboardTextAndTabsStepDef extends PageInitializer {

    @Given("a real estate admin is on the login page {string}")
    public void a_real_estate_admin_is_on_the_login_page(String url) {
        WebDriverUtils.driver.get(url);
    }

    @Given("admin logs in with valid credentials email {string} and password {string}")
    public void admin_logs_in_with_valid_credentials_email_and_password(String email, String password) throws InterruptedException {
        realEstateLoginPage.emailUserTextBox.sendKeys(email);
        realEstateLoginPage.passwordUserTextBox.sendKeys(password);
        realEstateLoginPage.loginButton.click();
        Thread.sleep(2000);
    }
}
