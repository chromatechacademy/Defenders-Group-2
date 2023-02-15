package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.SectionsPage;
import com.chroma.web.CommonUtils;
import com.chroma.web.WebDriverUtils;

public class AddDeleteSectionsStepImpl extends PageInitializer {

    /* Chroma Tech Faculty Member is on Login page */
    public static void chromeTechMemberLoginPage(String url) {
        WebDriverUtils.driver.get(url);
        CommonUtils.nonMobileScreenshots();
    }

    /* Chroma Tech Faculty Memeber Logs In With Valid Credentials */
    public static void chromaTechMemeberLogsIn(String login, String password) {
        loginPage.userNameTextBox.sendKeys(login);
        loginPage.passwordTextBox.sendKeys(password);
        CommonUtils.nonMobileScreenshots();
        loginPage.signButton.click();
    }

    /* Chroma Tech Faculty Memeber Navigates To Academics Module */
    public static void chromaTechMemeberNavigatesToAcademicsModule() {
        dashboardPage.academicsModule.click();
        CommonUtils.nonMobileScreenshots();
    }

    /* Chroma Tech Faculty Memeber Navigates To Sections Sub Module */
    public static void chromaTechMemeberNavigatesToSectionsSubModule() {
        dashboardPage.sectionsSubModule.click();
        CommonUtils.nonMobileScreenshots();
    }

    /* Chroma Tech Faculty Memeber Enters Section Name */
    public static void chromaTechMemeberEntersSectionName(String sectionName) {
        sectionsPage.sectionNameTextBox.sendKeys(sectionName);
        CommonUtils.nonMobileScreenshots();
    }

    /* Chroma Tech Faculty Memeber Clicks Save Button */
    public static void chromaTechMemeberClicksSaveButton() {
        sectionsPage.saveButton.click();
        CommonUtils.nonMobileScreenshots();
    }

    /* Chroma Tech Faculty Memeber Be Able To See Confirmation Message Displayed */
    public static void confirmationMessageDisplayed(String expectedSuccessMessage) {
        String actualSuccessMessage = sectionsPage.successfullySavedMessage.getText();
        CommonUtils.assertEquals(expectedSuccessMessage, actualSuccessMessage);
        CommonUtils.nonMobileScreenshots();
    }

    /*
     * Chroma Tech Faculty Member Selects Section Name In Section List And Delete It
     */
    public static void selectSectionNameInSectionAndDeleteIt(String sectionName) {
        if (SectionsPage.sectionNameLocator(sectionName).size() != 0) {
            SectionsPage.sectionsNameDeleteButton(sectionName).click();
            CommonUtils.sleep(2000);
            CommonUtils.nonMobileAutoAcceptAlert();
            CommonUtils.sleep(2000);
            CommonUtils.nonMobileScreenshots();
        }
    }
}
