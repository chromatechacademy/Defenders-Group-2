package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.CommonUtils;
import com.chroma.web.WebDriverUtils;

public class InvaildLoginStepImpl extends PageInitializer{

    /* User On CTSMS Login Page */
    public static void userOnLoggingPage(String url) {
        WebDriverUtils.driver.get(url);
        CommonUtils.nonMobileScreenshots();
    }
    
    /* User Logs In With Invaild Credentials */
    public static void invaildCredentials(String userName, String password) {
        loginPage.userNameTextBox.sendKeys(userName);
        loginPage.passwordTextBox.sendKeys(password);
        loginPage.signButton.click();
        CommonUtils.nonMobileScreenshots();
    }

    /* User Sees Invaild Message */
    public static void invaildLoginMessage(String invalidUsernameOrPassword) {
        String actualInvalidMessage = loginPage.invaildLoginMessage.getText();
        CommonUtils.assertEquals(invalidUsernameOrPassword, actualInvalidMessage);
        CommonUtils.nonMobileScreenshots();
    } 
}
