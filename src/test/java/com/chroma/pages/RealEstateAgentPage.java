package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class RealEstateAgentPage {

    /* Logout Text Box */
    @FindBy(xpath = "//span[normalize-space()='account_box']")
    public WebElement adminLogOutBox;
    
    /* Logout Button */
    @FindBy(xpath = "//a[normalize-space()='Logout']")
    public WebElement adminLogOutButton;

    public RealEstateAgentPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
