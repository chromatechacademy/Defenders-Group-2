package com.chroma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class RealEstateActiveAgentsPage {

    /* DELETE BUTTON MENU LOCATOR */
    public static WebElement accountMenu(String email) {
        return WebDriverUtils.driver
                .findElement(
                        By.xpath("//*[contains(text(),'" + email + "')]/following-sibling::td[2]/div/button/span"));
    }

    /* DELETE BUTTON LOCATOR */
    public static WebElement deleteButton(String email) {
        return WebDriverUtils.driver
                .findElement(
                        By.xpath("//*[contains(text(),'" + email + "')]/following-sibling::td[2]/div/ul/li/button"));
    }

    /* EMAIL LOCATOR */
    public static WebElement emailLocator(String email) {
        return WebDriverUtils.driver
                .findElement(
                        By.xpath("//*[contains(text(),'" + email + "')]"));
    }

    /* CONTACT NUMBER LOCATOR */
    public static WebElement contactNumberLocator(String contactNumber) {
        return WebDriverUtils.driver
                .findElement(
                        By.xpath("//*[contains(text(),'" + contactNumber + "')]"));
    }

    /* CONTACT NUMBER LOCATOR */
    public static WebElement nameLocator(String contactNumber) {
        return WebDriverUtils.driver
                .findElement(
                        By.xpath("//*[contains(text(),'" + contactNumber + "')]//parent::tr/td[1]"));
    }

    public RealEstateActiveAgentsPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
