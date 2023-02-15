package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.CommonUtils;
import com.chroma.web.WebDriverUtils;

public class RealEstateLoginStepImpl extends PageInitializer {

    /* Admin Is SuccesFully Logged In On Real Estate Web Page */
    public static void adminSuccesfullyLoggedIn(String url) {
        String actualHomePageURL = WebDriverUtils.driver.getCurrentUrl();
        CommonUtils.assertEquals(actualHomePageURL, url);
        CommonUtils.nonMobileScreenshots();
    }

    /* Admin Logs Out The Admin Site */
    public static void adminLogsOut() {
        realEstateAgentPage.adminLogOutBox.click();
        CommonUtils.waitForVisibility(realEstateAgentPage.adminLogOutButton);
        realEstateAgentPage.adminLogOutButton.click();
        CommonUtils.nonMobileScreenshots();
    }

    /* Admin Is On The Agent Login Page */
    public static void adminOnAgentLoginPage(String url) {
        WebDriverUtils.driver.get(url);
        CommonUtils.nonMobileScreenshots();
    }

    /* Admin IS Seccesfully Logged In On Agent Real Estate Web Page */
    public static void adminOnAgentRealEstateWebPage(String url) {
        String actualRealEstateHomePageURL = WebDriverUtils.driver.getCurrentUrl();
        CommonUtils.assertEquals(actualRealEstateHomePageURL, url);
        CommonUtils.nonMobileScreenshots();
    }
}
