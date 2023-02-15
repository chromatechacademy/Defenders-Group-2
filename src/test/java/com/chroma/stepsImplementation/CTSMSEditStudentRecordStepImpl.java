package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.StudentDetailsPage;
import com.chroma.web.CommonUtils;
import com.chroma.web.JavascriptUtils;

public class CTSMSEditStudentRecordStepImpl extends PageInitializer{

    /* User Navigates To Student Details Sub Module */
    public static void userNavigatesToStudentDetailsSubModule() {
        dashboardPage.studentDetailsSubModule.click();
        CommonUtils.nonMobileScreenshots();
    }

    /* Enters Unique Admission Number To Search By Keyword Text Box And Clicks Search */
    public static void uniqueAdmissionNumberSearchByKeywordTextBoxAndSearch(String admissionNumber) {
        studentDetailsPage.searchByKeywordTextBox.sendKeys(admissionNumber);
        studentDetailsPage.searchByKeywordButton.click();
        CommonUtils.nonMobileScreenshots();
    }

    /* User Clicks Edit Button That Assighned To Current Unique Admission Number */
    public static void userClickEditButtonAssighnedToCurrentUniqueAdmissionNumber(String admissionNumber) {
        StudentDetailsPage.editButton(admissionNumber).click();
        CommonUtils.nonMobileScreenshots();
    }

    /* User Be Able To Edit First And Last Name */
    public static void userAbleToEditFirstAndLastName(String firstName, String lastName) {
        cTSMSStudentAdmissionPage.firstNameTextBox.clear();
        cTSMSStudentAdmissionPage.firstNameTextBox.sendKeys(firstName);
        cTSMSStudentAdmissionPage.lastNameTextBox.clear();
        cTSMSStudentAdmissionPage.lastNameTextBox.sendKeys(lastName);
    }

    /* User Able To Edit Date Of Birth */
    public static void userEditDateOfBirth(String dob) {
        JavascriptUtils.selectDateByJS(cTSMSStudentAdmissionPage.dobCalendar, dob);
        CommonUtils.nonMobileScreenshots();
    }

    /* User Able To Edit Parent Guardian Details Enters Mothers Name */
    public static void userAbleToEditParentGuardianDetailsEntersMothersName(String motherName) {
        cTSMSStudentAdmissionPage.mothersNameTextBox.clear();
        cTSMSStudentAdmissionPage.mothersNameTextBox.sendKeys(motherName);
    }

    /* User Able To Edit Guardian Phone Number */
    public static void userAbleToEditGuardianPhoneNumber(String phoneNumber) {
        cTSMSStudentAdmissionPage.guardianPhoneNumberTextBox.clear();
        cTSMSStudentAdmissionPage.guardianPhoneNumberTextBox.sendKeys(phoneNumber);
        CommonUtils.nonMobileScreenshots();
    }

    /* User Is Succesfully Updated Student Record Message Is Displayed */
    public static void succesfullyUpdatedStudentRecordMessageDisplayed(String expectedSuccessMessage) {
        String actualSuccessMessage = studentDetailsPage.successAlertMessage.getText();
        CommonUtils.assertEquals(actualSuccessMessage, expectedSuccessMessage);
        CommonUtils.nonMobileScreenshots();
    }
}
