package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.stepsImplementation.StudentInformationStepImpl;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StudentInformationStepDef extends PageInitializer {

    @Given("a user logs in to the CTSMS website with valid credentials username{string} and password {string}")
    public void a_user_logs_in_to_the_CTSMS_website_with_valid_credentials_username_and_password(String username,
            String password) {
        StudentInformationStepImpl.userLogsInWithValidCredentials(username, password);
    }

    @Given("user clicks on Student Information section")
    public void user_clicks_on_Student_Information_section() {
        StudentInformationStepImpl.userClicksOnStudentInformationSection();
    }

    @Then("following submodule displayed {string}, {string} ,{string} ,{string},{string}, {string} ,{string}")
    public void following_submodule_displayed(String studentDetails, String studentAdmission, String disabledStudents,
            String bulkDelete, String studentCategories, String studentHouse, String disableReason) {
        StudentInformationStepImpl.userSeesSubModuelDisplayed(
                studentDetails, studentAdmission, disabledStudents, bulkDelete, studentCategories, studentHouse,
                disableReason);
    }
}
