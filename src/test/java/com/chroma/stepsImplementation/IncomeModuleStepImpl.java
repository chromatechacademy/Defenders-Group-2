package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.CommonUtils;

public class IncomeModuleStepImpl extends PageInitializer{

    /* User clicks on Income Module */
    public static void userClicksIncomeModule() {
        dashboardPage.IncomeModule.click();
        CommonUtils.nonMobileScreenshots();
    }
    
    /* User Sees Sub Module */
    public static void incomeSubModules(String AddIncome, String SearchIncome, String IncomeHead){
        CommonUtils.sleep(5000);
        String actualAddIncomeModuleText = incomeModulePage.AddIncomeModule.getText();
        CommonUtils.assertEquals(actualAddIncomeModuleText, AddIncome);
        String actualSearchIncomeModuleText = incomeModulePage.SearchIncomeModule.getText();
        CommonUtils.assertEquals(actualSearchIncomeModuleText, SearchIncome);
        String actuaIncomeHeadModuelText = incomeModulePage.IncomeHeadModule.getText();
        CommonUtils.assertEquals(actuaIncomeHeadModuelText, IncomeHead);
        CommonUtils.nonMobileScreenshots();;
    }
}
