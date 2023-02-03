package com.chroma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.chroma.web.WebDriverUtils;

public class DashboardModulesPage {

    @FindBy(xpath = "//span[contains(text(),'Student Information')]")
        public WebElement studentInformationModule;

        @FindBy(xpath = "//span[contains(text(),'Fees Collection')]")
        public WebElement feesCollectionModule;

        @FindBy(xpath = "//span[contains(text(),'Income')]")
        public WebElement incomeModule;

        @FindBy(xpath = "//span[contains(text(),'Expenses')]")
        public WebElement expensesModule;

        @FindBy(xpath = "//span[contains(text(),'Academics')]")
        public WebElement academicsModule;

        @FindBy(xpath = "//span[contains(text(),'Human Resource')]")
        public WebElement humanResourceModule;

        @FindBy(xpath = "//span[contains(text(),'Homework')]")
        public WebElement homeworkModule;

        @FindBy(xpath = "//span[contains(text(),'Reports')]")
        public WebElement reportsModule;

        public static WebElement sampleDynamicMethod(String text) {

            return WebDriverUtils.driver.findElement(By.xpath("//*[contains(text(),'" + text + "')]"));
        }
    
        public DashboardModulesPage() {
            PageFactory.initElements(WebDriverUtils.driver, this);
        }
    
}
