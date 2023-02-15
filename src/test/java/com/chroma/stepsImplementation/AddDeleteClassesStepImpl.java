package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.CommonUtils;

public class AddDeleteClassesStepImpl extends PageInitializer{

    /* Acadmic Module Displayed */
    public static void acadamicModuledisplayed() {
        cTSMSNavigationModulesPage.academicsModule.click();
        CommonUtils.nonMobileScreenshots();
    }

    /* User Able To Click Class Sub Module */
    public static void userClicksClassSubModule() {
        addDeleteClassesPage.ClassSubModuleLink.click();
        CommonUtils.nonMobileScreenshots();
    }
    
    /* User Able To Add Class Name */
    public static void userAbleToAddClassName(String newClassName) {
        addDeleteClassesPage.ClassTextBox.sendKeys(newClassName);
        CommonUtils.sleep(500);
        CommonUtils.nonMobileScreenshots();
    }
    
    /* User Able To Select Section */
    public static void userSelectSection() {
        addDeleteClassesPage.SelectAPITesting.click();
        addDeleteClassesPage.SelectLinuxFundementals.click();
        CommonUtils.sleep(500);
        CommonUtils.nonMobileScreenshots();
    }
    
    /* User Able To Save */
    public static void userAbleToSave() {
        addDeleteClassesPage.SaveButton.click();
        CommonUtils.nonMobileScreenshots();
    }
    
    /* User Able To Search Class That Already Saved */
    public static void userSearchSavedClass(String searchNewClass) {
        addDeleteClassesPage.SearchClass.sendKeys(searchNewClass);
        CommonUtils.sleep(500);
        CommonUtils.nonMobileScreenshots();
    }
   
    /* User Able To Delete Class */
    public static void userDeleteClass() {
        addDeleteClassesPage.deleteClassButton.click();
        CommonUtils.nonMobileAutoAcceptAlert();
        CommonUtils.nonMobileScreenshots();
        CommonUtils.sleep(3000);
    }
}
