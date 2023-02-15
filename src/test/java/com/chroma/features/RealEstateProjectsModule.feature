Feature: Real Estate Validate Projects Module Text
Description: Validate Projects Module Text 

@RealEstateRegression @Samuel @DG2-48 @RealEstateSmoke
Scenario: Validate Projects Module Text 
Given a real estate admin is on the login page "https://chroma-tech-academy.mexil.it/chroma_real_estate/project_files/admin/login.php"
And admin logs in with valid credentials email "admin@mexil.it" and password "123456"
And admin navigates to "Projects" page
Then admin should see the following text module "Add New Project", "Projects", "Active", "Archived"