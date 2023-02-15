package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.CTSMSStudentAdmissionPage;
import com.chroma.web.CommonUtils;
import com.chroma.web.JavascriptUtils;

public class CTSMSStudentAdmissionStepImpl extends PageInitializer {

    /* User Navigates To Student Information Module */
    public static void userNavigatesToStudentInformationModule() {
        cTSMSNavigationModulesPage.studentInformationModule.click();
        CommonUtils.nonMobileScreenshots();
    }

    /* User Navigates To Student Admition Sub Module */
    public static void userNavigatesToStudentAdmitionSubmodule() {
        cTSMSStudentAdmissionPage.studentAdmissionSubmodule.click();
        CommonUtils.nonMobileScreenshots();
    }

    /* User Is On Student Admission Page */
    public static void studentAdmissionPage(String expectedHeaderText) {
        String actualHeaderText = cTSMSStudentAdmissionPage.studentAdmissionHeader.getText();
        CommonUtils.assertEquals(actualHeaderText, expectedHeaderText);
        CommonUtils.nonMobileScreenshots();
    }

    /* User Enters Student Unique Admission Number */
    public static void studentUniqueAdmissionNumber(String admissionNumber){
        cTSMSStudentAdmissionPage.studentAdmissionNumberTextBox.sendKeys(admissionNumber);
        CommonUtils.sleep(2000);
        CommonUtils.nonMobileScreenshots();
    }

    /* User Selects Class And Section */
    public static void userSelectsClassAndSection(String className, String sectionName) {
        CommonUtils.selectDropDownValue(className, cTSMSStudentAdmissionPage.classDropDown);
        CommonUtils.selectDropDownValue(sectionName, cTSMSStudentAdmissionPage.sectionDropDown);
        CommonUtils.nonMobileScreenshots();
    }

    /* User Enters Student First And Last Name */
    public static void userEntersStudentFirstAndLastName(String firstName, String lastName) {
        cTSMSStudentAdmissionPage.firstNameTextBox.sendKeys(firstName);
        cTSMSStudentAdmissionPage.lastNameTextBox.sendKeys(lastName);
        CommonUtils.nonMobileScreenshots();
    }

    /* User Selects Gender */
    public static void userSelectsGender(String gender) {
        CommonUtils.selectDropDownValue(gender, cTSMSStudentAdmissionPage.genderDropDown);
        CommonUtils.nonMobileScreenshots();
    }

    /* User Enters Date Of Birth */
    public static void userEntersDateOfBirth(String dob) {
        JavascriptUtils.selectDateByJS(cTSMSStudentAdmissionPage.dobCalendar, dob);
        CommonUtils.nonMobileScreenshots();
    }

    /* User Enters Parent Guardian Details Enters Mother Name  */
    public static void userEntersMotherNameForGuardianDetails(String motherName) {
        cTSMSStudentAdmissionPage.mothersNameTextBox.sendKeys(motherName);
        CommonUtils.nonMobileScreenshots();
    }

    /* User Clicks On Mother Radio Button for Gurdian */
    public static void userClicksMotherRadioButtonForGurdian() {
        cTSMSStudentAdmissionPage.motherRadioButton.click();
        CommonUtils.nonMobileScreenshots();
    }

    /* User Enters Guardian Phone Number */
    public static void userEntersGuardianPhoneNumber(String phoneNumber) {
        cTSMSStudentAdmissionPage.guardianPhoneNumberTextBox.sendKeys(phoneNumber);
        CommonUtils.nonMobileScreenshots();
    }

    /* User clicks On Save Button */
    public static void userClicksSaveButton() {
        cTSMSStudentAdmissionPage.saveButton.click();
        CommonUtils.nonMobileScreenshots();
    }

    /* User Succesfully Saved And Confirmation Message Displayed */
    public static void studentSavedAndConfirmationMessage(String expectedSuccessMessage){
        String actualSuccessMessage = cTSMSStudentAdmissionPage.succesfulySavedMessage.getText();
        CommonUtils.nonMobileScreenshots();
        CommonUtils.assertEquals(actualSuccessMessage, expectedSuccessMessage);
        CommonUtils.sleep(2000);
    }

    /* User Navigates To Bulk Delete Sub Module */
    public static void bulkDeleteSubModule() {
        cTSMSStudentAdmissionPage.bulkDeleteModule.click();
        CommonUtils.sleep(500);
        CommonUtils.nonMobileScreenshots();
    }

    /* For Bulk Delete Select Class And Section */
    public static void forBulkDeleteSelectClassAndSection(String className, String sectionName) {
        cTSMSStudentAdmissionPage.classDropDown2.click();
        CommonUtils.selectDropDownValue(cTSMSStudentAdmissionPage.classDropDown2, 1);
        cTSMSStudentAdmissionPage.sectionDropDown2.click();
        CommonUtils.selectDropDownValue(cTSMSStudentAdmissionPage.sectionDropDown2, 2);
        CommonUtils.nonMobileScreenshots();
    }

    /* User Clicks Search Button */
    public static void userClicksSearchButton() {
        cTSMSStudentAdmissionPage.serchButtonBD.click();
        CommonUtils.nonMobileScreenshots();
    }

    /*
     * Admitted Student With First Name And Last Name is Delete for Testing Purposes
     */
    public static void deletedAdmittedStudentForTestingPurposes(String firstName, String lastName){
        if (CTSMSStudentAdmissionPage.studentRecordLocator(firstName + " " + lastName).isDisplayed()) {
            CTSMSStudentAdmissionPage.studentRecordLocator(firstName + " " + lastName).click();
            CommonUtils.sleep(2000);
            CommonUtils.nonMobileScreenshots();
            cTSMSStudentAdmissionPage.deleteButton.click();
            CommonUtils.sleep(2000);
            CommonUtils.nonMobileAutoAcceptAlert();
        }
    }
}
