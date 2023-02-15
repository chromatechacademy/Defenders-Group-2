package com.chroma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class CTSMSNavigationModulesPage {
    
     /* Hamburger Menu */
     @FindBy(xpath = "//a[@role='button']")
     public WebElement hamburgerMenu;

    /* Student Info Module */
    @FindBy(xpath = "//span[contains(text(),'Student Information')]")
    public WebElement studentInformationModule;

    /* Fees Collection Module */
    @FindBy(xpath = "//span[contains(text(),'Fees Collection')]")
    public WebElement feesCollectionModule;

    /* Income Module */
    @FindBy(xpath = "//span[contains(text(),'Income')]")
    public WebElement incomeModule;

    /* Expenses Module */
    @FindBy(xpath = "//span[contains(text(),'Expenses')]")
    public WebElement expensesModule;

    /* Academics Module */
    @FindBy(xpath = "//span[contains(text(),'Academics')]")
    public WebElement academicsModule;

    /* Human Resource Module */
    @FindBy(xpath = "//span[contains(text(),'Human Resource')]")
    public WebElement humanResourceModule;

    @FindBy(xpath = "//span[contains(text(),'Homework')]")
    public WebElement homeworkModule;

    /* Reports Module */
    @FindBy(xpath = "//span[contains(text(),'Reports')]")
    public WebElement reportsModule;

    public static WebElement sampleDynamicMethod(String text) {

        return WebDriverUtils.driver.findElement(By.xpath("//*[contains(text(),'" + text + "')]"));
    }

    public CTSMSNavigationModulesPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
