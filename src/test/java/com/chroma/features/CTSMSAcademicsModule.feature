Feature: CTSMS Academics Module 
Description:CTSMS Academics Sub Module Text Test

@CTSMSRegression @Samuel @DG2-8
Scenario: CTSMS Academics Sub Module Text
Given a user is on the login page "https://chroma.mexil.it/site/login"
And user logs in with valid credentials username "general@teacher.com" and password "123456"
And navigates to Academics module
Then user should be able to see the following sub module "Class Timetable", "Teachers Timetable", "Assign Class Teacher", "Promote Students", "Subject Group", "Subjects", "Class", "Sections"