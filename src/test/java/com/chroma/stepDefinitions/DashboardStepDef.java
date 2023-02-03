package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.DashboardModulesPage;
import com.chroma.web.CommonUtils;

import cucumber.api.java.en.Then;

public class DashboardStepDef  {

    DashboardModulesPage dashboardModulesPage = new DashboardModulesPage();

    @Then("the following modules should displayed {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void the_following_modules_should_displayed(String studentInformation, String feesCollection, String income,
            String expences,
            String academics, String humanResource, String homework, String reports) {

        String actualStudentInfoText = dashboardModulesPage.studentInformationModule.getText();
        CommonUtils.assertEquals(actualStudentInfoText, studentInformation);

        String actualFeesCollectionText = dashboardModulesPage.feesCollectionModule.getText();
        CommonUtils.assertEquals((actualFeesCollectionText), feesCollection);

        String actualIncomeModuleText = dashboardModulesPage.incomeModule.getText();
        CommonUtils.assertEquals(actualIncomeModuleText, income);

        String actualExpensesModulesText = dashboardModulesPage.expensesModule.getText();
        CommonUtils.assertEquals(actualExpensesModulesText, expences);

        String actualacademicsModuleText = dashboardModulesPage.academicsModule.getText();
        CommonUtils.assertEquals(actualacademicsModuleText, academics);

        String actualHumanResourceModuleText = dashboardModulesPage.humanResourceModule.getText();
        CommonUtils.assertEquals(actualHumanResourceModuleText, humanResource);

        String actualHomeworkModuleText = dashboardModulesPage.homeworkModule.getText();
        CommonUtils.assertEquals(actualHomeworkModuleText, homework);

        String actualReportsModuleText = dashboardModulesPage.reportsModule.getText();
        CommonUtils.assertEquals(actualReportsModuleText, reports);

    }
}
