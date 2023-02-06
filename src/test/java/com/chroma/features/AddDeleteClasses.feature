Feature: Add And Delete Classes test Scenario

@Smoke
Scenario: As a Chroma Tech Academy teacher/admin, I should be able to login with valid credentials
    Given Chroma Tech Academy teacher/admin is on a login page "https://chroma.mexil.it/site/login"
    When Chroma Tech Academy faculty member logs with valid credentials
    Then Chroma Tech Academy teacher/admin is succesfully loged in on CTSMS web page "https://chroma.mexil.it/admin/admin/dashboard"
    Then Acadamic Module displayed
    And I should able to click Class sub module
    And I should able to add Class name
    And I shoud able to select section Field
    And I should able to save
    Then I should able to Search Class that alredy saved
    Then I should able to delete Class
    




