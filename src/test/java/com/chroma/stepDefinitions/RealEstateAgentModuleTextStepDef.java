package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.stepsImplementation.RealEstateAgentModuleTextStepImpl;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class RealEstateAgentModuleTextStepDef extends PageInitializer {

    @Given("admin navigates to the {string} page")
    public void admin_navigates_to_the_page(String agents) {
        RealEstateAgentModuleTextStepImpl.adminNavigatesToAgentsPage(agents);
    }

    @Then("admin should see the following module and text {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void admin_should_see_the_following_module_and_text(String membersListModule, String activeModule,
            String inactiveModule,
            String allAgentsModule, String addNowModule, String nametext, String mailText, String contactNumberText,
            String actionsText) {
        RealEstateAgentModuleTextStepImpl.adminSeesAgentsPageModuleAndText(
                membersListModule, activeModule, inactiveModule, allAgentsModule, addNowModule, nametext, mailText,
                contactNumberText, actionsText);
    }
}
