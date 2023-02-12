package com.chroma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.CommonUtils;
import com.chroma.web.WebDriverUtils;

public class CTSMSStudentAdmissionPage {
  /* Student Admission Submodule */
    @FindBy(xpath = "//a[normalize-space()='Student Admission']")
    public WebElement studentAdmissionSubmodule;
    /* Student Admission Header */
    @FindBy(xpath = "//h4[normalize-space()='Student Admission']")
    public WebElement studentAdmissionHeader;
    /* Admission Number */
    @FindBy(xpath = "//input[@id='admission_no']")
    public WebElement studentAdmissionNumberTextBox;
    /* Class DropDown */
    @FindBy(xpath = "//select[@id='class_id']")
    public WebElement classDropDown;
    /* Class DropDown 2 */
    @FindBy(xpath = "//select[@name='class_id']")
    public WebElement classDropDown2;
    /* Section DropDown 2 */
    @FindBy(xpath = "//select[@name='section_id']")
    public WebElement sectionDropDown2;
    /* Section DropDown */
    @FindBy(xpath = "//select[@id='section_id']")
    public WebElement sectionDropDown;
    /* First Name */
    @FindBy(xpath = "//input[@id='firstname']")
    public WebElement firstNameTextBox;
    /* Last Name */
    @FindBy(xpath = "//input[@id='lastname']")
    public WebElement lastNameTextBox;
    /* Gender  */
    @FindBy(xpath = "//select[@name='gender']")
    public WebElement genderDropDown;
    /* DOB Calendar */
    @FindBy(xpath = "//input[@id='dob']")
    public WebElement dobCalendar;
    /* Save */
    @FindBy(xpath = "//button[@type='submit'][normalize-space()='Save']")
    public WebElement saveButton;
    /* Mother Name */
    @FindBy(xpath = "//input[@id='mother_name']")
    public WebElement mothersNameTextBox;
    /* Mother Radio Button */
    @FindBy(xpath = "//label[normalize-space()='Mother']")
    public WebElement motherRadioButton;
    /* Guardian Phone Number */
    @FindBy(xpath = "//input[@id='guardian_phone']")
    public WebElement guardianPhoneNumberTextBox;
    /* Succesfully Saved Message */
    @FindBy(xpath = "//div[normalize-space()='Record Saved Successfully']")
    public WebElement succesfulySavedMessage;
    /* Unique Admission Number Message */
    @FindBy(xpath = "//p[contains(text(),'The Admission No field must contain a unique value')]")
    public WebElement admissionNumberMustBeUniqueMessage;
    /* Bulk Delete  */
    @FindBy(xpath = "//a[normalize-space()='Bulk Delete']")
    public WebElement bulkDeleteModule;
    /* Search Button Bulk Delete */
    @FindBy(xpath = "//button[normalize-space()='Search']")
    public WebElement serchButtonBD;
    /* Class Name DropDown */
    @FindBy(xpath = "//select[@name='class_id']")
    public WebElement classNameDropDown;
    /* Section Name DropDown */
    @FindBy(xpath = "//select[@name='section_id']")
    public WebElement sectionNameDropDown;
    /* Delete Button */
    @FindBy(xpath = "//button[normalize-space()='Delete']")
    public WebElement deleteButton;

    public static WebElement studentRecordLocator(String studentRecord){
      return  WebDriverUtils.driver.findElement(By.xpath("//a[contains(text(),'" + studentRecord + "')]//parent::td//parent::tr/td/input"));
    }

    public CTSMSStudentAdmissionPage() {
        PageFactory.initElements(CommonUtils.driver, this);
    }
}
