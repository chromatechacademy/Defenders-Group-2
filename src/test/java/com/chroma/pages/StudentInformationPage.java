package com.chroma.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.chroma.web.WebDriverUtils;

/*STUDENT INFORMATION MODULE */
public class StudentInformationPage {
    @FindBy(xpath = "//span[contains(text(),'Student Information')]")
    public WebElement StudentInformationModule;

    /* STUDENT DETAILS SUBMODULE */
    @FindBy(xpath = "(//a[contains(text(),'Student Details')])[2]")
    public WebElement studentDetailsSubModule;

    /* STUDENT ADMISSION SUBMODULE */
    @FindBy(xpath = "//a[contains(text(),'Student Admission')]")
    public WebElement studentAdmissionSubModule;

    /* DISABLED STUDENT SUBMODULE */
    @FindBy(xpath = "//a[contains(text(),'Disabled Students')]")
    public WebElement disabledStudentsSubModule;

    /* BULK DELETE SUBMODULE */
    @FindBy(xpath = "//a[contains(text(),'Bulk Delete')]")
    public WebElement bulkDeleteSubModule;

    /* STUDENT CATEGORIES SUBMODULE */
    @FindBy(xpath = "//a[contains(text(),'Student Categories')]")
    public WebElement studentCategoriesSubModule;

    /* STUDENT HOUSE SUBMODULE */
    @FindBy(xpath = "//a[contains(text(),'Student House')]")
    public WebElement studentHouseSubModule;

    /* DISABLED REASON SUBMODULE */
    @FindBy(xpath = "//a[contains(text(),'Disable Reason')]")
    public WebElement disableReasonSubModule;

    public StudentInformationPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

}
