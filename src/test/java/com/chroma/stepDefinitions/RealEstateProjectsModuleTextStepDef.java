package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.stepsImplementation.RealEstateProjectModuleTextStepImpl;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class RealEstateProjectsModuleTextStepDef extends PageInitializer {
    
    @Given("admin navigates to {string} page")
    public void admin_navigates_to_page(String projects) {
        RealEstateProjectModuleTextStepImpl.adminNavigatesToProjectPage(projects);
    }

    @Then("admin should see the following text module {string}, {string}, {string}, {string}")
    public void admin_should_see_the_following_text_module(String addNewProject, String projects, String active,
            String archived) {
               RealEstateProjectModuleTextStepImpl.adminSeesTheFollowingTextModule(addNewProject, projects, active, archived);
    }
}
