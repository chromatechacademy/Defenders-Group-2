package com.chroma.pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class SectionsPage {

    /* SECTION NAME TEXT BOX */
    @FindBy(xpath = "//input[@id='section']")
    public WebElement sectionNameTextBox;

    /* SAVE BUTTON */
    @FindBy(xpath = "//button[@type='submit'][normalize-space()='Save']")
    public WebElement saveButton;

    /* SAVE MESSAGE */
    @FindBy(xpath = "//div[@class='alert alert-success text-left']")
    public WebElement successfullySavedMessage;

    /* SECTION NAME DELETE BUTTON */
    public static WebElement sectionsNameDeleteButton(String sectionName) {
        return WebDriverUtils.driver
                .findElement(
                        By.xpath("//*[contains(text(),'" + sectionName + "')]//parent::tr/td[2]/a[2]"));
    }

    /* FIND SECTION NAME LOCATOR */
    public static List<WebElement> sectionNameLocator(String sectionName) {
        return WebDriverUtils.driver.findElements(By
                .xpath("//*[contains(text(),'" + sectionName + "')]"));
    }

    public SectionsPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
