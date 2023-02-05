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

    /* Forgot Password Button */
    @FindBy(xpath = "//a[normalize-space()='Forget Password?']")
    public WebElement forgotPasswordButton;

    public RealEstateLoginPage(){
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
