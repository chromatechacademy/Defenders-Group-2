package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
<<<<<<< HEAD
import com.chroma.pages.CTSMSStudentAdmissionPage;
import com.chroma.pages.DashboardPage;
import com.chroma.utils.ConfigReader;
import com.chroma.web.CommonUtils;
import com.chroma.web.JavascriptUtils;
=======
import com.chroma.stepsImplementation.CTSMSStudentAdmissionStepImpl;
>>>>>>> d37f4a0010f919e85f377489e8dbfff579daf2dc
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CTSMSStudentAdmissionStepDef extends PageInitializer {

    @When("navigates to Student Information Module")
    public void navigates_to_Student_Information_Module() {
<<<<<<< HEAD
        if (ConfigReader.getPropertyValue("browser").equalsIgnoreCase(("mobile"))) {
            DashboardPage.dashboardHamburger().click();
        }
        cTSMSNavigationModulesPage.studentInformationModule.click();
=======
        CTSMSStudentAdmissionStepImpl.userNavigatesToStudentInformationModule();
>>>>>>> d37f4a0010f919e85f377489e8dbfff579daf2dc
    }

    @When("navigates to Student Admition Submodule")
    public void navigates_to_Student_Admition_Submodule() {
        CTSMSStudentAdmissionStepImpl.userNavigatesToStudentAdmitionSubmodule();
    }

    @Then("user is directed to Student Admission Page with the text {string}")
    public void user_is_directed_to_Student_Admission_Page_with_the_text(String expectedHeaderText) {
<<<<<<< HEAD
        String actualHeaderText = cTSMSStudentAdmissionPage.studentAdmissionHeader.getText();
        CommonUtils.assertEquals(actualHeaderText, expectedHeaderText);
        CommonUtils.nonMobileScreenshots();
=======
        CTSMSStudentAdmissionStepImpl.studentAdmissionPage(expectedHeaderText);
>>>>>>> d37f4a0010f919e85f377489e8dbfff579daf2dc
    }

    @Then("enters Student unique Admission Number {string}")
    public void enters_Student_unique_Admission_Number(String admissionNumber) {
<<<<<<< HEAD
        cTSMSStudentAdmissionPage.studentAdmissionNumberTextBox.sendKeys(admissionNumber);
=======
        CTSMSStudentAdmissionStepImpl.studentUniqueAdmissionNumber(admissionNumber);
>>>>>>> d37f4a0010f919e85f377489e8dbfff579daf2dc
    }

    @Then("selects Class {string} and Section {string}")
    public void selects_Class_and_Section(String className, String sectionName) {
        CTSMSStudentAdmissionStepImpl.userSelectsClassAndSection(className, sectionName);
    }

    @Then("enters Students first {string} and last name {string}")
    public void enters_Students_first_and_last_name(String firstName, String lastName) {
        CTSMSStudentAdmissionStepImpl.userEntersStudentFirstAndLastName(firstName, lastName);
    }

    @Then("selects gender {string}")
    public void selects_gender(String gender) {
        CTSMSStudentAdmissionStepImpl.userSelectsGender(gender);
    }

    @Then("enters Date of Birth {string}")
    public void enters_Date_of_Birth(String dob) {
        CTSMSStudentAdmissionStepImpl.userEntersDateOfBirth(dob);
    }

    @Then("enters Parent Guardian Details enters mothers name {string}")
    public void enters_Parent_Guardian_Details_enters_mothers_name(String motherName) {
        CTSMSStudentAdmissionStepImpl.userEntersMotherNameForGuardianDetails(motherName);
    }

    @Then("for If Gurdian Is clicks on Mother radio button")
    public void for_If_Gurdian_Is_clicks_on_Mother_radio_button() {
        CTSMSStudentAdmissionStepImpl.userClicksMotherRadioButtonForGurdian();
    }

    @Then("enters Guardian Phone Number {string}")
    public void enters_Guardian_Phone_Number(String phoneNumber) {
        CTSMSStudentAdmissionStepImpl.userEntersGuardianPhoneNumber(phoneNumber);
    }

    @Then("clicks on the Save button")
    public void clicks_on_the_Save_button() {
        CTSMSStudentAdmissionStepImpl.userClicksSaveButton();
    }

    @Then("student is succesfuly saved and confirmation message is displayed {string}")
    public void student_is_succesfuly_saved_and_confirmation_message_is_displayed(String expectedSuccessMessage) {
        String actualSuccessMessage = cTSMSStudentAdmissionPage.succesfulySavedMessage.getText();
        CommonUtils.nonMobileScreenshots();
        CommonUtils.assertEquals(actualSuccessMessage, expectedSuccessMessage);
    }

    @When("user navigates to Bulk Delete submodule")
    public void user_navigates_to_Bulk_Delete_submodule() {
       CTSMSStudentAdmissionStepImpl.bulkDeleteSubModule();
    }

    @When("for Bulk Delete selects Class {string} and Section {string}")
    public void for_Bulk_Delete_selects_Class_and_Section(String className, String sectionName) {
<<<<<<< HEAD
        cTSMSStudentAdmissionPage.classDropDown2.click();
        CommonUtils.selectDropDownValue(className, cTSMSStudentAdmissionPage.classDropDown2);
        cTSMSStudentAdmissionPage.sectionDropDown2.click();
        CommonUtils.selectDropDownValue(sectionName, cTSMSStudentAdmissionPage.sectionDropDown2);
=======
        CTSMSStudentAdmissionStepImpl.forBulkDeleteSelectClassAndSection(className, sectionName);
>>>>>>> d37f4a0010f919e85f377489e8dbfff579daf2dc
    }

    @When("clicks search button")
    public void clicks_search_button() {
        CTSMSStudentAdmissionStepImpl.userClicksSearchButton();
    }

    @Then("admitted student with first name {string} and last name {string} is deleted for testing purposes")
    public void admitted_student_with_first_name_and_last_name_is_deleted_for_testing_purposes(String firstName,
<<<<<<< HEAD
            String lastName) throws InterruptedException {
        if (CTSMSStudentAdmissionPage.studentRecordLocator(firstName + " " + lastName).isDisplayed()) {
            CTSMSStudentAdmissionPage.studentRecordLocator(firstName + " " + lastName).click();
            Thread.sleep(2000);
            CommonUtils.nonMobileScreenshots();
            cTSMSStudentAdmissionPage.deleteButton.click();
            Thread.sleep(2000);
            CommonUtils.driver.switchTo().alert().accept();
=======
            String lastName){
        CTSMSStudentAdmissionStepImpl.deletedAdmittedStudentForTestingPurposes(firstName, lastName);
>>>>>>> d37f4a0010f919e85f377489e8dbfff579daf2dc
        }
}
