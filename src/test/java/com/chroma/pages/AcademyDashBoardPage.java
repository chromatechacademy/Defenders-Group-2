package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.chroma.web.WebDriverUtils;

public class AcademyDashBoardPage {

    /* Human Resource Module */
    @FindBy(xpath = "//span[normalize-space()='Human Resource']")
    public WebElement humanResourceModule;

    @FindBy(xpath = "")
    public WebElement staffDirectory;


    public AcademyDashBoardPage(){
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
