package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.CommonUtils;

public class DashboardStepImpl extends PageInitializer {

    /* User clicks On Hamburger Menu  */
    public static void userClicksHamburgerMenu() {
        cTSMSNavigationModulesPage.hamburgerMenu.click();
        CommonUtils.nonMobileScreenshots();
    }

    /* User Sees Modules Displayed */
    public static void userSeesModuleDisplayed(String studentInformation, String feesCollection, String income,
            String expences, String academics, String humanResource, String homework, String reports) {
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
