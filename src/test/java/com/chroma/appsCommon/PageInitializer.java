package com.chroma.appsCommon;

import com.chroma.pages.CTSMSNavigationModulesPage;
import com.chroma.pages.CTSMSStudentAdmissionPage;
import com.chroma.pages.AcademyDashBoardPage;
import com.chroma.pages.AddDeleteStudentCategoriesPage;
import com.chroma.pages.DashboardPage;
import com.chroma.pages.LoginPage;
import com.chroma.pages.RealEstateDashboardPage;
import com.chroma.pages.RealEstateLoginPage;
import com.chroma.pages.SamplePage;
import com.chroma.web.WebDriverUtils;

public class PageInitializer extends WebDriverUtils {

    // Sample of instantiating an instance
    public static SamplePage samplePage;
    public static AcademyDashBoardPage academyDashBoardPage;
    public static DashboardPage dashboardPage;
    public static LoginPage loginPage;
    public static RealEstateLoginPage realEstateLoginPage;
    public static CTSMSNavigationModulesPage cTSMSNavigationModulesPage;
    public static CTSMSStudentAdmissionPage cTSMSStudentAdmissionPage;
    public static RealEstateDashboardPage realEstateDashboardPage;
    public static AddDeleteStudentCategoriesPage addDeleteStudentCategoriesPage;

    public void initializeAllPages() {

        samplePage = new SamplePage();
        academyDashBoardPage = new AcademyDashBoardPage();
        dashboardPage = new DashboardPage();
        loginPage = new LoginPage();
        realEstateLoginPage = new RealEstateLoginPage();
        cTSMSNavigationModulesPage = new CTSMSNavigationModulesPage();
        cTSMSStudentAdmissionPage = new CTSMSStudentAdmissionPage();
        realEstateDashboardPage = new RealEstateDashboardPage();
        addDeleteStudentCategoriesPage = new AddDeleteStudentCategoriesPage();
    }
}
