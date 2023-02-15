package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.stepsImplementation.RealEstateLoginStepImpl;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class RealEstateLoginStepDef extends PageInitializer {

    @Then("admin is succesfully loged in on Real Estate web page {string}")
    public void admin_is_succesfully_loged_in_on_Real_Estate_web_page(String url) {
       RealEstateLoginStepImpl.adminSuccesfullyLoggedIn(url);
    }

    @Then("admin logs out the admin site")
    public void admin_logs_out_the_admin_site() {
        RealEstateLoginStepImpl.adminLogsOut();
    }

    @Given("admin is on the agent login page {string}")
    public void admin_is_on_the_agent_login_page(String url) {
        RealEstateLoginStepImpl.adminOnAgentLoginPage(url);
    }

    @Then("admin is seccesfully loged in on Agent Real Estate web page {string}")
    public void admin_is_seccesfully_loged_in_on_Agent_Real_Estate_web_page(String url) {
        RealEstateLoginStepImpl.adminOnAgentRealEstateWebPage(url);
    }
}
