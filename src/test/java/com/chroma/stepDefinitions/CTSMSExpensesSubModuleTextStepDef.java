package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CTSMSExpensesSubModuleTextStepDef extends PageInitializer {
    
    @Given("navigates to Expenses Module")
    public void navigates_to_Expenses_Module() {
        academyDashBoardPage.expensesModule.click();
    }

    @Then("user should be able to see the following sub module {string}, {string}, {string}")
    public void user_should_be_able_to_see_the_following_sub_module(String addExpenseSubModule, String searchExpenseSubModule, String expenseHeadSubModule) {
       String actualAddExpenseSubModule = academyDashBoardPage.addExpenseSubModule.getText();
       CommonUtils.assertEquals(addExpenseSubModule, actualAddExpenseSubModule);
       String actualSearchExpenseSubModule = academyDashBoardPage.searchExpenseSubModule.getText();
       CommonUtils.assertEquals(searchExpenseSubModule, actualSearchExpenseSubModule);
       String actualExpenseHeadSubModule = academyDashBoardPage.expenseHeadSubModule.getText();
       CommonUtils.assertEquals(expenseHeadSubModule, actualExpenseHeadSubModule);
       CucumberLogUtils.logScreenShot();
       CucumberLogUtils.logExtentScreenshot();
    }
}
