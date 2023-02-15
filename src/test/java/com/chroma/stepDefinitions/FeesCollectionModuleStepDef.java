package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.stepsImplementation.FeesCollectionModuleStepImpl;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class FeesCollectionModuleStepDef extends PageInitializer {

    @Given("a user logs in with valid credentials username {string} and password {string}")
    public void a_user_logs_in_with_valid_credentials_username_and_password(String username, String password) {
        FeesCollectionModuleStepImpl.userLogsIn(username, password);
    }

    @Given("navigates to Fees Collection Module")
    public void navigates_to_Fees_Collection_Module() {
        FeesCollectionModuleStepImpl.clickFeesCollectionModule();
    }

    @Then("following submodule displayed {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string},{string}")
    public void following_submodule_displayed(String CollectFees, String serchFeesPayment, String searchDueFees,
            String feesMaster, String feesGroup, String feesType, String feesDiscount, String feesCarryForward,
            String Reminder) {
        FeesCollectionModuleStepImpl.feesCollectionSubModule(CollectFees, serchFeesPayment, searchDueFees, feesMaster,
                feesGroup, feesType, feesDiscount, feesCarryForward, Reminder);
    }
}
