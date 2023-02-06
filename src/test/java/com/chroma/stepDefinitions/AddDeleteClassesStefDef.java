package com.chroma.stepDefinitions;

import com.chroma.pages.AddDeleteClassesPage;
import com.chroma.pages.CTSMSNavigationModulesPage;
import com.chroma.pages.IncomeModulePage;
import com.chroma.pages.LoginPage;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddDeleteClassesStefDef {
    CTSMSNavigationModulesPage ctsmsNavigationModulesPage = new CTSMSNavigationModulesPage();
    AddDeleteClassesPage addDeleteClassesPage = new AddDeleteClassesPage();
    LoginPage loginPage = new LoginPage();
    IncomeModulePage incomeModulePage = new IncomeModulePage();
    CommonUtils commonUtils = new CommonUtils();


    @When("Chroma Tech Academy faculty member logs with valid credentials")
    public void chroma_Tech_Academy_faculty_member_logs_with_valid_credentials(String login, String password) {
        loginPage.userNameTextBox.sendKeys("general@teacher.com");
        loginPage.passwordTextBox.sendKeys("123456");
        loginPage.signButton.click();
    }

    @Then("Acadamic Module displayed")
    public void acadamic_Module_displayed() {
        ctsmsNavigationModulesPage.academicsModule.click();

    }

    @Then("I should able to click Class sub module")
    public void i_should_able_to_click_Class_sub_module() {
        addDeleteClassesPage.ClassSubModuleLink.click();
    }

    @Then("I should able to add Class name")
    public void i_should_able_to_add_Class_name() throws InterruptedException {
       
       addDeleteClassesPage.ClassTextBox.sendKeys("Cyber Security1");
      

        Thread.sleep(5000);
    }

    @Then("I shoud able to select section Field")
    public void i_shoud_able_to_select_section_Field() throws InterruptedException {
        addDeleteClassesPage.SelectAPITesting.click();
        addDeleteClassesPage.SelectLinuxFundementals.click();

        Thread.sleep(5000);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }

    @Then("I should able to save")
    public void i_should_able_to_save() {
        addDeleteClassesPage.SaveButton.click();
        
    }

    @Then("I should able to Search Class that alredy saved")
    public void i_should_able_to_Search_Class_that_alredy_saved() throws InterruptedException {
        addDeleteClassesPage.SearchClass.sendKeys("Cyber Security1");

        Thread.sleep(3000);
    }

    @Then("I should able to delete Class")
    public void i_should_able_to_delete_Class() throws InterruptedException {
         addDeleteClassesPage.deleteClassButton.click();
      

        Thread.sleep(3000);

        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();

    }
}
