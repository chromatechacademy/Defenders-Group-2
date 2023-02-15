package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.CommonUtils;

public class RealEstateAgentModuleTextStepImpl extends PageInitializer {

    /* Admin Navigates To The Agents Page */
    public static void adminNavigatesToAgentsPage(String agents) {
        realEstateDashboardPage.agentsTab.click();
        CommonUtils.nonMobileScreenshots();
    }

    /* Admin Sees Agnets Page Modules and Text */
    public static void adminSeesAgentsPageModuleAndText(String membersListModule, String activeModule,
            String inactiveModule,
            String allAgentsModule, String addNowModule, String nametext, String mailText, String contactNumberText,
            String actionsText) {
        String actualMembersListModuleText = realEstateAgentsPage.membersListModule.getText();
        CommonUtils.assertEquals(membersListModule, actualMembersListModuleText);
        String actualActiveModuleText = realEstateAgentsPage.activeModule.getText();
        CommonUtils.assertEquals(activeModule, actualActiveModuleText);
        String actualInactiveModuleText = realEstateAgentsPage.inactiveModule.getText();
        CommonUtils.assertEquals(inactiveModule, actualInactiveModuleText);
        String actualAllAgentsModuleText = realEstateAgentsPage.allAgentModule.getText();
        CommonUtils.assertEquals(allAgentsModule, actualAllAgentsModuleText);
        String actualAddNowModuleText = realEstateAgentsPage.addNowModule.getText();
        CommonUtils.assertEquals(addNowModule, actualAddNowModuleText);
        String actualNameText = realEstateAgentsPage.nameText.getText();
        CommonUtils.assertEquals(nametext, actualNameText);
        String actualMailText = realEstateAgentsPage.mailText.getText();
        CommonUtils.assertEquals(mailText, actualMailText);
        String actualContactNumberText = realEstateAgentsPage.contactNumberText.getText();
        CommonUtils.assertEquals(contactNumberText, actualContactNumberText);
        String actualActionsText = realEstateAgentsPage.actionsText.getText();
        CommonUtils.assertEquals(actionsText, actualActionsText);
        CommonUtils.nonMobileScreenshots();
    }
}
