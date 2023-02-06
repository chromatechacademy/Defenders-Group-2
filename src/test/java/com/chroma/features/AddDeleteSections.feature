Feature: Add and delete sections via the Academics module

  @Smoke
  Scenario Outline: As a Chroma Tech faculty member, I want to be able to add and delete sections via the Academics module.
    Given Chroma Tech faculty member is on a login page "https://chroma.mexil.it/site/login"
    When Chroma Tech faculty member logs in with valid credentials username "general@teacher.com" and password "123456"
    And navigates to Academics module
    And navigates to Sections Submodule
    And enters Section Name "<SECTION NAME>"
    And clicks Save button
    Then Chroma Tech faculty member be able to see confirmation message displays "Record Saved Successfully"
    Then Chroma Tech faculty member selects section name "<SECTION NAME>" in Section List and delete it

    Examples: 
      | SECTION NAME |
      | Andrew       |
      | Paul         |
      | Charlotte    |
      | Aleksandra   |
