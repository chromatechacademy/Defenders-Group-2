package com.chroma.stepDefinitions;

import java.util.concurrent.TimeUnit;


import com.chroma.pages.DashboardPage;
import com.chroma.pages.IncomeModulePage;
import com.chroma.pages.LoginPage;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import com.chroma.web.WebDriverUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class IncomeModuleStepDefinition {
    DashboardPage dashboardPage = new DashboardPage();
    LoginPage loginPage = new LoginPage();
    IncomeModulePage incomemodulePage = new IncomeModulePage();
    CommonUtils commonUtils = new CommonUtils();

    @Given("a user is on the login page {string}")
    public void a_user_is_on_the_login_page(String url) {
        WebDriverUtils.driver.get(url);

    }

    @When("user logs in with valid credentials username")
    public void user_logs_in_with_valid_credentials_username() {

        loginPage.userNameTextBox.sendKeys("general@teacher.com");
        loginPage.passwordTextBox.sendKeys("123456");
        loginPage.signButton.click();

    }

    @When("user clicks on Income Module in the hamburger menu")
    public void user_clicks_on_Income_Module_in_the_hamburger_menu() {

        dashboardPage.IncomeModule.click();

    }

    @Then("then user see {string} and {string} and {string}")
    public void then_user_see_and_and(String AddIncome, String SearchIncome, String IncomeHead) throws InterruptedException {


        CommonUtils.sleep(5000);
        WebDriverUtils.driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        String actualAddIncomeModuleText = incomemodulePage.AddIncomeModule.getText();
        CommonUtils.assertEquals(actualAddIncomeModuleText, AddIncome);
        String actualSearchIncomeModuleText = incomemodulePage.SearchIncomeModule.getText();
        CommonUtils.assertEquals(actualSearchIncomeModuleText, SearchIncome);
        String actuaIncomeHeadModuelText = incomemodulePage.IncomeHeadModule.getText();
        CommonUtils.assertEquals(actuaIncomeHeadModuelText, IncomeHead);

        CucumberLogUtils.logExtentScreenshot();
        

    }
    

}
