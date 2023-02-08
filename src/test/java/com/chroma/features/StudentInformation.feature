Feature: Student Information Module test scenario
Description: Testing Student Information Module

@CTSMSRegression @Menalka @DG2-4
Scenario:When clicking on Student Information module, the Student Details, Student Admission , Disabled Students ,Bulk Delete ,Student Categories, Student House ,Disable Reason should be displayed
Given a user is on the login page "https://chroma.mexil.it/site/login"
Given a user logs in to the CTSMS website with valid credentials username"general@teacher.com" and password "123456"
Given user clicks on Student Information section 
Then following submodule displayed "Student Details", "Student Admission" ,"Disabled Students" ,"Bulk Delete","Student Categories", "Student House" ,"Disable Reason"



