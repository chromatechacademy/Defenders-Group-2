package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class RealEstateProjectsPage {
    
    /* Add New Project  */
    @FindBy(xpath = "//a[@class='btn btn-primary btn-lg sidebar-cta']")
    public WebElement addNewProjectModule;

    /* Projects Module */
    @FindBy(xpath = "//button[@class='sidebar-item']")
    public WebElement projectsModule;

    /* Active Module */
    @FindBy(xpath = "//a[normalize-space()='Active']")
    public WebElement activeModule;

    /* Archived Module */
    @FindBy(xpath = "//a[normalize-space()='Archived']")
    public WebElement archivedModule;

    public RealEstateProjectsPage(){
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
