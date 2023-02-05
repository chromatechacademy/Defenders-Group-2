Feature: Income Module Test Scenario

@Progression
Scenario: Income Module 
Given a user is on the login page "https://chroma.mexil.it/site/login"
When user logs in with valid credentials username 
When user clicks on Income Module in the hamburger menu
Then then user see "Add Income" and "Search Income" and "Income Head"

