Feature: as a Chroma Tech Academy teacher/admin you will be able to see Two classes, SDET and Cyber Security should be displayed with sections

  @CTSMSRegression @IToropov @DG2-11
  Scenario: As a Chroma Tech Academy teacher/admin, I should be able to login with valid credentials
    Given Chroma Tech Academy teacher/admin is on a login page "https://chroma.mexil.it/site/login"
    When Chroma Tech Academy teacher/admin logs in with valid credentials username "general@teacher.com" and password "123456"
    Then Chroma Tech Academy teacher/admin is succesfully loged in on CTSMS web page "https://chroma.mexil.it/admin/admin/dashboard"
    And navigates to Academics module
    And navigates to Class Submodule
    And verifies that class "SDET" presents in Class List
    Then the following sections should be displayed "Database Testing", "Testing Fundamentals","SDLC Methodologies","Selenium Test Automation","Cucumber Fundamentals","API Testing","Git/GitHub","Java 11 for Cool People","Mobile Test Automation","Accessibility Testing"
    When verifies that second class "Cyber Security" presents in Class List
    Then the following sections should be displayed with second class "Penetration Testing/Ethical Hacking","Networking Fundamentals","Linux Fundamentals","CIA Triad"
