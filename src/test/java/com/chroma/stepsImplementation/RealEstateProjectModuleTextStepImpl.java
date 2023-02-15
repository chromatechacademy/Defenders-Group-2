package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.CommonUtils;

public class RealEstateProjectModuleTextStepImpl extends PageInitializer{
    
    /* Admin Navigates To Project Page */
    public static void adminNavigatesToProjectPage(String projects) {
        realEstateDashboardPage.projectsTab.click();
        CommonUtils.nonMobileScreenshots();
    }

    /* Admin Sees The Following Text Module */
    public static void adminSeesTheFollowingTextModule(String addNewProject, String projects, String active,
            String archived) {
                String actualAddNewProjectModule = realEstateProjectsPage.addNewProjectModule.getText();
                CommonUtils.assertEquals(addNewProject, actualAddNewProjectModule);
                String actualProjectsModule = realEstateProjectsPage.projectsModule.getText();
                CommonUtils.assertEquals(projects, actualProjectsModule);
                String actualActiveModule = realEstateProjectsPage.activeModule.getText();
                CommonUtils.assertEquals(active, actualActiveModule);
                String actualArchivedModule = realEstateProjectsPage.archivedModule.getText();
                CommonUtils.assertEquals(archived, actualArchivedModule);
                CommonUtils.nonMobileScreenshots();
    }
}
