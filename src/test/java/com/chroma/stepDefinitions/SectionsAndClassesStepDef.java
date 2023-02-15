package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.stepsImplementation.SectionsAndClassesStepImpl;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SectionsAndClassesStepDef extends PageInitializer {

    @Then("navigates to Class Submodule")
    public void navigates_to_Class_Submodule() {
        SectionsAndClassesStepImpl.userNavigatesToClassSubModule();
    }

    @Then("verifies that class {string} presents in Class List")
    public void verifies_that_class_presents_in_Class_List(String firstClassName) {
        SectionsAndClassesStepImpl.userVerifiesClassSdetPresentInClassList(firstClassName);
    }

    @Then("the following sections should be displayed {string}, {string},{string},{string},{string},{string},{string},{string},{string},{string}")
    public void the_following_sections_should_be_displayed(String databaseTesting, String testingFundamentals,
            String sdlc,String selenium, String cucumber, String apiTesting, String github, String javaForCoolPpl,
            String mobileTest, String accessibilityTesting) {
        SectionsAndClassesStepImpl.userSeesSectionsDisplayed(
                databaseTesting, testingFundamentals, sdlc, selenium, cucumber, apiTesting, github, javaForCoolPpl,
                mobileTest, accessibilityTesting);
    }

    @When("verifies that second class {string} presents in Class List")
    public void verifies_that_second_class_presents_in_Class_List(String secondClassName) {
       SectionsAndClassesStepImpl.userVerifiesSecondClassIsPresentInClassList(secondClassName);
    }

    @Then("the following sections should be displayed with second class {string},{string},{string},{string}")
    public void the_following_sections_should_be_displayed_with_second_class(String penetrationTesting,
            String networkingFunds,String linuxFunds, String ciaTriad) {
        SectionsAndClassesStepImpl.userSeesSectionsDisplayedForSecondClass(
                penetrationTesting, networkingFunds, linuxFunds, ciaTriad);
    }
}