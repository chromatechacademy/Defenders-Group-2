package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.DashboardModulesPage;
import com.chroma.web.CommonUtils;
import com.chroma.web.WebDriverUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DashboardStepDef extends PageInitializer {

    // @Given("a user is on the login page {string}")
    // public void a_user_is_on_the_login_page(String url) {
    // WebDriverUtils.driver.get(url);

    // }

    // @When("user logs in with valid credentials username {string} and password
    // {string}")
    // public void user_logs_in_with_valid_credentials_username_and_password(String
    // username, String password) {

    // }

    @Then("the following modules should displayed {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void the_following_modules_should_displayed(String studentInformation, String feesCollection, String income,
            String expences,
            String academics, String humanResource, String homework, String reports) {

        String actualStudentInfoText = DashboardModulesPage.studentInformationModule.getText();
        CommonUtils.assertEquals(actualStudentInfoText, studentInformation);

        String actualFeesCollectionText = DashboardModulesPage.feesCollectionModule.getText();
        CommonUtils.assertEquals((actualFeesCollectionText), feesCollection);

        String actualIncomeModuleText = DashboardModulesPage.incomeModule.getText();
        CommonUtils.assertEquals(actualIncomeModuleText, income);

        String actualExpensesModulesText = DashboardModulesPage.expensesModule.getText();
        CommonUtils.assertEquals(actualExpensesModulesText, expences);

        String actualacademicsModuleText = DashboardModulesPage.academicsModule.getText();
        CommonUtils.assertEquals(actualacademicsModuleText, academics);

        String actualHumanResourceModuleText = DashboardModulesPage.humanResourceModule.getText();
        CommonUtils.assertEquals(actualHumanResourceModuleText, humanResource);

        String actualReportsModuleText = DashboardModulesPage.reportsModule.getText();
        CommonUtils.assertEquals(actualReportsModuleText, reports);

    }
}
