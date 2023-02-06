package com.chroma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.CommonUtils;
import com.chroma.web.WebDriverUtils;


public class AddDeleteStudentCategoriesPage {

    @FindBy(xpath = "//*[contains(text(),'Categories')]") 
    public WebElement studentCategories;

    @FindBy(xpath = "//h3[@class='box-title']")
    public WebElement createCategoryText;

    @FindBy(xpath = "//input[@id='category']") 
    public WebElement categoryText;

    @FindBy(xpath = "//button[@type='submit'][normalize-space()='Save']") 
    public WebElement categorySaveButton;

    @FindBy(xpath = "//div[@class='alert alert-success text-left']") 
    public WebElement categorySavedSuccesfullyText;

    public static WebElement categoryDeleteLocator(String categoryNameText) { 
        return WebDriverUtils.driver.findElement(By.xpath("//td[normalize-space()='" + categoryNameText 
        + "']//parent::td/parent::tr//child::td[3]//child::a[2]/i")); 
    }

    public AddDeleteStudentCategoriesPage() {
        PageFactory.initElements(CommonUtils.driver, this); 
    }
}

    

