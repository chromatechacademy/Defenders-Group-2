package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.CommonUtils;
import com.chroma.web.WebDriverUtils;

public class LoginStepImpl extends PageInitializer {

    /* Admin Is On The Login Page */
    public static void adminOnLoginPage(String url) {
        WebDriverUtils.driver.get(url);
        CommonUtils.nonMobileScreenshots();
    }

    /* Admin Is Logging In */
    public static void adminIsLoggingIn(String login, String password) {
        loginPage.userNameTextBox.sendKeys(login);
        loginPage.passwordTextBox.sendKeys(password);
        CommonUtils.nonMobileScreenshots();
        loginPage.signButton.click();
    }

    /* Admin Is Logged In  */
    public static void adminIsLoggedIn(String url) {
        String actualHomePageURL = WebDriverUtils.driver.getCurrentUrl();
        CommonUtils.assertEquals(url, actualHomePageURL);
        CommonUtils.nonMobileScreenshots();
    }
}
