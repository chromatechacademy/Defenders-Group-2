package com.chroma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.CommonUtils;
import com.chroma.web.WebDriverUtils;

public class CTSMSStudentAdmissionPage {

    @FindBy(xpath = "//a[normalize-space()='Student Admission']")
    public WebElement studentAdmissionSubmodule;

    @FindBy(xpath = "//h4[normalize-space()='Student Admission']")
    public WebElement studentAdmissionHeader;

    @FindBy(xpath = "//input[@id='admission_no']")
    public WebElement studentAdmissionNumberTextBox;

    @FindBy(xpath = "//select[@id='class_id']")
    public WebElement classDropDown;

    @FindBy(xpath = "//select[@name='class_id']")
    public WebElement classDropDown2;

    @FindBy(xpath = "//select[@name='section_id']")
    public WebElement sectionDropDown2;

    @FindBy(xpath = "//select[@id='section_id']")
    public WebElement sectionDropDown;

    @FindBy(xpath = "//input[@id='firstname']")
    public WebElement firstNameTextBox;

    @FindBy(xpath = "//input[@id='lastname']")
    public WebElement lastNameTextBox;

    @FindBy(xpath = "//select[@name='gender']")
    public WebElement genderDropDown;

    @FindBy(xpath = "//input[@id='dob']")
    public WebElement dobCalendar;

    @FindBy(xpath = "//button[@type='submit'][normalize-space()='Save']")
    public WebElement saveButton;

    @FindBy(xpath = "//input[@id='mother_name']")
    public WebElement mothersNameTextBox;

    @FindBy(xpath = "//label[normalize-space()='Mother']")
    public WebElement motherRadioButton;

    @FindBy(xpath = "//input[@id='guardian_phone']")
    public WebElement guardianPhoneNumberTextBox;

    @FindBy(xpath = "//div[normalize-space()='Record Saved Successfully']")
    public WebElement succesfulySavedMessage;

    @FindBy(xpath = "//p[contains(text(),'The Admission No field must contain a unique value')]")
    public WebElement admissionNumberMustBeUniqueMessage;

    @FindBy(xpath = "//a[normalize-space()='Bulk Delete']")
    public WebElement bulkDeleteModule;

    @FindBy(xpath = "//button[normalize-space()='Search']")
    public WebElement serchButtonBD;

    @FindBy(xpath = "//select[@name='class_id']")
    public WebElement classNameDropDown;

    @FindBy(xpath = "//select[@name='section_id']")
    public WebElement sectionNameDropDown;

    @FindBy(xpath = "//button[normalize-space()='Delete']")
    public WebElement deleteButton;

    public static WebElement studentRecordLocator(String studentRecord){
      return  WebDriverUtils.driver.findElement(By.xpath("//a[contains(text(),'" + studentRecord + "')]//parent::td//parent::tr/td/input"));
    }

    public CTSMSStudentAdmissionPage() {
        PageFactory.initElements(CommonUtils.driver, this);
    }
}
