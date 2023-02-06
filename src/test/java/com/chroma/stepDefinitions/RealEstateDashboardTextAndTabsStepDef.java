package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.WebDriverUtils;
import cucumber.api.java.en.Given;

public class RealEstateDashboardTextAndTabsStepDef extends PageInitializer {

    @Given("a real estate admin is on the login page {string}")
    public void a_real_estate_admin_is_on_the_login_page(String url) {
        WebDriverUtils.driver.get(url);
    }

    @Given("admin logs in with valid credentials email {string} and password {string}")
    public void admin_logs_in_with_valid_credentials_email_and_password(String email, String password) {
        realEstateLoginPage.emailUserTextBox.sendKeys(email);
        realEstateLoginPage.passwordUserTextBox.sendKeys(password);
        realEstateLoginPage.loginButton.click();
    }
}
