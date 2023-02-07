package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class LoginPage {
    
    /* USERNAME TEXTBOX */
    @FindBy(xpath = "//input[@id='form-username']")
    public WebElement userNameTextBox;

    /* PASSWORD TEXTBOX */
    @FindBy(xpath = "//input[@id='form-password']")
    public WebElement passwordTextBox;

    /* SIGH IN BUTTON */
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signButton;

    /* INVAILD MESSAGE */
    @FindBy(xpath = "//div[normalize-space()='Invalid Username or Password']")
    public WebElement invaildLoginMessage;

    public LoginPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
