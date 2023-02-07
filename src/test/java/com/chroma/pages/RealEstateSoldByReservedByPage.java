package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class RealEstateSoldByReservedByPage {
    /* SOLD BY ME BUTTON */
    @FindBy(xpath = "//p[normalize-space()='Sold By Me']")
    public WebElement soldByMeButton;
    /* CLOSE BUTTON */
    @FindBy(xpath = "//div[@role='dialog']//div//div//div//button[@type='button'][normalize-space()='Close']")
    public WebElement closeButtonSoldBy;
    /* RESERVED BY ME */
    @FindBy(xpath = "//p[normalize-space()='Reserved By Me']")
    public WebElement reservedByMeButton;
    /* CLOSE BUTTON */
    @FindBy(xpath = "//div[@role='dialog']//div//div//div//button[@type='button'][normalize-space()='Close']")
    public WebElement closeButtonReservedBy;
    /* ID TEXT */
    @FindBy(xpath = "//div[@role='dialog']//th[@scope='col'][normalize-space()='ID']")
    public WebElement idText;
    @FindBy(xpath = "//div[@role='dialog']//div//div//div//th[@scope='col'][normalize-space()='ID']")
    public WebElement idText2;
    /* PROJECT TEXT */@FindBy(xpath = "//div[@role='dialog']//th[@scope='col'][normalize-space()='Project']")
    public WebElement projectText;
    @FindBy(xpath = "//div[@role='dialog']//div//div//div//th[@scope='col'][normalize-space()='Project']")
    public WebElement projectText2;
    /* PRICE TEXT */
    @FindBy(xpath = "//div[@role='dialog']//th[@scope='col'][normalize-space()='Price']")
    public WebElement priceText;
    @FindBy(xpath = "//div[@role='dialog']//div//div//div//th[@scope='col'][normalize-space()='Price']")
    public WebElement priceText2;
    /* BEDS TEXT */
    @FindBy(xpath = "//div[@role='dialog']//th[@scope='col'][normalize-space()='Beds']")
    public WebElement bedsText;
    @FindBy(xpath = "//div[@role='dialog']//div//div//div//th[@scope='col'][normalize-space()='Beds']")
    public WebElement bedsText2;
    /* BATHS TEXT */
    @FindBy(xpath = "//div[@role='dialog']//th[@scope='col'][normalize-space()='Baths']")
    public WebElement bathsText;
    @FindBy(xpath = "//div[@role='dialog']//div//div//div//th[@scope='col'][normalize-space()='Baths']")
    public WebElement bathsText2;
    /* CARS TEXT */
    @FindBy(xpath = "//div[@role='dialog']//th[@scope='col'][normalize-space()='Cars']")
    public WebElement carsText;
    @FindBy(xpath = "//div[@role='dialog']//div//div//div//th[@scope='col'][normalize-space()='Cars']")
    public WebElement carsText2;
    /* CAR LOTS TEXT */
    @FindBy(xpath = "//div[@role='dialog']//th[@scope='col'][normalize-space()='Car Lots']")
    public WebElement carLotsText;
    @FindBy(xpath = "//div[@role='dialog']//div//div//div//th[@scope='col'][normalize-space()='Car Lots']")
    public WebElement carLotsText2;
    /* STORAGE LOTS TEXT */
    @FindBy(xpath = "//div[@role='dialog']//th[@scope='col'][normalize-space()='Storage Lots']")
    public WebElement storageLotsText;
    @FindBy(xpath = "//div[@role='dialog']//div//div//div//th[@scope='col'][normalize-space()='Storage Lots']")
    public WebElement storageLotsText2;
    /* LEVEL TEXT */
    @FindBy(xpath = "//div[@role='dialog']//th[@scope='col'][normalize-space()='Level']")
    public WebElement levelText;
    @FindBy(xpath = "//div[@role='dialog']//div//div//div//th[@scope='col'][normalize-space()='Level']")
    public WebElement levelText2;
    /* ASPECT TEXT */
    @FindBy(xpath = "//div[@role='dialog']//th[@scope='col'][normalize-space()='Aspect']")
    public WebElement aspectText;
    @FindBy(xpath = "//div[@role='dialog']//div//div//div//th[@scope='col'][normalize-space()='Aspect']")
    public WebElement aspectText2;
    /* TOTAL ARIA */
    @FindBy(xpath = "(//th[@scope='col'][normalize-space()='Total Area'])[8]")
    public WebElement totalAreaText;
    @FindBy(xpath = "//div[@role='dialog']//div//div//div//th[@scope='col'][normalize-space()='Total Area']")
    public WebElement totalAreaText2;
    /* STATUS TEXT */
    @FindBy(xpath = "//div[@role='dialog']//th[@scope='col'][normalize-space()='Status']")
    public WebElement statusText;
    @FindBy(xpath = "//div[@role='dialog']//div//div//div//th[@scope='col'][normalize-space()='Status']")
    public WebElement statusText2;
    /* SOLD BY TEXT */
    @FindBy(xpath = "(//th[@scope='col'][normalize-space()='Sold By'])[2]")
    public WebElement soldByText;
    /* RESERVED BY TEXT */
    @FindBy(xpath = "//div[@role='dialog']//div//div//div//th[@scope='col'][normalize-space()='Reserved By']")
    public WebElement reservedBy;

    public RealEstateSoldByReservedByPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
