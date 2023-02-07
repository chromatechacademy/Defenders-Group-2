package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.chroma.web.WebDriverUtils;

public class HomeworkModulePage {
    /*ADD HOMEWORK SUBMODULE */
    @FindBy(xpath = "(//a[contains(text(),'Homework')])[1]")
    public WebElement addHomeworkSubModule;

    public HomeworkModulePage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
    
}
