package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.stepsImplementation.CTSMSExpensesSubModuleStepImpl;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CTSMSExpensesSubModuleTextStepDef extends PageInitializer {
    
    @Given("navigates to Expenses Module")
    public void navigates_to_Expenses_Module() {
        CTSMSExpensesSubModuleStepImpl.userNavigatesToExpensesModule();
    }

    @Then("user should be able to see the following sub module {string}, {string}, {string}")
    public void user_should_be_able_to_see_the_following_sub_module(String addExpenseSubModule, String searchExpenseSubModule, String expenseHeadSubModule) {
       CTSMSExpensesSubModuleStepImpl.expensesSubModule(addExpenseSubModule, searchExpenseSubModule, expenseHeadSubModule);
    }
}
