package com.chroma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class StudentDetailsPage {

    /* SEARCH BY KEY WORD TEXT BOX */
    @FindBy(xpath = "//input[@class='form-control']")
    public WebElement searchByKeywordTextBox;

    /* SEARCH BY KEYOWRD BUTTON */
    @FindBy(xpath = "//button[@value='search_full']")
    public WebElement searchByKeywordButton;

    /* EDIT BUTTON LOCATOR */
    public static WebElement editButton(String admissionNumber) {
        return WebDriverUtils.driver
                .findElement(
                        By.xpath("(//*[contains(text(),'" + admissionNumber + "')])[2]//parent::tr/td[11]/a[2]"));
    }

    /* SUCCESS ALERT TEXT */
    @FindBy(xpath = "//div[@student='alert alert-success text-left']")
    public WebElement successAlertMessage;

    public StudentDetailsPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
