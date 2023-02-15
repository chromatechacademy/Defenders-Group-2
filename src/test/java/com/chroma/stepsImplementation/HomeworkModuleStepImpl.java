package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.CommonUtils;

public class HomeworkModuleStepImpl extends PageInitializer{

    /* User Logs In With Valid Credentials */
    public static void userLogsIn(String username, String password) {
        loginPage.userNameTextBox.sendKeys(username);
        loginPage.passwordTextBox.sendKeys(password);
        loginPage.signButton.click();
        CommonUtils.nonMobileScreenshots();
    }

    /* User Clicks On Homework Module */
    public static void userClicksHomeworkModule() {
        cTSMSNavigationModulesPage.homeworkModule.click();
        CommonUtils.nonMobileScreenshots();
    }

    /* User sees Homework Sub Module */
    public static void homeworkSubModule(String addHomeworkString) {
        String actualAddHomeworkText = homeworkModulePage.addHomeworkSubModule.getText();
        CommonUtils.waitForVisibility(homeworkModulePage.addHomeworkSubModule);
        CommonUtils.assertEquals(actualAddHomeworkText, addHomeworkString);
        CommonUtils.nonMobileScreenshots();
    }
}
