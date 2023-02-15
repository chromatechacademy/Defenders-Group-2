package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.CommonUtils;

public class CTSMSExpensesSubModuleStepImpl extends PageInitializer{

    /* User Navigates To Expenses Module */
    public static void userNavigatesToExpensesModule() {
        academyDashBoardPage.expensesModule.click();
        CommonUtils.nonMobileScreenshots();
    }

    /* User sees Expenses Sub Module */
    public static void expensesSubModule(String addExpenseSubModule, String searchExpenseSubModule, String expenseHeadSubModule) {
       String actualAddExpenseSubModule = academyDashBoardPage.addExpenseSubModule.getText();
       CommonUtils.assertEquals(addExpenseSubModule, actualAddExpenseSubModule);
       String actualSearchExpenseSubModule = academyDashBoardPage.searchExpenseSubModule.getText();
       CommonUtils.assertEquals(searchExpenseSubModule, actualSearchExpenseSubModule);
       String actualExpenseHeadSubModule = academyDashBoardPage.expenseHeadSubModule.getText();
       CommonUtils.assertEquals(expenseHeadSubModule, actualExpenseHeadSubModule);
       CommonUtils.nonMobileScreenshots();
    }
}
