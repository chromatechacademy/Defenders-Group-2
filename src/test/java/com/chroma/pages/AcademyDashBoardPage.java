package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class AcademyDashBoardPage {
    /* Human Resource Module */
    @FindBy(xpath = "//span[normalize-space()='Human Resource']")
    public WebElement humanResourceModule;

    /* Expenses Module */
    @FindBy(xpath = "//span[normalize-space()='Expenses']")
    public WebElement expensesModule;

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
    
    /* Add Expense Sub Module */
    @FindBy(xpath = "//ul[contains(@class,'treeview-menu menu-open')]//a[normalize-space()='Add Expense']")
    public WebElement addExpenseSubModule;

    /* Search Expense Sub Module */
    @FindBy(xpath = "//a[normalize-space()='Search Expense']")
    public WebElement searchExpenseSubModule;

    /* Expense Head Sub Module */
    @FindBy(xpath = "//a[normalize-space()='Expense Head']")
    public WebElement expenseHeadSubModule;

    /* Class Timetable Sub Module */
    @FindBy(xpath = "//a[@href='https://chroma.mexil.it/admin/timetable/classreport']")
    public WebElement classTimeTableSubModule;

    /* Teachers Timetable Sub Module */
    @FindBy(xpath = "//a[normalize-space()='Teachers Timetable']")
    public WebElement teachersTimetableSubModule;

    /* Assign Class Teacher Sub Module*/
    @FindBy(xpath = "//a[normalize-space()='Assign Class Teacher']")
    public WebElement assignClassTeacherSubModule;

    /* Promote Students Sub Module */
    @FindBy(xpath = "//a[normalize-space()='Promote Students']")
    public WebElement promoteStudentsSubModule;

    /* Subject Group Sub Module */
    @FindBy(xpath = "//a[normalize-space()='Subject Group']")
    public WebElement subjectGroupSubModule;

    /* Subjects Sub Module */
    @FindBy(xpath = "//a[normalize-space()='Subjects']")
    public WebElement subjectsSubModule;

    /* Class Sub Module */
    @FindBy(xpath = "//a[normalize-space()='Class']")
    public WebElement classSubModule;

    /*Sections Sub Module */
    @FindBy(xpath = "//a[normalize-space()='Sections']")
    public WebElement sectionsSubModule;

    public AcademyDashBoardPage(){
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
