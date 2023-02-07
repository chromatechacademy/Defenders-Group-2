package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class RealEstateNewAgentWindowPage {

    /* FIRST NAME LOCATOR */
    @FindBy(xpath = "//input[@name='fname']")
    public WebElement firstNameTextBox;

    /* LAST NAME LOCATOR */
    @FindBy(xpath = "//input[@name='lname']")
    public WebElement lastNameTextBox;

    /* EMAIL LOCATOR */
    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailTextBox;

    /* PHONE NUMBER LOCATOR */
    @FindBy(xpath = "//input[@name='phone']")
    public WebElement contactNumberTextBox;

    /* PASSWORD LOCATOR */
    @FindBy(xpath = "//input[@name='pass']")
    public WebElement passwordTextBox;

    /* RETYPE PASSWORD LOCATOR */
    @FindBy(xpath = "//input[@name='cpass']")
    public WebElement retypePasswordTextBox;

    /* SAVE BUTTON */
    @FindBy(xpath = "//button[@id='addagentbutton']")
    public WebElement saveButton;

    /* BACK BUTTON */
    @FindBy(xpath = "//button[normalize-space()='Back']")
    public WebElement backButton;

    public RealEstateNewAgentWindowPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
