Feature: Student Information Module test scenario

@Progression 
Scenario:When clicking on Student Information module, the Student Details, Student Admission , Disabled Students ,Bulk Delete ,Student Categories, Student House ,Disable Reason should be displayed

Given a user is on the login page "https://chroma.mexil.it/site/login"
When Chroma Tech Academy teacher/admin logs in with valid credentials login "general@teacher.com" password "123456"
When user clicks on Student Information section 
Then following submodule displayed "Student Details", "Student Admission" ,"Disabled Students" ,"Bulk Delete","Student Categories", "Student House" ,"Disable Reason"


