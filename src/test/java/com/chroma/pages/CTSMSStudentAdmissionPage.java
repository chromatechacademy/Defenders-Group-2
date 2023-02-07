package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.CommonUtils;

public class CTSMSStudentAdmissionPage {

    @FindBy(xpath = "//a[normalize-space()='Student Admission']")
    public WebElement studentAdmissionSubmodule;

    @FindBy(xpath = "//h4[normalize-space()='Student Admission']")
    public WebElement studentAdmissionHeader;

    @FindBy(xpath = "//input[@id='admission_no']")
    public WebElement studentAdmissionNumberTextBox;

    @FindBy(xpath = "//select[@id='class_id']")
    public WebElement classDropDown;

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

    public CTSMSStudentAdmissionPage() {
        PageFactory.initElements(CommonUtils.driver, this);
    }
}
