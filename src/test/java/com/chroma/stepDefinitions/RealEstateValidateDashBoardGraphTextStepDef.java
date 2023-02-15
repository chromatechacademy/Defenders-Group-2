package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.stepsImplementation.RealEstateValidateDashBoardGraphTextStepImpl;
import cucumber.api.java.en.Then;

public class RealEstateValidateDashBoardGraphTextStepDef extends PageInitializer {

    @Then("admin navigates to {string}")
    public void admin_navigates_to(String dashboard) {
        RealEstateValidateDashBoardGraphTextStepImpl.adminNavigatesToDashBoard(dashboard);
    }

    @Then("Clicks the text {string}")
    public void clicks_the_text(String agentsGraph) {
        RealEstateValidateDashBoardGraphTextStepImpl.adminClicksAgentsGraph(agentsGraph);
    }

    @Then("the graph should be displayed with header text {string}")
    public void the_graph_should_be_displayed_with_header_text(String reservedByAgent) {
        RealEstateValidateDashBoardGraphTextStepImpl.graphDisplayedHeaderReservedByAgentText(reservedByAgent);
    }

    @Then("clicks on the text Overview")
    public void clicks_on_the_text_Overview() {
        RealEstateValidateDashBoardGraphTextStepImpl.adminClickTextOverview();
    }

    @Then("the graph should be displayed with a header text {string}")
    public void the_graph_should_be_displayed_with_a_header_text(String propertiesOverview) {
        RealEstateValidateDashBoardGraphTextStepImpl.graphDisplayedHeaderPropertiesOverviewText(propertiesOverview);
    }
}