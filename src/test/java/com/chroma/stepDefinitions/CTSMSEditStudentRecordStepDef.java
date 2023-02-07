package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.StudentDetailsPage;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import com.chroma.web.JavascriptUtils;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CTSMSEditStudentRecordStepDef extends PageInitializer {

    @Then("navigates to Student Details Submodule")
    public void navigates_to_Student_Details_Submodule() {
        dashboardPage.studentDetailsSubModule.click();
    }

    @When("enters unique Admission Number {string} to Search By Keyword text box and clicks Search")
    public void enters_unique_Admission_Number_to_Search_By_Keyword_text_box_and_clicks_Search(String admissionNumber) {
        studentDetailsPage.searchByKeywordTextBox.sendKeys(admissionNumber);
        studentDetailsPage.searchByKeywordButton.click();
    }

    @Then("clicks Edit Button that assighned to current unique Admission Number {string}")
    public void clicks_Edit_Button_that_assighned_to_current_unique_Admission_Number(String admissionNumber) {
        StudentDetailsPage.editButton(admissionNumber).click();
    }

    @Then("faculty user be able to edit first {string} and last name {string}")
    public void faculty_user_be_able_to_edit_first_and_last_name(String firstName, String lastName) {
        cTSMSStudentAdmissionPage.firstNameTextBox.clear();
        cTSMSStudentAdmissionPage.firstNameTextBox.sendKeys(firstName);
        cTSMSStudentAdmissionPage.lastNameTextBox.clear();
        cTSMSStudentAdmissionPage.lastNameTextBox.sendKeys(lastName);
    }

    @Then("faculty user be able to edit Date of Birth {string}")
    public void faculty_user_be_able_to_edit_Date_of_Birth(String dob) {
        JavascriptUtils.selectDateByJS(cTSMSStudentAdmissionPage.dobCalendar, dob);
    }

    @Then("faculty user be able to edit Parent Guardian Details enters mothers name {string}")
    public void faculty_user_be_able_to_edit_Parent_Guardian_Details_enters_mothers_name(String motherName) {
        cTSMSStudentAdmissionPage.mothersNameTextBox.clear();
        cTSMSStudentAdmissionPage.mothersNameTextBox.sendKeys(motherName);
    }

    @Then("faculty user be able to edit Guardian Phone Number {string}")
    public void faculty_user_be_able_to_edit_Guardian_Phone_Number(String phoneNumber) {
        cTSMSStudentAdmissionPage.guardianPhoneNumberTextBox.clear();
        cTSMSStudentAdmissionPage.guardianPhoneNumberTextBox.sendKeys(phoneNumber);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }

    @Then("faculty user is successfully update Student Record - {string} message is displayed")
    public void faculty_user_is_successfully_update_Student_Record_message_is_displayed(String expectedSuccessMessage) {
        String actualSuccessMessage = studentDetailsPage.successAlertMessage.getText();
        CommonUtils.assertEquals(actualSuccessMessage, expectedSuccessMessage);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }
}
