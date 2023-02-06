package com.chroma.stepDefinitions;

import com.chroma.pages.DashboardPage;
import com.chroma.pages.LoginPage;
import com.chroma.pages.SectionsPage;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import com.chroma.web.WebDriverUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddDeleteSectionsStepDef {

    DashboardPage dashboardPage = new DashboardPage();
    LoginPage loginPage = new LoginPage();
    SectionsPage sectionsPage = new SectionsPage();

    @Given("Chroma Tech faculty member is on a login page {string}")
    public void chroma_Tech_faculty_member_is_on_a_login_page(String url) {
        WebDriverUtils.driver.get(url);
        CucumberLogUtils.logExtentScreenshot();
    }

    @When("Chroma Tech faculty member logs in with valid credentials username {string} and password {string}")
    public void chroma_Tech_faculty_member_logs_in_with_valid_credentials_username_and_password(String login,
            String password) {
        loginPage.userNameTextBox.sendKeys(login);
        loginPage.passwordTextBox.sendKeys(password);
        CucumberLogUtils.logExtentScreenshot();
        loginPage.signButton.click();
    }

    @When("navigates to Academics module")
    public void navigates_to_Academics_module() {
        dashboardPage.academicsModule.click();
    }

    @When("navigates to Sections Submodule")
    public void navigates_to_Sections_Submodule() {
        dashboardPage.sectionsSubModule.click();
    }

    @When("enters Section Name {string}")
    public void enters_Section_Name(String sectionName) {
        sectionsPage.sectionNameTextBox.sendKeys(sectionName);
    }

    @When("clicks Save button")
    public void clicks_Save_button() {
        sectionsPage.saveButton.click();
    }

    @Then("Chroma Tech faculty member be able to see confirmation message displays {string}")
    public void chroma_Tech_faculty_member_be_able_to_see_confirmation_message_displays(String expectedSuccessMessage) {

        String actualSuccessMessage = sectionsPage.successfullySavedMessage.getText();
        CommonUtils.assertEquals(expectedSuccessMessage, actualSuccessMessage);

    }

    @Then("Chroma Tech faculty member selects section name {string} in Section List and delete it")
    public void chroma_Tech_faculty_member_selects_section_name_in_Section_List_and_delete_it(String sectionName)
            throws InterruptedException {

        if (SectionsPage.sectionNameLocator(sectionName).size() != 0) {
            SectionsPage.sectionsNameDeleteButton(sectionName).click();
            Thread.sleep(1000);
            WebDriverUtils.driver.switchTo().alert().accept();
            Thread.sleep(1000);
        } else {

        }

    }
}
