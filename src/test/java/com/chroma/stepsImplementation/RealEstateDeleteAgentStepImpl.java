package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.RealEstateActiveAgentsPage;
import com.chroma.pages.RealEstateInactiveAgentsPage;
import com.chroma.web.CommonUtils;
import com.chroma.web.JavascriptUtils;

public class RealEstateDeleteAgentStepImpl extends PageInitializer {

    /* User Navigates To Agent Class */
    public static void userNavigatesToAgentClass() {
        realEstateDashboardPage.agentsClass.click();
        CommonUtils.nonMobileScreenshots();
    }

    /* User Clicks Add Now Button */
    public static void userClicksAddNowButton() {
        realEstateAgentsPage.addNowButton.click();
        CommonUtils.nonMobileScreenshots();
    }

    /*
     * Admin Is Able To Create a New Agnet By Adding First Name, Last Name, Email,
     * Contact Number, And Password
     */
    public static void adminCreatesNewAgentByFillingRequirements(String fname, String lname, String email,
            String number, String password) {
        realEstateNewAgentWindowPage.firstNameTextBox.clear();
        realEstateNewAgentWindowPage.firstNameTextBox.sendKeys(fname);
        realEstateNewAgentWindowPage.lastNameTextBox.clear();
        realEstateNewAgentWindowPage.lastNameTextBox.sendKeys(lname);
        realEstateNewAgentWindowPage.emailTextBox.clear();
        realEstateNewAgentWindowPage.emailTextBox.sendKeys(email);
        realEstateNewAgentWindowPage.contactNumberTextBox.clear();
        realEstateNewAgentWindowPage.contactNumberTextBox.sendKeys(number);
        realEstateNewAgentWindowPage.passwordTextBox.clear();
        realEstateNewAgentWindowPage.passwordTextBox.sendKeys(password);
        realEstateNewAgentWindowPage.retypePasswordTextBox.clear();
        realEstateNewAgentWindowPage.retypePasswordTextBox.sendKeys(password);
        realEstateNewAgentWindowPage.saveButton.click();
        CommonUtils.nonMobileScreenshots();
        CommonUtils.sleep(3000);
        realEstateNewAgentWindowPage.backButton.click();
    }

    /*
     * Admin Is Able To Verify That The Agent Is Listed As Active With Exact First
     * Name, Last Name, Email, And Contact Number
     */
    public static void adminVerifyAgentIsListedActive(String fname, String lname, String email, String contactNumber) {
        realEstateDashboardPage.activeList.click();
        CommonUtils.sleep(2000);
        JavascriptUtils.scrollIntoView(RealEstateActiveAgentsPage.emailLocator(email));
        String actualEmail = RealEstateActiveAgentsPage.emailLocator(email).getText();
        CommonUtils.assertEquals(email, actualEmail);
        String actualContactNumber = RealEstateActiveAgentsPage.contactNumberLocator(contactNumber).getText();
        CommonUtils.assertEquals(contactNumber, actualContactNumber);
        String fullName = fname + " " + lname;
        String actualName = RealEstateActiveAgentsPage.nameLocator(actualContactNumber).getText();
        CommonUtils.assertEquals(fullName, actualName);
        CommonUtils.nonMobileScreenshots();
    }

    /*
     * Admin Navigates To Active Members List And Delete Agent From Active Members
     * Listed With Current Email
     */
    public static void navigatesToActiveMembersListAndDeleteAgentFromActiveMembersListWithCurrentEmail(String email) {
        realEstateDashboardPage.activeList.click();
        JavascriptUtils.scrollIntoView(RealEstateActiveAgentsPage.accountMenu(email));
        RealEstateActiveAgentsPage.accountMenu(email).click();
        RealEstateActiveAgentsPage.deleteButton(email).click();
        CommonUtils.nonMobileScreenshots();
        CommonUtils.sleep(3000);
    }

    /*
     * Admin Navigates To Inactive Members List To Delete User Permanently With
     * Current Email and Verify with Message
     */
    public static void navigatesToInactiveMembersListToDeletePermanentlyWithCurrentEmailAndVerifyMessage(
            String email, String deleteSuccess) {
        realEstateDashboardPage.inactiveList.click();
        JavascriptUtils.scrollIntoView(RealEstateInactiveAgentsPage.agentMenuButton(email));
        RealEstateInactiveAgentsPage.agentMenuButton(email).click();
        CommonUtils.nonMobileScreenshots();
        RealEstateInactiveAgentsPage.agentDeleteButton(email).click();
        String actualDeleteSuccess = realEstateInactiveAgentsPage.assertElement.getText();
        CommonUtils.assertEquals(deleteSuccess, actualDeleteSuccess);
        CommonUtils.nonMobileScreenshots();
        realEstateInactiveAgentsPage.okayButton.click();
    }
}
