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

    /* CLASS SUBMODULE */
    @FindBy(xpath = "//a[normalize-space()='Class']")
    public WebElement classSubModule;

    public DashboardPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
