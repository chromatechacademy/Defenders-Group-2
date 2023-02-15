package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.CommonUtils;
import com.chroma.web.JavascriptUtils;
import com.chroma.web.WebDriverUtils;

public class RealEstateDashboardTextAndTabsStepImpl extends PageInitializer {

    /* Real Estate Admin Is On Login Page */
    public static void adminOnLoginPage(String url) {
        WebDriverUtils.driver.get(url);
        CommonUtils.nonMobileScreenshots();
    }

    /* Admin Logs In With Valid Credentials */
    public static void adminLogsInWithValidCredentials(String email, String password) {
        JavascriptUtils.scrollIntoView(realEstateLoginPage.loginButton);
        CommonUtils.sleep(2000);
        realEstateLoginPage.emailUserTextBox.sendKeys(email);
        realEstateLoginPage.passwordUserTextBox.sendKeys(password);
        realEstateLoginPage.loginButton.click();
        CommonUtils.nonMobileScreenshots();
    }

    /* Admin Sees Elements and Tabs Of Dashboard Page */
    public static void adminSeesElementsAndTabsOfDashboardPage(String dashboard, String helloAdmin,
            String overview, String agentsGraph, String propertiesOverview, String properties, String agentsTab,
            String dashboardTab,
            String projectsTab) {
        String actualDashboardElementText = realEstateDashboardPage.dashboardElementText.getText();
        CommonUtils.assertEquals(dashboard, actualDashboardElementText);
        String actualHelloAdminText = realEstateDashboardPage.helloAdminText.getText();
        CommonUtils.assertEquals(helloAdmin, actualHelloAdminText);
        String actualOverviewElementText = realEstateDashboardPage.overviewText.getText();
        CommonUtils.assertEquals(overview, actualOverviewElementText);
        String actualAgentsGraphText = realEstateDashboardPage.agentsGraphText.getText();
        CommonUtils.assertEquals(agentsGraph, actualAgentsGraphText);
        String actualPropertiesOverviewText = realEstateDashboardPage.propertiesOverviewText.getText();
        CommonUtils.assertEquals(propertiesOverview, actualPropertiesOverviewText);
        String actualPropertiesText = realEstateDashboardPage.propertiesText.getText();
        CommonUtils.assertEquals(properties, actualPropertiesText);
        String actualAgentsTabText = realEstateDashboardPage.agentsTab.getText();
        CommonUtils.assertEquals(agentsTab, actualAgentsTabText);
        String actualDashboardTabText = realEstateDashboardPage.dashboardTab.getText();
        CommonUtils.assertEquals(dashboardTab, actualDashboardTabText);
        String actualProjectsTabText = realEstateDashboardPage.projectsTab.getText();
        CommonUtils.assertEquals(projectsTab, actualProjectsTabText);
        CommonUtils.nonMobileScreenshots();
    }
}
