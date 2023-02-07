package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class RealEstateAgentsPage {

    /* ADD NOW LOCATOR */
    @FindBy(xpath = "//button[normalize-space()='Add Now']")
    public WebElement addNowButton;

    public RealEstateAgentsPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}