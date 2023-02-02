package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.AcademyDashBoardPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HumanResourceModule extends PageInitializer {
    AcademyDashBoardPage academyDashBoardPage = new AcademyDashBoardPage();

    @Given("user logs in with valid credentials username {string} and password {string}")
    public void user_logs_in_with_valid_credentials_username_and_password(String Username, String Password)
            throws InterruptedException {
        Thread.sleep(15000);
    }

    @Given("navigates to Human Resource")
    public void navigates_to_Human_Resource() throws InterruptedException {
        academyDashBoardPage.humanResourceModule.click();
        Thread.sleep(3000);
    }

    @Then("the following sub modules should be displayed {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void the_following_sub_modules_should_be_displayed(String staffDirectory, String staffAttendance, String payroll,
            String approveLeaveRequest, String applyLeave, String leaveType, String teachersRating, String department, String designation) {
        
                
    }
}
