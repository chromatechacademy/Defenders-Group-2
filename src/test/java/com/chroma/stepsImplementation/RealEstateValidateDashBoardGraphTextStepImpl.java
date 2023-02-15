package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.CommonUtils;

public class RealEstateValidateDashBoardGraphTextStepImpl extends PageInitializer{

    /* Admin Navigates To Dashboard */
    public static void adminNavigatesToDashBoard(String dashboard) {
        String actualDashboardText = realEstateValidateDashBoardGraphTextPage.dashBoardText.getText();
        CommonUtils.assertEquals(actualDashboardText, dashboard);
        CommonUtils.nonMobileScreenshots();
    }

    /* Admin Clicks The Text Agents Graph */
    public static void adminClicksAgentsGraph(String agentsGraph) {
        String actualAgentsGraphText = realEstateValidateDashBoardGraphTextPage.agentsGraphText.getText();
        realEstateValidateDashBoardGraphTextPage.agentsGraphText.click();
        CommonUtils.assertEquals(actualAgentsGraphText, agentsGraph);
        CommonUtils.nonMobileScreenshots();
    }

    /* The Graph Displayed Header Reserved By Agent Text */
    public static void graphDisplayedHeaderReservedByAgentText(String reservedByAgent) {
        String actualReservedByAgentText = realEstateValidateDashBoardGraphTextPage.reservedByAgentText.getText();
        CommonUtils.assertEquals(actualReservedByAgentText, reservedByAgent);
        CommonUtils.nonMobileScreenshots();
    }

    /* Admin Clicks On The Text Overview */
    public static void adminClickTextOverview() {
        realEstateValidateDashBoardGraphTextPage.overviewText.click();
        CommonUtils.nonMobileScreenshots();
    }

    /* Graph Displayed Header Properties Overview Text */
    public static void graphDisplayedHeaderPropertiesOverviewText(String propertiesOverview) {
        String actualPropertiesOverviewText = realEstateValidateDashBoardGraphTextPage.propertiesOverviewText.getText();
        CommonUtils.assertEquals(actualPropertiesOverviewText, propertiesOverview);
        CommonUtils.nonMobileScreenshots();
    }
}
