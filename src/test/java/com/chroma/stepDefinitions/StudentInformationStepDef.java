package com.chroma.stepDefinitions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import com.aventstack.extentreports.model.Log;
import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.CTSMSNavigationModulesPage;
import com.chroma.pages.DashboardPage;
import com.chroma.pages.LoginPage;
import com.chroma.pages.SectionsPage;
import com.chroma.pages.StudentInformationPage;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import com.chroma.web.WebDriverUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StudentInformationStepDef extends PageInitializer {

    @Given("a user logs in to the CTSMS website with valid credentials username{string} and password {string}")
    public void a_user_logs_in_to_the_CTSMS_website_with_valid_credentials_username_and_password(String username,
            String password) {
        loginPage.userNameTextBox.sendKeys(username);
        loginPage.passwordTextBox.sendKeys(password);
        loginPage.signButton.click();
    }

    @Given("user clicks on Student Information section")
    public void user_clicks_on_Student_Information_section() {
        cTSMSNavigationModulesPage.studentInformationModule.click();
        CommonUtils.waitForVisibility(studentInformationPage.studentDetailsSubModule);
        CommonUtils.waitForVisibility(studentInformationPage.studentHouseSubModule);
        CommonUtils.waitForVisibility(studentInformationPage.disabledStudentsSubModule);
        CucumberLogUtils.logExtentScreenshot();
    }

    @Then("following submodule displayed {string}, {string} ,{string} ,{string},{string}, {string} ,{string}")
    public void following_submodule_displayed(String studentDetails, String studentAdmission, String disabledStudents,
            String bulkDelete, String studentCategories, String studentHouse, String disableReason) {

        String actualStudentDetailText = studentInformationPage.studentDetailsSubModule.getText();
        System.out.println(actualStudentDetailText);
        CommonUtils.assertEquals(actualStudentDetailText, studentDetails);
        String actualStudentAdmissionText = studentInformationPage.studentAdmissionSubModule.getText();
        System.out.println(actualStudentAdmissionText);
        CommonUtils.assertEquals(actualStudentAdmissionText, studentAdmission);
        String actualDisabledStudentsText = studentInformationPage.disabledStudentsSubModule.getText();
        CommonUtils.assertEquals(actualDisabledStudentsText, disabledStudents);
        System.out.println(actualDisabledStudentsText);
        String actualBulkDeleteText = studentInformationPage.bulkDeleteSubModule.getText();
        System.out.println(actualBulkDeleteText);
        CommonUtils.assertEquals(actualBulkDeleteText, bulkDelete);
        String actualStudentCategoriesText = studentInformationPage.studentCategoriesSubModule.getText();
        System.out.println(actualStudentCategoriesText);
        CommonUtils.assertEquals(actualStudentCategoriesText, studentCategories);
        String actualStudentHouseText = studentInformationPage.studentHouseSubModule.getText();
        System.out.println(actualStudentHouseText);
        CommonUtils.assertEquals(actualStudentHouseText, studentHouse);
        String actualDisableReasonText = studentInformationPage.disableReasonSubModule.getText();
        System.out.println(actualDisableReasonText);
        CommonUtils.assertEquals(actualDisableReasonText, disableReason);
        CucumberLogUtils.logExtentScreenshot();

    }

}
