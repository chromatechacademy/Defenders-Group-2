package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.stepsImplementation.RealEstateDeleteAgentStepImpl;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RealEstateDeleteAgentStepDef extends PageInitializer {

    @Given("navigates to Agents class")
    public void navigates_to_Agents_class() {
        RealEstateDeleteAgentStepImpl.userNavigatesToAgentClass();
    }

    @Given("click Add Now button")
    public void click_Add_Now_button() {
        RealEstateDeleteAgentStepImpl.userClicksAddNowButton();
    }

    @Then("admin user is able to create a new agent by adding first name {string}, last name {string}, email {string}, contact number {string}, password {string}")
    public void admin_user_is_able_to_create_a_new_agent_by_adding_first_name_last_name_email_contact_number_password(
            String fname, String lname, String email, String number, String password) {
        RealEstateDeleteAgentStepImpl.adminCreatesNewAgentByFillingRequirements(fname, lname, email, number, password);
    }

    @Then("admin user is able to verify that the agent is listed as active with the exact first name {string},last name {string}, mail \\(email) {string}, and contact number {string}")
    public void admin_user_is_able_to_verify_that_the_agent_is_listed_as_active_with_the_exact_first_name_last_name_mail_email_and_contact_number(
            String fname, String lname, String email, String contactNumber) {
        RealEstateDeleteAgentStepImpl.adminVerifyAgentIsListedActive(fname, lname, email, contactNumber);
    }

    @When("navigates to Active Members list and delete agent from active Members list with current email {string}")
    public void navigates_to_Active_Members_list_and_delete_agent_from_active_Members_list_with_current_email(
            String email) {
        RealEstateDeleteAgentStepImpl.navigatesToActiveMembersListAndDeleteAgentFromActiveMembersListWithCurrentEmail(
                email);
    }

    @Then("navigates to Inactive Members list to delete user permanently with current email {string} and verify that with message {string}")
    public void navigates_to_Inactive_Members_list_to_delete_user_permanently_with_current_email_and_verify_that_with_message(
            String email, String deleteSuccess) {
        RealEstateDeleteAgentStepImpl.navigatesToInactiveMembersListToDeletePermanentlyWithCurrentEmailAndVerifyMessage(
                        email, deleteSuccess);
    }
}
