package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.chroma.web.WebDriverUtils;

public class IncomeModulePage {

    /* COMMON XPATH FOR INCOME MODULE */
    @FindBy(xpath = "/html/body/div[1]/aside/div/section/ul[2]/li")
    public WebElement IncomeModulelinks;

    /* ADD INCOME MODULE */
    @FindBy(xpath = "//a[normalize-space()='Add Income']")
    public WebElement AddIncomeModule;

    /*SEARCH INCOME MODULE */
    @FindBy(xpath = "//a[normalize-space()='Search Income']")
    public WebElement SearchIncomeModule;
    
    /* INCOME HEAD MODULE */
    @FindBy(xpath = "//a[normalize-space()='Income Head']")
    public WebElement IncomeHeadModule;

    public IncomeModulePage(){
        PageFactory.initElements(WebDriverUtils.driver, this);
    } 
}
