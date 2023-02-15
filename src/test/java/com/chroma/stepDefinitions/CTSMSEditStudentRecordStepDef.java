package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.stepsImplementation.CTSMSEditStudentRecordStepImpl;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CTSMSEditStudentRecordStepDef extends PageInitializer {

    @Then("navigates to Student Details Submodule")
    public void navigates_to_Student_Details_Submodule() {
        CTSMSEditStudentRecordStepImpl.userNavigatesToStudentDetailsSubModule();
    }

    @When("enters unique Admission Number {string} to Search By Keyword text box and clicks Search")
    public void enters_unique_Admission_Number_to_Search_By_Keyword_text_box_and_clicks_Search(String admissionNumber) {
        CTSMSEditStudentRecordStepImpl.uniqueAdmissionNumberSearchByKeywordTextBoxAndSearch(admissionNumber);
    }

    @Then("clicks Edit Button that assighned to current unique Admission Number {string}")
    public void clicks_Edit_Button_that_assighned_to_current_unique_Admission_Number(String admissionNumber) {
        CTSMSEditStudentRecordStepImpl.userClickEditButtonAssighnedToCurrentUniqueAdmissionNumber(admissionNumber);
    }

    @Then("faculty user be able to edit first {string} and last name {string}")
    public void faculty_user_be_able_to_edit_first_and_last_name(String firstName, String lastName) {
        CTSMSEditStudentRecordStepImpl.userAbleToEditFirstAndLastName(firstName, lastName);
    }

    @Then("faculty user be able to edit Date of Birth {string}")
    public void faculty_user_be_able_to_edit_Date_of_Birth(String dob) {
        CTSMSEditStudentRecordStepImpl.userEditDateOfBirth(dob);
    }

    @Then("faculty user be able to edit Parent Guardian Details enters mothers name {string}")
    public void faculty_user_be_able_to_edit_Parent_Guardian_Details_enters_mothers_name(String motherName) {
        CTSMSEditStudentRecordStepImpl.userAbleToEditParentGuardianDetailsEntersMothersName(motherName);
    }

    @Then("faculty user be able to edit Guardian Phone Number {string}")
    public void faculty_user_be_able_to_edit_Guardian_Phone_Number(String phoneNumber) {
        CTSMSEditStudentRecordStepImpl.userAbleToEditGuardianPhoneNumber(phoneNumber);
    }

    @Then("faculty user is successfully update Student Record - {string} message is displayed")
    public void faculty_user_is_successfully_update_Student_Record_message_is_displayed(String expectedSuccessMessage) {
        CTSMSEditStudentRecordStepImpl.succesfullyUpdatedStudentRecordMessageDisplayed(expectedSuccessMessage);
    }
}
