package com.chroma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.chroma.web.WebDriverUtils;

public class AddDeleteClassesPage {

    // CLASS SUB MODULE LINK //
    @FindBy(xpath = "//a[normalize-space()='Class']")
    public WebElement ClassSubModuleLink;

    @FindBy(xpath = "//input[@id='class']")
    public WebElement ClassTextBox;

    @FindBy(xpath = "//input[@value='300']")
    public WebElement SelectAPITesting;

    @FindBy(xpath = "//input[@value='307']")
    public WebElement SelectLinuxFundementals;

    @FindBy(xpath = "//button[@type='submit'][normalize-space()='Save']")
    public WebElement SaveButton;

    @FindBy(xpath = "//input[@placeholder='Search...']")
    public WebElement SearchClass;

    @FindBy(xpath = "//tbody//a[2]")
    public WebElement deleteClassButton;

    public AddDeleteClassesPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

}
