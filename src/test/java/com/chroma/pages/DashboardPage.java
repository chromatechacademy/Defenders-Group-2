package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class DashboardPage {
    
    /* ACADEMICS MODULE */
    @FindBy(xpath = "//span[contains(text(),'Academics')]")
    public WebElement academicsModule;

    /* SECTIONS SUBMODULE */
    @FindBy(xpath = "//a[normalize-space()='Sections']")
    public WebElement sectionsSubModule;

    /* INCOME MODULE */
    @FindBy(xpath = "//span[normalize-space()='Income']")
    public WebElement IncomeModule; 
    
    /* CLASS SUBMODULE */
    @FindBy(xpath = "//a[normalize-space()='Class']")
    public WebElement classSubModule;

    /* STUDENT DETAILS SUBMODULE */
    @FindBy(xpath = "//ul[@class='treeview-menu']//a[normalize-space()='Student Details']")
    public WebElement studentDetailsSubModule;

    public DashboardPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}