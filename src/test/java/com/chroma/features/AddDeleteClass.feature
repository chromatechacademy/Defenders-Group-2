Feature: Add and Delete Class Test Scenario

  Scenario: Add And delete Class
Given Chroma Tech Academy teacher/admin is on a login page "https://chroma.mexil.it/site/login"
When Chroma Tech Academy teacher/admin logs in with valid credentials username "general@teacher.com" and password "123456"
Then Chroma Tech Academy teacher/admin is succesfully loged in on CTSMS web page "https://chroma.mexil.it/admin/admin/dashboard"