package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class SectionsAndClassesPage {

    /* FIRST CLASS */
    @FindBy(xpath = "//td[normalize-space()='Cyber Security']")
    public WebElement CyberSecurityClass;

    /* SECTION IN FIRST CLASS */
    @FindBy(xpath = "//div[contains(text(),'Penetration Testing/Ethical Hacking')]")
    public WebElement penetrationTestingSection;

    /* SECTION IN FIRST CLASS */
    @FindBy(xpath = "//div[contains(text(),'Networking Fundamentals')]")
    public WebElement networkingFundamentalsSection;

    /* SECTION IN FIRST CLASS */
    @FindBy(xpath = "//div[contains(text(),'Linux Fundamentals')]")
    public WebElement linuxFundamentalsSection;

    /* SECTION IN FIRST CLASS */
    @FindBy(xpath = "//div[contains(text(),'CIA Triad')]")
    public WebElement ciaTriadSection;

    /* SECOND CLASS */
    @FindBy(xpath = "//td[normalize-space()='SDET']")
    public WebElement sdetModuleSection;

    /* SECTION IN SECOND CLASS */
    @FindBy(xpath = "//div[contains(text(),'Database Testing')]")
    public WebElement databaseTestingSection;

    /* SECTION IN SECOND CLASS */
    @FindBy(xpath = "//div[contains(text(),'Testing Fundamentals')]")
    public WebElement testingFundamentalsSection;

    /* SECTION IN SECOND CLASS */
    @FindBy(xpath = "//div[contains(text(),'SDLC Methodologies')]")
    public WebElement sdlcMethodologiesSection;

    /* SECTION IN SECOND CLASS */
    @FindBy(xpath = "//div[contains(text(),'Selenium Test Automation')]")
    public WebElement seleniumTestAutomationSection;

    /* SECTION IN SECOND CLASS */
    @FindBy(xpath = "//div[contains(text(),'Cucumber Fundamentals')]")
    public WebElement cucumberFundamentalsSection;

    /* SECTION IN SECOND CLASS */
    @FindBy(xpath = "//div[contains(text(),'API Testing')]")
    public WebElement apiTestinSection;

    /* SECTION IN SECOND CLASS */
    @FindBy(xpath = "//div[contains(text(),'Git/GitHub')]")
    public WebElement githubSection;

    /* SECTION IN SECOND CLASS */
    @FindBy(xpath = "//div[contains(text(),'Java 11 for Cool People')]")
    public WebElement javaForCoolPeopleSection;

    /* SECTION IN SECOND CLASS */
    @FindBy(xpath = "//div[contains(text(),'Mobile Test Automation')]")
    public WebElement mobileTestAutomationSection;
    
    /* SECTION IN SECOND CLASS */
    @FindBy(xpath = "//div[contains(text(),'Accessibility Testing')]")
    public WebElement accessibilityTestingSection;

    public SectionsAndClassesPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
