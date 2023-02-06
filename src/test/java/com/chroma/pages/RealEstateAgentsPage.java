package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class RealEstateAgentsPage {
    /* Members List Module*/
    @FindBy(xpath = "//button[@class='sidebar-item']")
    public WebElement membersListModule;

    /* Active Module */
    @FindBy(xpath = "//a[normalize-space()='Active']")
    public WebElement activeModule;

    /* Inactive Module */
    @FindBy(xpath = "//a[normalize-space()='Inactive']")
    public WebElement inactiveModule;

    /* All Agents Module */
    @FindBy(xpath = "//a[normalize-space()='All Agents']")
    public WebElement allAgentModule;

    /* Add Now Module */
    @FindBy(xpath = "//button[@class='btn btn-primary d-block w-100']")
    public WebElement addNowModule;

    /* Name Text */
    @FindBy(xpath = "//th[normalize-space()='Name']")
    public WebElement nameText;

    /* Mail Text */
    @FindBy(xpath = "//th[normalize-space()='Mail']")
    public WebElement mailText;

    /* Contact Number Text */
    @FindBy(xpath = "//th[normalize-space()='Contact Number']")
    public WebElement contactNumberText;

    /* Actions Text */
    @FindBy(xpath = "//th[@class='text-end']")
    public WebElement actionsText;

    public RealEstateAgentsPage(){
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
