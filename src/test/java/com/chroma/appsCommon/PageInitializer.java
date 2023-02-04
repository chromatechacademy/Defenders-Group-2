package com.chroma.appsCommon;

import com.chroma.pages.CTSMSNavigationModulesPage;
import com.chroma.web.WebDriverUtils;

public class PageInitializer extends WebDriverUtils {

    public static CTSMSNavigationModulesPage cTSMSNavigationModulesPage;

    public void initializeAllPages() {

        cTSMSNavigationModulesPage = new CTSMSNavigationModulesPage();

    }

}
