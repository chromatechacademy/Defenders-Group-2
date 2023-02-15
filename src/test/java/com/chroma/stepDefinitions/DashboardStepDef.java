package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.stepsImplementation.DashboardStepImpl;
import cucumber.api.java.en.Then;

public class DashboardStepDef extends PageInitializer {
   
    @Then("clicks on the hamburger menu")
    public void clicks_on_the_hamburger_menu() {
        DashboardStepImpl.userClicksHamburgerMenu();
    }

    @Then("the following modules should displayed {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void the_following_modules_should_displayed(String studentInformation, String feesCollection, String income,
            String expences,String academics, String humanResource, String homework, String reports) {
        DashboardStepImpl.userSeesModuleDisplayed(
                studentInformation, feesCollection, income, expences, academics, humanResource, homework, reports);
    }
}
