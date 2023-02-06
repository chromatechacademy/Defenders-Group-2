package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeworkModulePage {
    /*ADD HOMEWORK SUBMODULE */
    @FindBy(xpath = "(//a[contains(text(),'Homework')])[1]")
    public WebElement addHomeworkSubModule;
    
}
