package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.stepsImplementation.AddDeleteClassesStepImpl;
import cucumber.api.java.en.Then;

public class AddDeleteClassesStefDef extends PageInitializer {

    @Then("Acadamic Module displayed")
    public void acadamic_Module_displayed() {
        AddDeleteClassesStepImpl.acadamicModuledisplayed();
    }

    @Then("I should able to click Class sub module")
    public void i_should_able_to_click_Class_sub_module() {
        AddDeleteClassesStepImpl.userClicksClassSubModule();
    }

    @Then("I should able to add Class name {string}")
    public void i_should_able_to_add_Class_name(String newClassName) {
        AddDeleteClassesStepImpl.userAbleToAddClassName(newClassName);
    }

    @Then("I shoud able to select section Field")
    public void i_shoud_able_to_select_section_Field() {
        AddDeleteClassesStepImpl.userSelectSection();
    }

    @Then("I should able to save")
    public void i_should_able_to_save() {
        AddDeleteClassesStepImpl.userAbleToSave();
    }

    @Then("I should able to Search Class that alredy saved {string}")
    public void i_should_able_to_Search_Class_that_alredy_saved(String searchNewClass) {
        AddDeleteClassesStepImpl.userSearchSavedClass(searchNewClass);
    }

    @Then("I should able to delete Class")
    public void i_should_able_to_delete_Class() {
        AddDeleteClassesStepImpl.userDeleteClass();
    }
}
