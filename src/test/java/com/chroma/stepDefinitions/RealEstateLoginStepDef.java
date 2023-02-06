package com.chroma.stepDefinitions;

import org.junit.Assert;
import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import com.chroma.web.WebDriverUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class RealEstateLoginStepDef extends PageInitializer {

    @Then("admin is succesfully loged in on Real Estate web page {string}")
    public void admin_is_succesfully_loged_in_on_Real_Estate_web_page(String url) {
        String actualHomePageURL = WebDriverUtils.driver.getCurrentUrl();
        Assert.assertEquals(actualHomePageURL, url);
        CucumberLogUtils.logExtentScreenshot();
    }

    @Then("admin logs out the admin site")
    public void admin_logs_out_the_admin_site() {
        realEstateAgentPage.adminLogOutBox.click();
        CommonUtils.waitForVisibility(realEstateAgentPage.adminLogOutButton);
        realEstateAgentPage.adminLogOutButton.click();    
    }

    @Given("admin is on the agent login page {string}")
    public void admin_is_on_the_agent_login_page(String url) {
        WebDriverUtils.driver.get(url);
    }

    @Then("admin is seccesfully loged in on Agent Real Estate web page {string}")
    public void admin_is_seccesfully_loged_in_on_Agent_Real_Estate_web_page(String url) {
    }

    @Then("admin logs out the Agent site")
    public void admin_logs_out_the_Agent_site() {
    }
}
