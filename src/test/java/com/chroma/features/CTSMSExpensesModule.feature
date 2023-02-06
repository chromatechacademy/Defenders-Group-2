Feature: CTSMS Expenses Module 
Description: CTSMS Expenses Module Test

@CTSMSProgression
Scenario: CTSMS Expenses Module 
Given a user is on the login page "https://chroma.mexil.it/site/login"
And user logs in with valid credentials username "general@teacher.com" and password "123456"
And navigates to Expenses Module
Then user should be able to see the following sub module "Add Expense", "Search Expense", "Expense Head"