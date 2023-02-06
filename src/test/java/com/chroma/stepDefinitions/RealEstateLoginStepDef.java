package com.chroma.stepDefinitions;

import org.junit.Assert;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.WebDriverUtils;

import cucumber.api.java.en.Then;


public class RealEstateLoginStepDef  extends PageInitializer{

    @Then("admin is succesfully loged in on Real Estate web page {string}")
    public void admin_is_succesfully_loged_in_on_Real_Estate_web_page(String url) {
        String actualHomePageURL = WebDriverUtils.driver.getCurrentUrl();
        Assert.assertEquals(actualHomePageURL, url);
        CucumberLogUtils.logExtentScreenshot();
        
    }

}
