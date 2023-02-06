package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.CommonUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class RealEstateAgentModuleTextStepDef extends PageInitializer {
    @Given("admin navigates to the {string} page")
    public void admin_navigates_to_the_page(String agents) {
        realEstateDashboardPage.agentsTab.click();
    }

    @Then("admin should see the following module and text {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void admin_should_see_the_following_module_and_text(String membersListModule, String activeModule,
            String inactiveModule,
            String allAgentsModule, String addNowModule, String nametext, String mailText, String contactNumberText,
            String actionsText) {
        String actualMembersListModuleText = realEstateAgentsPage.membersListModule.getText();
        CommonUtils.assertEquals(membersListModule, actualMembersListModuleText);
        String actualActiveModuleText = realEstateAgentsPage.activeModule.getText();
        CommonUtils.assertEquals(activeModule, actualActiveModuleText);
        String actualInactiveModuleText = realEstateAgentsPage.inactiveModule.getText();
        CommonUtils.assertEquals(inactiveModule, actualInactiveModuleText);
        String actualAllAgentsModuleText = realEstateAgentsPage.allAgentModule.getText();
        CommonUtils.assertEquals(allAgentsModule, actualAllAgentsModuleText);
        String actualAddNowModuleText = realEstateAgentsPage.addNowModule.getText();
        CommonUtils.assertEquals(addNowModule, actualAddNowModuleText);
        String actualNameText = realEstateAgentsPage.nameText.getText();
        CommonUtils.assertEquals(nametext, actualNameText);
        String actualMailText = realEstateAgentsPage.mailText.getText();
        CommonUtils.assertEquals(mailText, actualMailText);
        String actualContactNumberText = realEstateAgentsPage.contactNumberText.getText();
        CommonUtils.assertEquals(contactNumberText, actualContactNumberText);
        String actualActionsText = realEstateAgentsPage.actionsText.getText();
        CommonUtils.assertEquals(actionsText, actualActionsText);
    }
}
