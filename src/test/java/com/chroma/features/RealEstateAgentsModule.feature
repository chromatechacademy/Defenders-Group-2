Feature: Real Estate Validate Agents Module Text
Description: Validate Agents Module Text

@RealEstateRegression @Samuel @DG2-44 @RealEstateSmoke
Scenario: Agents Module Text 
Given a real estate admin is on the login page "https://chroma-tech-academy.mexil.it/chroma_real_estate/project_files/admin/login.php"
And admin logs in with valid credentials email "admin@mexil.it" and password "123456"
And admin navigates to the "Agents" page
Then admin should see the following module and text "Members List", "Active", "Inactive", "All Agents", "Add Now", "Name", "Mail", "Contact Number", "Actions"