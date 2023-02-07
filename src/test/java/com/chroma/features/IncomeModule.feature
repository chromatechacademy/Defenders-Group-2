Feature: Income Module Test Scenario

@CTSMSProgression @Umesha @DG2-6
Scenario: Income Module 
Given Chroma Tech Academy teacher/admin is on a login page "https://chroma.mexil.it/site/login"
When Chroma Tech Academy teacher/admin logs in with valid credentials username "general@teacher.com" and password "123456"
Then Chroma Tech Academy teacher/admin is succesfully loged in on CTSMS web page "https://chroma.mexil.it/admin/admin/dashboard"
When user clicks on Income Module in the hamburger menu
Then then user see "Add Income" and "Search Income" and "Income Head"

