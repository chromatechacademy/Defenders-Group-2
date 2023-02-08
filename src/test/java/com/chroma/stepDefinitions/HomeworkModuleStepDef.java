package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomeworkModuleStepDef extends PageInitializer {

   @Given("a user logs in to the  website with valid credentials username{string} and password {string}")
    public void a_user_logs_in_to_the_website_with_valid_credentials_username_and_password(String username,
            String password) {
        loginPage.userNameTextBox.sendKeys(username);
        loginPage.passwordTextBox.sendKeys(password);
        loginPage.signButton.click();
    }

    @Given("user clicks on Homework section")
    public void user_clicks_on_Homework_section() {
        cTSMSNavigationModulesPage.homeworkModule.click();
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }

    @Then("following submodule displayed {string}")
    public void following_submodule_displayed(String addHomeworkString) {
        String actualAddHomeworkText = homeworkModulePage.addHomeworkSubModule.getText();
        CommonUtils.waitForVisibility(homeworkModulePage.addHomeworkSubModule);
        CommonUtils.assertEquals(actualAddHomeworkText, addHomeworkString);
        System.out.println(actualAddHomeworkText); 
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();   
    }
}