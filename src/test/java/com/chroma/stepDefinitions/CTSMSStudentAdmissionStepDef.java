package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.CTSMSStudentAdmissionPage;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import com.chroma.web.JavascriptUtils;
import com.chroma.web.WebDriverUtils;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CTSMSStudentAdmissionStepDef extends PageInitializer {

    @When("navigates to Student Information Module")
    public void navigates_to_Student_Information_Module() {
        cTSMSNavigationModulesPage.studentInformationModule.click();
    }

    @When("navigates to Student Admition Submodule")
    public void navigates_to_Student_Admition_Submodule() {
        cTSMSStudentAdmissionPage.studentAdmissionSubmodule.click();
    }

    @Then("user is directed to Student Admission Page with the text {string}")
    public void user_is_directed_to_Student_Admission_Page_with_the_text(String expectedHeaderText) {
        String actualHeaderText = cTSMSStudentAdmissionPage.studentAdmissionHeader.getText();
        CommonUtils.assertEquals(actualHeaderText, expectedHeaderText);
    }

    @Then("enters Student unique Admission Number {string}")
    public void enters_Student_unique_Admission_Number(String admissionNumber) throws InterruptedException {
        cTSMSStudentAdmissionPage.studentAdmissionNumberTextBox.sendKeys(admissionNumber);
        Thread.sleep(2000);
    }

    @Then("selects Class {string} and Section {string}")
    public void selects_Class_and_Section(String className, String sectionName) {
        CommonUtils.selectDropDownValue(className, cTSMSStudentAdmissionPage.classDropDown);
        CommonUtils.selectDropDownValue(sectionName, cTSMSStudentAdmissionPage.sectionDropDown);
    }

    @Then("enters Students first {string} and last name {string}")
    public void enters_Students_first_and_last_name(String firstName, String lastName) {
        cTSMSStudentAdmissionPage.firstNameTextBox.sendKeys(firstName);
        cTSMSStudentAdmissionPage.lastNameTextBox.sendKeys(lastName);
    }

    @Then("selects gender {string}")
    public void selects_gender(String gender) {
        CommonUtils.selectDropDownValue(gender, cTSMSStudentAdmissionPage.genderDropDown);
    }

    @Then("enters Date of Birth {string}")
    public void enters_Date_of_Birth(String dob) {
        JavascriptUtils.selectDateByJS(cTSMSStudentAdmissionPage.dobCalendar, dob);
    }

    @Then("enters Parent Guardian Details enters mothers name {string}")
    public void enters_Parent_Guardian_Details_enters_mothers_name(String motherName) {
        cTSMSStudentAdmissionPage.mothersNameTextBox.sendKeys(motherName);
    }

    @Then("for If Gurdian Is clicks on Mother radio button")
    public void for_If_Gurdian_Is_clicks_on_Mother_radio_button() {
        cTSMSStudentAdmissionPage.motherRadioButton.click();
    }

    @Then("enters Guardian Phone Number {string}")
    public void enters_Guardian_Phone_Number(String phoneNumber) {
        cTSMSStudentAdmissionPage.guardianPhoneNumberTextBox.sendKeys(phoneNumber);
    }

    @Then("clicks on the Save button")
    public void clicks_on_the_Save_button() {
        cTSMSStudentAdmissionPage.saveButton.click();
    }

    @Then("student is succesfuly saved and confirmation message is displayed {string}")
    public void student_is_succesfuly_saved_and_confirmation_message_is_displayed(String expectedSuccessMessage)
            throws InterruptedException {
        String actualSuccessMessage = cTSMSStudentAdmissionPage.succesfulySavedMessage.getText();
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
        CommonUtils.assertEquals(actualSuccessMessage, expectedSuccessMessage);
        Thread.sleep(2000);
    }

    @When("user navigates to Bulk Delete submodule")
    public void user_navigates_to_Bulk_Delete_submodule() {
        cTSMSStudentAdmissionPage.bulkDeleteModule.click();
        CommonUtils.sleep(500);
    }
    
    @When("for Bulk Delete selects Class {string} and Section {string}")
    public void for_Bulk_Delete_selects_Class_and_Section(String className, String sectionName) {
        cTSMSStudentAdmissionPage.classDropDown2.click();
        CommonUtils.selectDropDownValue(cTSMSStudentAdmissionPage.classDropDown2,1);
        cTSMSStudentAdmissionPage.sectionDropDown2.click();
        CommonUtils.selectDropDownValue(cTSMSStudentAdmissionPage.sectionDropDown2,2);
    }

    @When("clicks search button")
    public void clicks_search_button() {
        cTSMSStudentAdmissionPage.serchButtonBD.click();
    }

    @Then("admitted student with first name {string} and last name {string} is deleted for testing purposes")
    public void admitted_student_with_first_name_and_last_name_is_deleted_for_testing_purposes(String firstName,
            String lastName) throws InterruptedException {
        if (CTSMSStudentAdmissionPage.studentRecordLocator(firstName + " " + lastName).isDisplayed()) {

            CTSMSStudentAdmissionPage.studentRecordLocator(firstName + " " + lastName).click();
            Thread.sleep(2000);
            CucumberLogUtils.logScreenShot();
            CucumberLogUtils.logExtentScreenshot();
            cTSMSStudentAdmissionPage.deleteButton.click();
            Thread.sleep(2000);

            CommonUtils.driver.switchTo().alert().accept();
        }
    }
}

