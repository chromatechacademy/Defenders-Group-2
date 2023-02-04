package com.chroma.appsCommon;
<<<<<<< HEAD

import com.chroma.pages.CTSMSNavigationModulesPage;
=======
import com.chroma.pages.AcademyDashBoardPage;
import com.chroma.pages.DashboardPage;
import com.chroma.pages.LoginPage;
import com.chroma.pages.RealEstateLoginPage;
import com.chroma.pages.SamplePage;
>>>>>>> f9d8bed67a9dc7b1abe40b7995e10d8f8443ae99
import com.chroma.web.WebDriverUtils;

public class PageInitializer extends WebDriverUtils {

<<<<<<< HEAD
    public static CTSMSNavigationModulesPage cTSMSNavigationModulesPage;

    public void initializeAllPages() {

        cTSMSNavigationModulesPage = new CTSMSNavigationModulesPage();
=======
    // Sample of instantiating an instance

    public static SamplePage samplePage;
    public static AcademyDashBoardPage academyDashBoardPage;
    public static DashboardPage dashboardPage;
    public static LoginPage loginPage;
    public static RealEstateLoginPage realEstateLoginPage;

    public void initializeAllPages() {

        samplePage = new SamplePage();
        academyDashBoardPage = new AcademyDashBoardPage();
        dashboardPage = new DashboardPage();
        loginPage = new LoginPage();
        realEstateLoginPage = new RealEstateLoginPage();
>>>>>>> f9d8bed67a9dc7b1abe40b7995e10d8f8443ae99

    }

}
