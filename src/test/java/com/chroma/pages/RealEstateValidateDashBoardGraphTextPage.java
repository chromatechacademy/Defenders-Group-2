package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class RealEstateValidateDashBoardGraphTextPage {

    /*DASHBOARD TEXT */
    @FindBy(xpath = "(//*[contains(text(),'dashboard')])[2]")
    public WebElement dashBoardText;

    /*RESERVED BY AGENT TEXT */
    @FindBy(xpath = "//h5[contains(text(),'Reserved')]")
    public WebElement reservedByAgentText;

    /*PROPERTIES OVERVIEW TEXT */
    @FindBy(xpath = "//h5[contains(text(),'Properties')]")
    public WebElement propertiesOverviewText;

    /*OVERVIEW TEXT */
    @FindBy(xpath = "//a[contains(text(),'Overview')]")
    public WebElement overviewText;
     
    /*AGENTS GRAPH TEXT */
    @FindBy(xpath = "//a[contains(text(),'Agents Graph')]")
    public WebElement agentsGraphText; 

    public RealEstateValidateDashBoardGraphTextPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
