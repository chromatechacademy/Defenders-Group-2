package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FeesCollectionModulePage {

    /*COLLECT FEES SUBMODULE */
    @FindBy(xpath = "(//a[contains(text(),'Fees')])[2]")
    public WebElement collectFeesSubModule;
    /*SEARCH FEES SUBMODULE */
    @FindBy(xpath = "(//a[contains(text(),'Fees')])[3]")
    public WebElement searchFeesPaymentSubModule;
    /*SEARCH DUE FEES SUBMODULE */
    @FindBy(xpath = "(//a[contains(text(),'Fees')])[4]")
    public WebElement serachDueFeesSubModule;
    /*FEES MASTER SUBMODULE */
    @FindBy(xpath = "(//a[contains(text(),'Fees')])[5]")
    public WebElement feesMasterSubModule;
    /*FEES GROUP SUBMODULE */
    @FindBy(xpath = "(//a[contains(text(),'Fees')])[6]")
    public WebElement feesGroupSubModule;
    /*FEES TYPE SUBMODULE */
    @FindBy(xpath = "(//a[contains(text(),'Fees')])[7]")
    public WebElement feesTypeSubModule;
    /*FEES DISCOUNT SUBMODULE */
    @FindBy(xpath = "(//a[contains(text(),'Fees')])[8]")
    public WebElement feesDiscountSubModule;
    /*FEES CARRY FORWARD */
    @FindBy(xpath = "(//a[contains(text(),'Fees')])[9]")
    public WebElement feesCarryForwardSubModule;
    /*FEES REMINDER SUBMODULE */
    @FindBy(xpath = "(//a[contains(text(),'Fees')])[10]")
    public WebElement feesReminderSubModule;
  
}
