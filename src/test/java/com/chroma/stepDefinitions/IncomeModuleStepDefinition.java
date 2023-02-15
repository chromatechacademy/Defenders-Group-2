package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.stepsImplementation.IncomeModuleStepImpl;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class IncomeModuleStepDefinition extends PageInitializer{
    
    @When("user clicks on Income Module in the hamburger menu")
    public void user_clicks_on_Income_Module_in_the_hamburger_menu() {
        IncomeModuleStepImpl.userClicksIncomeModule();
    }
    
    @Then("then user see {string} and {string} and {string}")
    public void then_user_see_and_and(String AddIncome, String SearchIncome, String IncomeHead)
            throws InterruptedException {
        IncomeModuleStepImpl.incomeSubModules(AddIncome, SearchIncome, IncomeHead);
    }
}
