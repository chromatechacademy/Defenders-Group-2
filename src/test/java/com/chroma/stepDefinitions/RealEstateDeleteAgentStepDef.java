package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.RealEstateActiveAgentsPage;
import com.chroma.pages.RealEstateInactiveAgentsPage;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import com.chroma.web.JavascriptUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RealEstateDeleteAgentStepDef extends PageInitializer {

    @Given("navigates to Agents class")
    public void navigates_to_Agents_class() {
        realEstateDashboardPage.agentsClass.click();
    }

    @Given("click Add Now button")
    public void click_Add_Now_button() {
        realEstateAgentsPage.addNowButton.click();
    }

    @Then("admin user is able to create a new agent by adding first name {string}, last name {string}, email {string}, contact number {string}, password {string}")
    public void admin_user_is_able_to_create_a_new_agent_by_adding_first_name_last_name_email_contact_number_password(
            String fname, String lname, String email, String number, String password) {
        realEstateNewAgentWindowPage.firstNameTextBox.sendKeys(fname);
        realEstateNewAgentWindowPage.lastNameTextBox.sendKeys(lname);
        realEstateNewAgentWindowPage.emailTextBox.sendKeys(email);
        realEstateNewAgentWindowPage.contactNumberTextBox.sendKeys(number);
        realEstateNewAgentWindowPage.passwordTextBox.sendKeys(password);
        realEstateNewAgentWindowPage.retypePasswordTextBox.sendKeys(password);
        realEstateNewAgentWindowPage.saveButton.click();
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
        CommonUtils.sleep(3000);
        realEstateNewAgentWindowPage.backButton.click();
    }

    @Then("admin user is able to verify that the agent is listed as active with the exact first name {string},last name {string}, mail \\(email) {string}, and contact number {string}")
    public void admin_user_is_able_to_verify_that_the_agent_is_listed_as_active_with_the_exact_first_name_last_name_mail_email_and_contact_number(
            String fname, String lname, String email, String contactNumber) {
        realEstateDashboardPage.activeList.click();
        CommonUtils.sleep(2000);
        JavascriptUtils.scrollIntoView(RealEstateActiveAgentsPage.emailLocator(email));
        String actualEmail = RealEstateActiveAgentsPage.emailLocator(email).getText();
        CommonUtils.assertEquals(email, actualEmail);
        String actualContactNumber = RealEstateActiveAgentsPage.contactNumberLocator(contactNumber).getText();
        CommonUtils.assertEquals(contactNumber, actualContactNumber);
        String fullName = fname + " " + lname;
        String actualName = RealEstateActiveAgentsPage.nameLocator(actualContactNumber).getText();
        CommonUtils.assertEquals(fullName, actualName);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    @When("navigates to Active Members list and delete agent from active Members list with current email {string}")
    public void navigates_to_Active_Members_list_and_delete_agent_from_active_Members_list_with_current_email(
            String email) {
        realEstateDashboardPage.activeList.click();
        JavascriptUtils.scrollIntoView(RealEstateActiveAgentsPage.accountMenu(email));
        RealEstateActiveAgentsPage.accountMenu(email).click();
        RealEstateActiveAgentsPage.deleteButton(email).click();
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
        CommonUtils.sleep(3000);
    }

    @Then("navigates to Inactive Members list to delete user permanently with current email {string} and verify that with message {string}")
    public void navigates_to_Inactive_Members_list_to_delete_user_permanently_with_current_email_and_verify_that_with_message(
            String email, String deleteSuccess) {
        realEstateDashboardPage.inactiveList.click();
        JavascriptUtils.scrollIntoView(RealEstateInactiveAgentsPage.agentMenuButton(email));
        RealEstateInactiveAgentsPage.agentMenuButton(email).click();
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
        RealEstateInactiveAgentsPage.agentDeleteButton(email).click();
        String actualDeleteSuccess = realEstateInactiveAgentsPage.assertElement.getText();
        CommonUtils.assertEquals(deleteSuccess, actualDeleteSuccess);
    }
}
