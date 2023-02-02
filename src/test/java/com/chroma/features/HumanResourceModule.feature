Feature: Human Resource Module Test Scenario
Description: Testing Human Resource Module

@Progression @Samuel
Scenario: Human Resource Module 
Given a user is on the login page "https://chroma.mexil.it/site/login"
And user logs in with valid credentials username "general@teacher.com" and password "123456"
And navigates to Human Resource
Then the following sub modules should be displayed "Staff Directory", "Staff Attendance", "Payroll", "Approve Leave Request", "Apply Leave", "Leave Type", "Teachers Rating", "Department", "Designation"