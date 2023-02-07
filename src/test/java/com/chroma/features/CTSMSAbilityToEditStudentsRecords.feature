Feature: Ability to edit student records

  @CTSMSRegression @IToropov @DG2-14
  Scenario: As a Chroma Tech faculty user, I should be able to edit student records by searching student detail
    Given a user is on the login page "https://chroma.mexil.it/site/login"
    When user logs in with valid credentials username "general@teacher.com" and password "123456"
    And navigates to Student Information Module
    And navigates to Student Admition Submodule
    Then user is directed to Student Admission Page with the text "Student Admission"
    And enters Student unique Admission Number "707707"
    And selects Class "SDET" and Section "Database Testing"
    And enters Students first "Elijah" and last name "Fast"
    And selects gender "Male"
    And enters Date of Birth "01/01/2000"
    And enters Parent Guardian Details enters mothers name "ChromaMom"
    And for If Gurdian Is clicks on Mother radio button
    And enters Guardian Phone Number "3474047777"
    And clicks on the Save button
    When navigates to Student Details Submodule
    And enters unique Admission Number "707707" to Search By Keyword text box and clicks Search
    Then clicks Edit Button that assighned to current unique Admission Number "707707"
    And faculty user be able to edit first "Ilya" and last name "TestTest"
    And faculty user be able to edit Date of Birth "01/20/1990"
    And faculty user be able to edit Parent Guardian Details enters mothers name "BestMom"
    And faculty user be able to edit Guardian Phone Number "3472817777"
    Then clicks on the Save button
    Then faculty user is successfully update Student Record - "Record Update Successfully" message is displayed
