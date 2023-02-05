package com.chroma.stepDefinitions;
import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.CommonUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class RealEstateProjectsModuleText extends PageInitializer {
    @Given("admin navigates to {string} page")
    public void admin_navigates_to_page(String projects) {
        realEstateDashboardPage.projectsTab.click();
    }

    @Then("admin should see the following text module {string}, {string}, {string}, {string}")
    public void admin_should_see_the_following_text_module(String addNewProject, String projects, String active,
            String archived) {
                String actualAddNewProjectModule = realEstateProjectsPage.addNewProjectModule.getText();
                CommonUtils.assertEquals(addNewProject, actualAddNewProjectModule);
                String actualProjectsModule = realEstateProjectsPage.projectsModule.getText();
                CommonUtils.assertEquals(projects, actualProjectsModule);
                String actualActiveModule = realEstateProjectsPage.activeModule.getText();
                CommonUtils.assertEquals(active, actualActiveModule);
                String actualArchivedModule = realEstateProjectsPage.archivedModule.getText();
                CommonUtils.assertEquals(archived, actualArchivedModule);
    }
}
