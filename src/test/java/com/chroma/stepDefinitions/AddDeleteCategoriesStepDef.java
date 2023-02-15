package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.stepsImplementation.AddDeleteCategoriesStepImpl;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddDeleteCategoriesStepDef extends PageInitializer {

    @When("user selects Student categories")
    public void user_selects_Student_categories() {
        AddDeleteCategoriesStepImpl.adminSelectsStudentCategories();
    }

    @Then("user is directed to Category page with the text {string}")
    public void admin_is_directed_to_Category_page_with_the_text(String expectedCategoryPageText) {
        AddDeleteCategoriesStepImpl.adminDirectedToCategoryPage(expectedCategoryPageText);
    }

    @When("user enters Category {string}")
    public void admin_enters_Category(String categoryName) {
        AddDeleteCategoriesStepImpl.adminEntersCategory(categoryName);
    }

    @When("user clicks on th Category Save button")
    public void admin_clicks_on_th_Category_Save_button() {
        AddDeleteCategoriesStepImpl.adminClicksCategorySaveButton();
    }

    @Then("Category is succesfully saved and conformation message displays {string}")
    public void category_is_succesfully_saved_and_conformation_message_displays(
            String expectedCategorySaveSuccessfullyText) {
        AddDeleteCategoriesStepImpl.categoryConformationMessage(expectedCategorySaveSuccessfullyText);
    }

    @Then("user clicks on the Category {string} Delete button")
    public void user_clicks_on_the_Category_Delete_button(String categoryName) {
        AddDeleteCategoriesStepImpl.adminClicksCategoryDeleteButton(categoryName);
    }
    
    @Then("Category is deleted")
    public void category_is_deleted() {
        AddDeleteCategoriesStepImpl.categoryIsDeleted();
     }
 }