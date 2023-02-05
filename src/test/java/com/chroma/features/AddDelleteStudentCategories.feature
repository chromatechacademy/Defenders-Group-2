Feature: CTSMS  Ability to add and delete student categories

    @CTSMSProgression @Natalya @DG2-20
    Scenario Outline: Ability to add and delete student categories
        Given a user is on the login page "https://chroma.mexil.it/site/login"
        When user logs in with valid credentials username "general@teacher.com" and password "123456"
        And navigates to Student Information Module
        And user selects Student categories
        When user enters Category "<CATEGORY>"
        And user clicks on th Category Save button
        Then Category is succesfully saved and conformation message displays "Record Saved Successfully"
        And user clicks on the Category "<CATEGORY>" Delete button
        And Category is deleted

        Examples:
            | CATEGORY |
            | T        |
            | E        |
            | S        |
            | T        |
