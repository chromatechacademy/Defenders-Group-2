package com.chroma.stepDefinitions;

import com.chroma.pages.DashboardPage;
import com.chroma.pages.SectionsAndClassesPage;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SectionsAndClassesStepDef {

    DashboardPage dashboardPage = new DashboardPage();
    SectionsAndClassesPage sectionsAndClassesPage = new SectionsAndClassesPage();

    @Then("navigates to Class Submodule")
    public void navigates_to_Class_Submodule() {
        dashboardPage.classSubModule.click();

    }

    @Then("verifies that class {string} presents in Class List")
    public void verifies_that_class_presents_in_Class_List(String firstClassName) {
        String actualSdetModuleSection = sectionsAndClassesPage.sdetModuleSection.getText();
        CommonUtils.assertEquals(firstClassName, actualSdetModuleSection);

    }

    @Then("the following sections should be displayed {string}, {string},{string},{string},{string},{string},{string},{string},{string},{string}")
    public void the_following_sections_should_be_displayed(String databaseTesting, String testingFundamentals,
            String sdlc,
            String selenium, String cucumber, String apiTesting, String github, String javaForCoolPpl,
            String mobileTest,
            String accessibilityTesting) {

        String actualDatabaseTestingSection = sectionsAndClassesPage.databaseTestingSection.getText();
        CommonUtils.assertEquals(databaseTesting, actualDatabaseTestingSection);

        String actualTestingFundamentalsSection = sectionsAndClassesPage.testingFundamentalsSection.getText();
        CommonUtils.assertEquals(testingFundamentals, actualTestingFundamentalsSection);

        String actualSdlcMethodologiesSection = sectionsAndClassesPage.sdlcMethodologiesSection.getText();
        CommonUtils.assertEquals(sdlc, actualSdlcMethodologiesSection);

        String actualSeleniumTestAutomationSection = sectionsAndClassesPage.seleniumTestAutomationSection.getText();
        CommonUtils.assertEquals(selenium, actualSeleniumTestAutomationSection);

        String actualCucumberFundamentalsSection = sectionsAndClassesPage.cucumberFundamentalsSection.getText();
        CommonUtils.assertEquals(cucumber, actualCucumberFundamentalsSection);

        String actualApiTestinSection = sectionsAndClassesPage.apiTestinSection.getText();
        CommonUtils.assertEquals(apiTesting, actualApiTestinSection);

        String actualGithubSection = sectionsAndClassesPage.githubSection.getText();
        CommonUtils.assertEquals(github, actualGithubSection);

        String actualJavaForCoolPeopleSection = sectionsAndClassesPage.javaForCoolPeopleSection.getText();
        CommonUtils.assertEquals(javaForCoolPpl, actualJavaForCoolPeopleSection);

        String actualMobileTestAutomationSection = sectionsAndClassesPage.mobileTestAutomationSection.getText();
        CommonUtils.assertEquals(mobileTest, actualMobileTestAutomationSection);

        String actualAccessibilityTestingSection = sectionsAndClassesPage.accessibilityTestingSection.getText();
        CommonUtils.assertEquals(accessibilityTesting, actualAccessibilityTestingSection);
    }

    @When("verifies that second class {string} presents in Class List")
    public void verifies_that_second_class_presents_in_Class_List(String secondClassName) {
        String actualCyberSecuritySection = sectionsAndClassesPage.CyberSecurityClass.getText();
        CommonUtils.assertEquals(secondClassName, actualCyberSecuritySection);

    }

    @Then("the following sections should be displayed with second class {string},{string},{string},{string}")
    public void the_following_sections_should_be_displayed_with_second_class(String penetrationTesting,
            String networkingFunds,
            String linuxFunds,
            String ciaTriad) {
        String actualPenetrationTestingSection = sectionsAndClassesPage.penetrationTestingSection.getText();
        CommonUtils.assertEquals(penetrationTesting, actualPenetrationTestingSection);

        String actualNetworkingFundamentalsSection = sectionsAndClassesPage.networkingFundamentalsSection.getText();
        CommonUtils.assertEquals(networkingFunds, actualNetworkingFundamentalsSection);

        String actualLinuxFundamentalsSection = sectionsAndClassesPage.linuxFundamentalsSection.getText();
        CommonUtils.assertEquals(linuxFunds, actualLinuxFundamentalsSection);

        String actualCiaTriadSection = sectionsAndClassesPage.ciaTriadSection.getText();
        CommonUtils.assertEquals(ciaTriad, actualCiaTriadSection);

        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }
}