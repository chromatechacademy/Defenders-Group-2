package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class FeesCollectionModuleStepDef extends PageInitializer {
    
    @Given("a user logs in with valid credentials username {string} and password {string}")
    public void a_user_logs_in_with_valid_credentials_username_and_password(String username, String password) {
        loginPage.userNameTextBox.sendKeys(username);
        loginPage.passwordTextBox.sendKeys(password);
        loginPage.signButton.click();
    }

    @Given("navigates to Fees Collection Module")
    public void navigates_to_Fees_Collection_Module() {
        cTSMSNavigationModulesPage.feesCollectionModule.click();
        CommonUtils.waitForVisibility(feesCollectionModulePage.collectFeesSubModule);
        CommonUtils.waitForVisibility(feesCollectionModulePage.feesReminderSubModule);
        CommonUtils.waitForVisibility(feesCollectionModulePage.feesCarryForwardSubModule);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }

    @Then("following submodule displayed {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string},{string}")
    public void following_submodule_displayed(String CollectFees, String serchFeesPayment, String searchDueFees,
            String feesMaster, String feesGroup, String feesType, String feesDiscount, String feesCarryForward,
            String Reminder) {
        String actualCollectFeesSubModule = feesCollectionModulePage.collectFeesSubModule.getText();
        CommonUtils.assertEquals(actualCollectFeesSubModule, CollectFees);
        String actualSearchFeesPaymentText = feesCollectionModulePage.searchFeesPaymentSubModule.getText();
        CommonUtils.assertEquals(actualSearchFeesPaymentText, serchFeesPayment);
        String actualFeesMasterText = feesCollectionModulePage.feesMasterSubModule.getText();
        CommonUtils.assertEquals(actualFeesMasterText, feesMaster);
        String actualSearchDueFeesText = feesCollectionModulePage.serachDueFeesSubModule.getText();
        CommonUtils.assertEquals(actualSearchDueFeesText, searchDueFees);
        String actualFeesGroupText = feesCollectionModulePage.feesGroupSubModule.getText();
        CommonUtils.assertEquals(actualFeesGroupText, feesGroup);
        String actualFeesTypeText = feesCollectionModulePage.feesTypeSubModule.getText();
        CommonUtils.assertEquals(actualFeesTypeText, feesType);
        String actualFeesDiscountText = feesCollectionModulePage.feesDiscountSubModule.getText();
        CommonUtils.assertEquals(actualFeesDiscountText, feesDiscount);
        String actualFeesCarryForwardText = feesCollectionModulePage.feesCarryForwardSubModule.getText();
        CommonUtils.assertEquals(actualFeesCarryForwardText, feesCarryForward);
        String actualFeesReminderText = feesCollectionModulePage.feesReminderSubModule.getText();
        CommonUtils.assertEquals(actualFeesReminderText, Reminder);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }
}
