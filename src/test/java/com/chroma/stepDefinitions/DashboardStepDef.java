package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.DashboardPage;
import com.chroma.utils.ConfigReader;
import com.chroma.web.CommonUtils;
import cucumber.api.java.en.Then;

public class DashboardStepDef extends PageInitializer {

    @Then("the following modules should displayed {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void the_following_modules_should_displayed(String studentInformation, String feesCollection, String income,
            String expences,
            String academics, String humanResource, String homework, String reports) {
        if (ConfigReader.getPropertyValue("browser").equalsIgnoreCase(("mobile"))) {
            DashboardPage.dashboardHamburger().click();
        }
        String actualStudentInfoText = cTSMSNavigationModulesPage.studentInformationModule.getText();
        CommonUtils.assertEquals(actualStudentInfoText, studentInformation);
        String actualFeesCollectionText = cTSMSNavigationModulesPage.feesCollectionModule.getText();
        CommonUtils.assertEquals(actualFeesCollectionText, feesCollection);
        String actualIncomeModuleText = cTSMSNavigationModulesPage.incomeModule.getText();
        CommonUtils.assertEquals(actualIncomeModuleText, income);
        String actualExpensesModulesText = cTSMSNavigationModulesPage.expensesModule.getText();
        CommonUtils.assertEquals(actualExpensesModulesText, expences);
        String actualacademicsModuleText = cTSMSNavigationModulesPage.academicsModule.getText();
        CommonUtils.assertEquals(actualacademicsModuleText, academics);
        String actualHumanResourceModuleText = cTSMSNavigationModulesPage.humanResourceModule.getText();
        CommonUtils.assertEquals(actualHumanResourceModuleText, humanResource);
        String actualHomeworkModuleText = cTSMSNavigationModulesPage.homeworkModule.getText();
        CommonUtils.assertEquals(actualHomeworkModuleText, homework);
        String actualReportsModuleText = cTSMSNavigationModulesPage.reportsModule.getText();
        CommonUtils.assertEquals(actualReportsModuleText, reports);
        CommonUtils.nonMobileScreenshots();
    }
}
