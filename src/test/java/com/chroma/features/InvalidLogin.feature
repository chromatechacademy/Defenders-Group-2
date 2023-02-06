Feature: Invalid Credentials Login Test Scenario
Description: Testing Invaild Credentials Login For Security Purposes

  @CTSMSRegression @Samuel @DG2-2
  Scenario Outline: Invalid Credentials Login
    Given a user is on the login page "https://chroma.mexil.it/site/login"
    When user logs in with invaild credentials username "<USERNAME>" and password "<PASSWORD>"
    Then user sees invalid message "Invalid Username or Password"

    Examples: 
      | USERNAME            | PASSWORD |
      | generel@teahcer.com |   123467 |
      | general@tehcer.com  |   123678 |
      | general@teahcer.com |   123457 |
