package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class AcademyDashBoardPage {

    /* Human Resource Module */
    @FindBy(xpath = "//span[normalize-space()='Human Resource']")
    public WebElement humanResourceModule;

    /* Staff Directory Sub Module */
    @FindBy(xpath = "//ul[contains(@class,'treeview-menu menu-open')]//a[normalize-space()='Staff Directory']")
    public WebElement staffDirectorySubModule;

    /* Staff Attendance Sub Module */
    @FindBy(xpath = "//ul[@class='treeview-menu menu-open']//a[normalize-space()='Staff Attendance']")
    public WebElement staffAttendanceSubModule;

    /* Payroll Sub Module */
    @FindBy(xpath = "//a[normalize-space()='Payroll']")
    public WebElement payrollSubModule;

    /* Approve Leave Request Sub Module */
    @FindBy(xpath = "//a[normalize-space()='Approve Leave Request']")
    public WebElement approveLeaveRequestSubModule;

    /* Apply Leave Sub module */
    @FindBy(xpath = "//a[normalize-space()='Apply Leave']")
    public WebElement applyLeaveSubModule;

    /* Leave Type Sub Module */
    @FindBy(xpath = "//a[normalize-space()='Leave Type']")
    public WebElement leaveTypeSubModule;

    /* Teachers Rating Sub Module */
    @FindBy(xpath = "//a[normalize-space()='Teachers Rating']")
    public WebElement teachersRatingSubModule;

    /* Department Sub Module */
    @FindBy(xpath = "//a[normalize-space()='Department']")
    public WebElement departmentSubModule;

    /* Designation Sub Module */
    @FindBy(xpath = "//a[normalize-space()='Designation']")
    public WebElement designationSubModule;

    public AcademyDashBoardPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
