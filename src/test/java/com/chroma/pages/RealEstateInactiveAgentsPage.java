package com.chroma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class RealEstateInactiveAgentsPage {

    public static WebElement agentMenuButton(String email) {

        return WebDriverUtils.driver
                .findElement(
                        By.xpath("//*[contains(text(),'" + email + "')]//parent::tr/td[4]/div/button"));
    }

    /* DELETE BUTTON LOCATOR */
    public static WebElement agentDeleteButton(String email) {

        return WebDriverUtils.driver
                .findElement(
                        By.xpath("//*[contains(text(),'" + email + "')]//parent::tr/td[4]/div/ul/li[3]/button"));
    }

    @FindBy(xpath = "//*[contains(text(),'fast@gmail.com')]//parent::tr/td[4]/div/button")
    public WebElement menuButton;

    /* OKAY BUTTON */
    @FindBy(xpath = "//button[normalize-space()='OK']")
    public WebElement okayButton;

    /* ASSERT ELEMENT */
    @FindBy(xpath = "//div[@id='swal2-html-container']")
    public WebElement assertElement;

    public RealEstateInactiveAgentsPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
