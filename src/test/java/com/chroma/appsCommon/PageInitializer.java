package com.chroma.appsCommon;

import com.chroma.pages.AcademyDashBoardPage;
import com.chroma.pages.AddDeleteClassesPage;
import com.chroma.pages.AddDeleteStudentCategoriesPage;
import com.chroma.pages.CTSMSNavigationModulesPage;
import com.chroma.pages.CTSMSStudentAdmissionPage;
import com.chroma.pages.DashboardPage;
import com.chroma.pages.FeesCollectionModulePage;
import com.chroma.pages.HomeworkModulePage;
import com.chroma.pages.IncomeModulePage;
import com.chroma.pages.LoginPage;
import com.chroma.pages.RealEstateActiveAgentsPage;
import com.chroma.pages.RealEstateAgentPage;
import com.chroma.pages.RealEstateAgentsPage;
import com.chroma.pages.RealEstateDashboardPage;
import com.chroma.pages.RealEstateInactiveAgentsPage;
import com.chroma.pages.RealEstateLoginPage;
import com.chroma.pages.RealEstateNewAgentWindowPage;
import com.chroma.pages.RealEstateSoldByReservedByPage;
import com.chroma.pages.RealEstateValidateDashBoardGraphTextPage;
import com.chroma.pages.SamplePage;
import com.chroma.pages.StudentInformationPage;
import com.chroma.pages.SectionsAndClassesPage;
import com.chroma.pages.SectionsPage;
import com.chroma.pages.StudentDetailsPage;
import com.chroma.web.WebDriverUtils;

public class PageInitializer extends WebDriverUtils {

    // Sample of instantiating an instance
    public static SamplePage samplePage;
    public static AcademyDashBoardPage academyDashBoardPage;
    public static DashboardPage dashboardPage;
    public static LoginPage loginPage;
    public static RealEstateLoginPage realEstateLoginPage;
    public static RealEstateAgentsPage realEstateAgentsPage;
    public static RealEstateNewAgentWindowPage realEstateNewAgentWindowPage;
    public static RealEstateActiveAgentsPage realEstateActiveAgentsPage;
    public static RealEstateInactiveAgentsPage realEstateInactiveAgentsPage;
    public static CTSMSNavigationModulesPage cTSMSNavigationModulesPage;
    public static CTSMSStudentAdmissionPage cTSMSStudentAdmissionPage;
    public static RealEstateDashboardPage realEstateDashboardPage;
    public static StudentInformationPage studentInformationPage;
    public static HomeworkModulePage homeworkModulePage;
    public static IncomeModulePage incomeModulePage;
    public static AddDeleteClassesPage addDeleteClassesPage;
    public static AddDeleteStudentCategoriesPage addDeleteStudentCategoriesPage;
    public static RealEstateAgentPage realEstateAgentPage;
    public static SectionsPage sectionsPage;
    public static SectionsAndClassesPage sectionsAndClassesPage;
    public static StudentDetailsPage studentDetailsPage;
    public static RealEstateSoldByReservedByPage realEstateSoldByReservedByPage;
    public static FeesCollectionModulePage feesCollectionModulePage;
    public static RealEstateValidateDashBoardGraphTextPage realEstateValidateDashBoardGraphTextPage;


    public void initializeAllPages() {

        samplePage = new SamplePage();
        academyDashBoardPage = new AcademyDashBoardPage();
        dashboardPage = new DashboardPage();
        loginPage = new LoginPage();
        realEstateLoginPage = new RealEstateLoginPage();
        realEstateDashboardPage = new RealEstateDashboardPage();
        realEstateAgentsPage = new RealEstateAgentsPage();
        realEstateNewAgentWindowPage = new RealEstateNewAgentWindowPage();
        realEstateActiveAgentsPage = new RealEstateActiveAgentsPage();
        realEstateInactiveAgentsPage = new RealEstateInactiveAgentsPage();
        cTSMSNavigationModulesPage = new CTSMSNavigationModulesPage();
        cTSMSStudentAdmissionPage = new CTSMSStudentAdmissionPage();
        realEstateDashboardPage = new RealEstateDashboardPage();
        studentInformationPage = new StudentInformationPage();
        homeworkModulePage = new HomeworkModulePage();
        addDeleteStudentCategoriesPage = new AddDeleteStudentCategoriesPage();
        realEstateAgentPage = new RealEstateAgentPage();
        incomeModulePage = new IncomeModulePage();
        addDeleteStudentCategoriesPage = new AddDeleteStudentCategoriesPage();
        realEstateAgentPage = new RealEstateAgentPage();
        addDeleteClassesPage = new AddDeleteClassesPage();
        sectionsPage = new SectionsPage();
        sectionsAndClassesPage = new SectionsAndClassesPage();
        studentDetailsPage = new StudentDetailsPage();
        realEstateSoldByReservedByPage = new RealEstateSoldByReservedByPage();
        feesCollectionModulePage = new FeesCollectionModulePage();
        realEstateValidateDashBoardGraphTextPage = new RealEstateValidateDashBoardGraphTextPage();
    }
}