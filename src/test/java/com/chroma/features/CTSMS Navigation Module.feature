Feature: CTSMS Navigation Module

   @CTSMSRegression @Natalya @DG2-3
  Scenario: Navigation modules on portal
    Given Chroma Tech Academy teacher/admin is on a login page "https://chroma.mexil.it/site/login"
    When Chroma Tech Academy teacher/admin logs in with valid credentials username "general@teacher.com" and password "123456"
    Then Chroma Tech Academy teacher/admin is succesfully loged in on CTSMS web page "https://chroma.mexil.it/admin/admin/dashboard"
    Then the following modules should displayed "Student Information", "Fees Collection", "Income", "Expenses", "Academics", "Human Resource", "Homework", "Reports"