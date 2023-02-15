package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.CommonUtils;

public class HumanResourceModuleStepImpl extends PageInitializer {

    /* User Logs In With Valid Credentials */
    public static void userLogsIn(String username, String password){
        loginPage.userNameTextBox.sendKeys(username);
        loginPage.passwordTextBox.sendKeys(password);
        loginPage.signButton.click();
        CommonUtils.nonMobileScreenshots();
    }

    /* User Navigates To Human Resource */
    public static void userNavigatesToHumanResource() {
        academyDashBoardPage.humanResourceModule.click();
        CommonUtils.nonMobileScreenshots();
    }

    /* User Sees Human Resource Sub Module */
    public static void humanResourceSubModule(String staffDirectory, String staffAttendance,String payroll,
            String approveLeaveRequest, String applyLeave, String leaveType, String teachersRating, String department,
            String designation) {
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
        CommonUtils.nonMobileScreenshots();
    }
}
