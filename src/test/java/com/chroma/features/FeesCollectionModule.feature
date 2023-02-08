Feature: Fees Collection Module Test Scenario
Description: Testing Fees Collection Module

@CTSMSRegression @Menalka @DG2-5
Scenario: Fees Collection Module
Given a user is on the login page "https://chroma.mexil.it/site/login"
And  a user logs in with valid credentials username "general@teacher.com" and password "123456"
And navigates to Fees Collection Module
Then following submodule displayed "Collect Fees", "Search Fees Payment", "Search Due Fees", "Fees Master", "Fees Group", "Fees Type", "Fees Discount", "Fees Carry Forward","Fees Reminder"
