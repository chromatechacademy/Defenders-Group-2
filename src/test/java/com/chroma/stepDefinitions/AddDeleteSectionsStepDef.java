package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.stepsImplementation.AddDeleteSectionsStepImpl;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddDeleteSectionsStepDef extends PageInitializer {

    @Given("Chroma Tech faculty member is on a login page {string}")
    public void chroma_Tech_faculty_member_is_on_a_login_page(String url) {
       AddDeleteSectionsStepImpl.chromeTechMemberLoginPage(url);
    }

    @When("Chroma Tech faculty member logs in with valid credentials username {string} and password {string}")
    public void chroma_Tech_faculty_member_logs_in_with_valid_credentials_username_and_password(String login,
            String password) {
        AddDeleteSectionsStepImpl.chromaTechMemeberLogsIn(login, password);
    }

    @When("navigates to Academics module")
    public void navigates_to_Academics_module() {
        AddDeleteSectionsStepImpl.chromaTechMemeberNavigatesToAcademicsModule();
    }

    @When("navigates to Sections Submodule")
    public void navigates_to_Sections_Submodule() {
        AddDeleteSectionsStepImpl.chromaTechMemeberNavigatesToSectionsSubModule();
    }

    @When("enters Section Name {string}")
    public void enters_Section_Name(String sectionName) {
        AddDeleteSectionsStepImpl.chromaTechMemeberEntersSectionName(sectionName);
    }

    @When("clicks Save button")
    public void clicks_Save_button() {
        AddDeleteSectionsStepImpl.chromaTechMemeberClicksSaveButton();
    }

    @Then("Chroma Tech faculty member be able to see confirmation message displays {string}")
    public void chroma_Tech_faculty_member_be_able_to_see_confirmation_message_displays(String expectedSuccessMessage) {
        AddDeleteSectionsStepImpl.confirmationMessageDisplayed(expectedSuccessMessage);
    }

    @Then("Chroma Tech faculty member selects section name {string} in Section List and delete it")
    public void chroma_Tech_faculty_member_selects_section_name_in_Section_List_and_delete_it(String sectionName) {
        AddDeleteSectionsStepImpl.selectSectionNameInSectionAndDeleteIt(sectionName);
    }
}
