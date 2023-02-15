package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.CommonUtils;

public class SectionsAndClassesStepImpl extends PageInitializer {

    /* User Navigates To Class Sub Module */
    public static void userNavigatesToClassSubModule() {
        dashboardPage.classSubModule.click();
        CommonUtils.nonMobileScreenshots();
    }

    /* User Verifies That Class SDET Presents In Class List */
    public static void userVerifiesClassSdetPresentInClassList(String firstClassName) {
        String actualSdetModuleSection = sectionsAndClassesPage.sdetModuleSection.getText();
        CommonUtils.assertEquals(firstClassName, actualSdetModuleSection);
        CommonUtils.nonMobileScreenshots();
    }

    /* User Sees Sections Displayed */
    public static void userSeesSectionsDisplayed(String databaseTesting, String testingFundamentals, String sdlc,
            String selenium, String cucumber, String apiTesting, String github, String javaForCoolPpl,
            String mobileTest,String accessibilityTesting) {
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
        CommonUtils.nonMobileScreenshots();
    }

    /* User Verifies That Second Class Is Present in Class List */
    public static void userVerifiesSecondClassIsPresentInClassList(String secondClassName) {
        String actualCyberSecuritySection = sectionsAndClassesPage.CyberSecurityClass.getText();
        CommonUtils.assertEquals(secondClassName, actualCyberSecuritySection);
        CommonUtils.nonMobileScreenshots();
    }

    /* User Sees Sections Displayed For Second Class */
    public static void userSeesSectionsDisplayedForSecondClass(String penetrationTesting, String networkingFunds,
            String linuxFunds,String ciaTriad) {
        String actualPenetrationTestingSection = sectionsAndClassesPage.penetrationTestingSection.getText();
        CommonUtils.assertEquals(penetrationTesting, actualPenetrationTestingSection);
        String actualNetworkingFundamentalsSection = sectionsAndClassesPage.networkingFundamentalsSection.getText();
        CommonUtils.assertEquals(networkingFunds, actualNetworkingFundamentalsSection);
        String actualLinuxFundamentalsSection = sectionsAndClassesPage.linuxFundamentalsSection.getText();
        CommonUtils.assertEquals(linuxFunds, actualLinuxFundamentalsSection);
        String actualCiaTriadSection = sectionsAndClassesPage.ciaTriadSection.getText();
        CommonUtils.assertEquals(ciaTriad, actualCiaTriadSection);
        CommonUtils.nonMobileScreenshots();
    }
}
