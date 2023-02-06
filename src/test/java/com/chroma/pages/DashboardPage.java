package com.chroma.pages;
<<<<<<< HEAD

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.chroma.web.WebDriverUtils;

public class DashboardPage {

=======
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class DashboardPage {
>>>>>>> 9b8cc24f2bcf6fb2c8d48c68b72984ede39506ef
    /* ACADEMICS MODULE */
    @FindBy(xpath = "//span[contains(text(),'Academics')]")
    public WebElement academicsModule;

    /* SECTIONS SUBMODULE */
    @FindBy(xpath = "//a[normalize-space()='Sections']")
    public WebElement sectionsSubModule;

<<<<<<< HEAD
   
=======
>>>>>>> 9b8cc24f2bcf6fb2c8d48c68b72984ede39506ef
    public DashboardPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
