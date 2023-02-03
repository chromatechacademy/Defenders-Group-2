package com.chroma.stepDefinitions;
import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HumanResourceModuleStepDef extends PageInitializer{

    @Given("user logs in with valid credentials username {string} and password {string}")
    public void user_logs_in_with_valid_credentials_username_and_password(String username, String password)
            throws InterruptedException {
                loginPage.userNameTextBox.sendKeys(username);
                loginPage.passwordTextBox.sendKeys(password);
                CucumberLogUtils.logExtentScreenshot();
                loginPage.signButton.click();
    }

    @Given("navigates to Human Resource")
    public void navigates_to_Human_Resource() {
        academyDashBoardPage.humanResourceModule.click();
    }

    @Then("the following sub modules should be displayed {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void the_following_sub_modules_should_be_displayed(String staffDirectory, String staffAttendance, String payroll,
            String approveLeaveRequest, String applyLeave, String leaveType, String teachersRating, String department, String designation) {
                String staffDirectorySubModule = academyDashBoardPage.staffDirectorySubModule.getText();
                CommonUtils.assertEquals(staffDirectory, staffDirectorySubModule);
                String staffAttendanceSubModule = academyDashBoardPage.staffAttendanceSubModule.getText();
                CommonUtils.assertEquals(staffAttendance, staffAttendanceSubModule);
                String payrollSubModule = academyDashBoardPage.payrollSubModule.getText();
                CommonUtils.assertEquals(payroll, payrollSubModule);
                String approveLeaveRequestSubModule = academyDashBoardPage.approveLeaveRequestSubModule.getText();
                CommonUtils.assertEquals(approveLeaveRequest, approveLeaveRequestSubModule);
                String applyLeaveSubModule = academyDashBoardPage.applyLeaveSubModule.getText();
                CommonUtils.assertEquals(applyLeave, applyLeaveSubModule);
                String leaveTypeSubModule = academyDashBoardPage.leaveTypeSubModule.getText();
                CommonUtils.assertEquals(leaveType, leaveTypeSubModule);
                String teachersRatingSubModule = academyDashBoardPage.teachersRatingSubModule.getText();
                CommonUtils.assertEquals(teachersRating, teachersRatingSubModule);
                String departmentSubModule = academyDashBoardPage.departmentSubModule.getText();
                CommonUtils.assertEquals(department, departmentSubModule);
                String designationSubModule = academyDashBoardPage.designationSubModule.getText();
                CommonUtils.assertEquals(designation, designationSubModule);
    }
}
