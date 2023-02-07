package com.chroma.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class RealEstateDashboardPage {

    /* AGENTS CLASS LOCATOR */
    @FindBy(xpath = "//span[normalize-space()='Agents']")
    public WebElement agentsClass;

    /* ACTIVE AGENT LIST LOCATOR */
    @FindBy(xpath = "//a[normalize-space()='Active']")
    public WebElement activeList;

    /* INACTIVE AGENT LIST LOCATOR */
    @FindBy(xpath = "//a[normalize-space()='Inactive']")
    public WebElement inactiveList;

    public RealEstateDashboardPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
