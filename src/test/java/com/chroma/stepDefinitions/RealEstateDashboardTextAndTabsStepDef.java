package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.stepsImplementation.RealEstateDashboardTextAndTabsStepImpl;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class RealEstateDashboardTextAndTabsStepDef extends PageInitializer {

    @Given("a real estate admin is on the login page {string}")
    public void a_real_estate_admin_is_on_the_login_page(String url) {
        RealEstateDashboardTextAndTabsStepImpl.adminOnLoginPage(url);
    }

    @Given("admin logs in with valid credentials email {string} and password {string}")
    public void admin_logs_in_with_valid_credentials_email_and_password(String email, String password) {
        RealEstateDashboardTextAndTabsStepImpl.adminLogsInWithValidCredentials(email, password);
    }

    @Then("the admin sholud see the following elements {string}, {string}, {string}, {string}, {string}, {string} and following tabs {string}, {string}, {string}")
    public void the_admin_sholud_see_the_following_elements_and_following_tabs(String dashboard, String helloAdmin,
            String overview, String agentsGraph, String propertiesOverview, String properties, String agentsTab,
            String dashboardTab,
            String projectsTab) {
        RealEstateDashboardTextAndTabsStepImpl.adminSeesElementsAndTabsOfDashboardPage(
                dashboard, helloAdmin, overview, agentsGraph, propertiesOverview, properties, agentsTab, dashboardTab,
                projectsTab);
    }
}
