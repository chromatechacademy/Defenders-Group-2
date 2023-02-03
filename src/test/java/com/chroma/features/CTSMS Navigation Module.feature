@Navigation Modules
Feature: Test scenarios 
@Natalya
  Scenario: Navigation modules on portal
  Given a user is on the login page "https://mexil.it/chroma_tech_academy/dev/site/login"
  When user logs in with valid credentials username "general@teacher.com" and password "123456"
  Then the following modules should displayed "Student Information", "Fees Collection", "Income", "Expenses", "Academics", "Human Resource", "Homework", "Reports"
   