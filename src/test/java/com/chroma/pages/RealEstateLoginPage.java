package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class RealEstateLoginPage {
    /* Email User Text Box */
    @FindBy(xpath = "//input[@placeholder='Email']")
    public WebElement emailUserTextBox;
    /* Password User Text Box */
    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement passwordUserTextBox;
    /* Login Button */
    @FindBy(xpath = "//button[contains(text(),'Login')]")
    public WebElement loginButton;
<<<<<<< HEAD
    /* Forgot Password Button */
    @FindBy(xpath = "//a[normalize-space()='Forget Password?']")
    public WebElement forgotPasswordButton;
=======
>>>>>>> d761ebfe37fdc65ef6cc17c39b2c5fa79e4361d1

    public RealEstateLoginPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
