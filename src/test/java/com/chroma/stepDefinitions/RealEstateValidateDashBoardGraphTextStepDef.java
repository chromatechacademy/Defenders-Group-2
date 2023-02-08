package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import cucumber.api.java.en.Then;

public class RealEstateValidateDashBoardGraphTextStepDef extends PageInitializer {

    @Then("admin navigates to {string}")
    public void admin_navigates_to(String dashboard) {
        String actualDashboardText = realEstateValidateDashBoardGraphTextPage.dashBoardText.getText();
        CommonUtils.assertEquals(actualDashboardText, dashboard);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }

    @Then("Clicks the text {string}")
    public void clicks_the_text(String agentsGraph) {
        String actualAgentsGraphText = realEstateValidateDashBoardGraphTextPage.agentsGraphText.getText();
        realEstateValidateDashBoardGraphTextPage.agentsGraphText.click();
        CommonUtils.assertEquals(actualAgentsGraphText, agentsGraph);
    }

    @Then("the graph should be displayed with header text {string}")
    public void the_graph_should_be_displayed_with_header_text(String reservedByAgent) {
        String actualReservedByAgentText = realEstateValidateDashBoardGraphTextPage.reservedByAgentText.getText();
        CommonUtils.assertEquals(actualReservedByAgentText, reservedByAgent);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }

    @Then("clicks on the text Overview")
    public void clicks_on_the_text_Overview() {
        realEstateValidateDashBoardGraphTextPage.overviewText.click();

    }

    @Then("the graph should be displayed with a header text {string}")
    public void the_graph_should_be_displayed_with_a_header_text(String propertiesOverview) {
        String actualPropertiesOverviewText = realEstateValidateDashBoardGraphTextPage.propertiesOverviewText.getText();
        CommonUtils.assertEquals(actualPropertiesOverviewText, propertiesOverview);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }

}
