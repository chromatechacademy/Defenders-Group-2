package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.CommonUtils;

public class FeesCollectionModuleStepImpl extends PageInitializer {

    /* User Logs in With Valid Credentials */
    public static void userLogsIn(String username, String password) {
        loginPage.userNameTextBox.sendKeys(username);
        loginPage.passwordTextBox.sendKeys(password);
        loginPage.signButton.click();
        CommonUtils.nonMobileScreenshots();
    }

    /* User Clicks Fees Collection Module */
    public static void clickFeesCollectionModule() {
        cTSMSNavigationModulesPage.feesCollectionModule.click();
        CommonUtils.waitForVisibility(feesCollectionModulePage.collectFeesSubModule);
        CommonUtils.waitForVisibility(feesCollectionModulePage.feesReminderSubModule);
        CommonUtils.waitForVisibility(feesCollectionModulePage.feesCarryForwardSubModule);
        CommonUtils.nonMobileScreenshots();
    }

    /* User Sees Fees Collection Sub Module */
    public static void feesCollectionSubModule(String CollectFees, String serchFeesPayment, String searchDueFees,
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
        CommonUtils.nonMobileScreenshots();
    }
}
