Feature: Student Admission

    @CTSMSProgression @Natalya @DG2-12

    Scenario Outline: Student Admission
        Given a user is on the login page "<URL>"
        When user logs in with valid credentials username "<USERNAME>" and password "<PASSWORD>"
        And navigates to Student Information Module
        And navigates to Student Admition Submodule
        Then user is directed to Student Admission Page with the text "Student Admission"
        And enters Student unique Admission Number "<ADMISSION NUMBER>"
        And selects Class "<CLASS>" and Section "<SECTION>"
        And enters Students first "<FIRST NAME>" and last name "<LAST NAME>"
        And selects gender "<GENDER>"
        And enters Date of Birth "<DOB>"
        And enters Parent Guardian Details enters mothers name "<MOTHERS NAME>"
        And for If Gurdian Is clicks on Mother radio button
        And enters Guardian Phone Number "<PHONE NUMBER>"
        And clicks on the Save button
        Then student is succesfuly saved and confirmation message is displayed "Record Saved Successfully"

        Examples:

            | URL                                | USERNAME            | PASSWORD | ADMISSION NUMBER | CLASS | SECTION              | FIRST NAME | LAST NAME | GENDER | DOB        | MOTHERS NAME | GUARDIAN PHONE NUMBER |
            | https://chroma.mexil.it/site/login | general@teacher.com | 123456   | 879345           | SDET  | Testing Fundamentals | Nata       | TECH      | Female | 04/01/1987 | CHROMA MOM   | 7036875816            |