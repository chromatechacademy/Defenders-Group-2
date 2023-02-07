package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class IncomeModuleStepDefinition extends PageInitializer{
    
    /*
     * INCOME MODULE
     */
    @When("user clicks on Income Module in the hamburger menu")
    public void user_clicks_on_Income_Module_in_the_hamburger_menu() {
        dashboardPage.IncomeModule.click();
    }
    /*
     * USE SEE SUBMODULE
     */
    @Then("then user see {string} and {string} and {string}")
    public void then_user_see_and_and(String AddIncome, String SearchIncome, String IncomeHead)
            throws InterruptedException {
        CommonUtils.sleep(5000);
        String actualAddIncomeModuleText = incomeModulePage.AddIncomeModule.getText();
        CommonUtils.assertEquals(actualAddIncomeModuleText, AddIncome);
        String actualSearchIncomeModuleText = incomeModulePage.SearchIncomeModule.getText();
        CommonUtils.assertEquals(actualSearchIncomeModuleText, SearchIncome);
        String actuaIncomeHeadModuelText = incomeModulePage.IncomeHeadModule.getText();
        CommonUtils.assertEquals(actuaIncomeHeadModuelText, IncomeHead);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }
}
