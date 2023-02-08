package com.chroma.stepDefinitions;

import com.chroma.pages.AddDeleteClassesPage;
import com.chroma.pages.CTSMSNavigationModulesPage;
import com.chroma.pages.IncomeModulePage;
import com.chroma.pages.LoginPage;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import cucumber.api.java.en.Then;

public class AddDeleteClassesStefDef {
    CTSMSNavigationModulesPage ctsmsNavigationModulesPage = new CTSMSNavigationModulesPage();
    AddDeleteClassesPage addDeleteClassesPage = new AddDeleteClassesPage();
    LoginPage loginPage = new LoginPage();
    IncomeModulePage incomeModulePage = new IncomeModulePage();
    CommonUtils commonUtils = new CommonUtils();
    /*
     * ACADAMIC MODULE
     */
    @Then("Acadamic Module displayed")
    public void acadamic_Module_displayed() {
    ctsmsNavigationModulesPage.academicsModule.click();   
    }
    /*
     * CLASS SUB MODULE
     */
    @Then("I should able to click Class sub module")
    public void i_should_able_to_click_Class_sub_module() {
        addDeleteClassesPage.ClassSubModuleLink.click();
    }
    /*
     * ADD CLASS
     */
    @Then("I should able to add Class name {string}")
    public void i_should_able_to_add_Class_name(String newClassName) {
        addDeleteClassesPage.ClassTextBox.sendKeys(newClassName);
        CommonUtils.sleep(500);
    }
    /*
     * SELECT SECTIONS
     */
    @Then("I shoud able to select section Field")
    public void i_shoud_able_to_select_section_Field() {
        addDeleteClassesPage.SelectAPITesting.click();
        addDeleteClassesPage.SelectLinuxFundementals.click();
        CommonUtils.sleep(500);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }
    /*
     * SAVE CLASS
     */
    @Then("I should able to save")
    public void i_should_able_to_save() {
        addDeleteClassesPage.SaveButton.click();
    }
    /*
     * SEARCH CLASS ALREADY SAVED
     */
    @Then("I should able to Search Class that alredy saved {string}")
    public void i_should_able_to_Search_Class_that_alredy_saved(String searchNewClass) {
        addDeleteClassesPage.SearchClass.sendKeys(searchNewClass);
        CommonUtils.sleep(500);
    }
    /*
     * DELETE CLASS
     */
    @Then("I should able to delete Class")
    public void i_should_able_to_delete_Class() {
        addDeleteClassesPage.deleteClassButton.click();
        CommonUtils.acceptAlert();
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
        CommonUtils.sleep(3000);
    }
}
