Feature:Homework Module Test Scenario
Description: Testing homework Module

@CTSMSRegression @Menalka @DG2-10
Scenario: When Clicking on homework module, Add Homework submodule should be displayed.

Given a user is on the login page "https://chroma.mexil.it/site/login"
Given a user logs in to the  website with valid credentials username"general@teacher.com" and password "123456"
Given user clicks on Homework section 
Then following submodule displayed "Add Homework"