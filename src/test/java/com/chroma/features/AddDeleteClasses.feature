Feature: Add And Delete Classes test Scenario

@CTSMSRegression @Umesha @DG2-18
Scenario: As a Chroma Tech Academy faculty member, I want to be able to add and delete classes
    Given Chroma Tech Academy teacher/admin is on a login page "https://chroma.mexil.it/site/login"
    When Chroma Tech Academy teacher/admin logs in with valid credentials username "general@teacher.com" and password "123456"
    Then Chroma Tech Academy teacher/admin is succesfully loged in on CTSMS web page "https://chroma.mexil.it/admin/admin/dashboard"
    Then Acadamic Module displayed
    And I should able to click Class sub module
    And I should able to add Class name "Cyber Security1"
    And I shoud able to select section Field
    And I should able to save
    Then I should able to Search Class that alredy saved "Cyber Security1"
    Then I should able to delete Class
    




