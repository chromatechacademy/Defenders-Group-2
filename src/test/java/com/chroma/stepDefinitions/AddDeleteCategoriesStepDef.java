package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.AddDeleteStudentCategoriesPage;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddDeleteCategoriesStepDef extends PageInitializer {

    @When("user clicks on {string} module")
    public void user_clicks_on_module(String moduleText) {
        cTSMSNavigationModulesPage.studentInformationModule.click();
    }

    @When("user selects Student categories")
    public void user_selects_Student_categories() {
        addDeleteStudentCategoriesPage.studentCategories.click();
    }

    @Then("user is directed to Category page with the text {string}")
    public void admin_is_directed_to_Category_page_with_the_text(String expectedCategoryPageText) {
        String actualCategoryPageText = addDeleteStudentCategoriesPage.createCategoryText.getText();
        CommonUtils.assertEquals(expectedCategoryPageText, actualCategoryPageText);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }

    @When("user enters Category {string}")
    public void admin_enters_Category(String categoryName) {
        addDeleteStudentCategoriesPage.categoryText.sendKeys(categoryName);
    }

    @When("user clicks on th Category Save button")
    public void admin_clicks_on_th_Category_Save_button() {
        addDeleteStudentCategoriesPage.categorySaveButton.click();
    }

    @Then("Category is succesfully saved and conformation message displays {string}")
    public void category_is_succesfully_saved_and_conformation_message_displays(
            String expectedCategorySaveSuccessfullyText) {
        String actualCategorySaveSuccessfullyText = addDeleteStudentCategoriesPage.categorySaveButton.getText();
        CommonUtils.assertEquals(expectedCategorySaveSuccessfullyText, actualCategorySaveSuccessfullyText);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
        CommonUtils.sleep(1000);
    }

    @Then("user clicks on the Category {string} Delete button")
    public void user_clicks_on_the_Category_Delete_button(String categoryName) {
        AddDeleteStudentCategoriesPage.categoryDeleteLocator(categoryName).click();
    }

    @Then("Category is deleted")
    public void category_is_deleted() {
        CommonUtils.driver.switchTo().alert().accept();
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
        CommonUtils.sleep(1000);
     }
    }