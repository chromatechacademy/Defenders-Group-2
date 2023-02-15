package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.CommonUtils;

public class StudentInformationStepImpl extends PageInitializer {

    /* User Logs In To CTSMS Website With Valid Credentials */
    public static void userLogsInWithValidCredentials(String username, String password) {
        loginPage.userNameTextBox.sendKeys(username);
        loginPage.passwordTextBox.sendKeys(password);
        CommonUtils.nonMobileScreenshots();
        loginPage.signButton.click();
    }

    /* User Clicks On Student Information Section */
    public static void userClicksOnStudentInformationSection() {
        cTSMSNavigationModulesPage.studentInformationModule.click();
        CommonUtils.waitForVisibility(studentInformationPage.studentDetailsSubModule);
        CommonUtils.waitForVisibility(studentInformationPage.studentHouseSubModule);
        CommonUtils.waitForVisibility(studentInformationPage.disabledStudentsSubModule);
        CommonUtils.nonMobileScreenshots();
    }

    /* User Sees Student Information Sub Modules Displayed */
    public static void userSeesSubModuelDisplayed(String studentDetails, String studentAdmission,
            String disabledStudents, String bulkDelete, String studentCategories, String studentHouse,
            String disableReason) {
        String actualStudentDetailText = studentInformationPage.studentDetailsSubModule.getText();
        CommonUtils.assertEquals(actualStudentDetailText, studentDetails);
        String actualStudentAdmissionText = studentInformationPage.studentAdmissionSubModule.getText();
        CommonUtils.assertEquals(actualStudentAdmissionText, studentAdmission);
        String actualDisabledStudentsText = studentInformationPage.disabledStudentsSubModule.getText();
        CommonUtils.assertEquals(actualDisabledStudentsText, disabledStudents);
        String actualBulkDeleteText = studentInformationPage.bulkDeleteSubModule.getText();
        CommonUtils.assertEquals(actualBulkDeleteText, bulkDelete);
        String actualStudentCategoriesText = studentInformationPage.studentCategoriesSubModule.getText();
        CommonUtils.assertEquals(actualStudentCategoriesText, studentCategories);
        String actualStudentHouseText = studentInformationPage.studentHouseSubModule.getText();
        CommonUtils.assertEquals(actualStudentHouseText, studentHouse);
        String actualDisableReasonText = studentInformationPage.disableReasonSubModule.getText();
        CommonUtils.assertEquals(actualDisableReasonText, disableReason);
        CommonUtils.nonMobileScreenshots();
    }
}
