Feature: Real Estate Validate Dashboard Texts and Tabs Test Scenario
Description: As an admin user, I want to be able to validate the following elements and their text display on the dashboard

@RealEstateRegression @Samuel @DG2-42 @RealEstateSmoke
Scenario: Real Estate Dashboard Texts and Tabs
Given a real estate admin is on the login page "https://chroma-tech-academy.mexil.it/chroma_real_estate/project_files/admin/login.php"
And admin logs in with valid credentials email "admin@mexil.it" and password "123456"
Then the admin sholud see the following elements "Dashboard", "Hello, Admin", "Overview", "Agents Graph", "Properties Overview", "Properties" and following tabs "Agents", "Dashboard", "Projects"