Feature: As an admin user, I am able to add an agent with a unique parametrs ,verify the agent and then delete this agent and verify that agent is delete

  @RealEstateRegression @IToropov @DG2-46
  Scenario: Delete an Agent
    Given a real estate admin is on the login page "https://chroma-tech-academy.mexil.it/chroma_real_estate/project_files/admin/login.php"
    And admin logs in with valid credentials email "admin@mexil.it" and password "123456"
    And navigates to Agents class
    And click Add Now button
    Then admin user is able to create a new agent by adding first name "Elijah", last name "Fast", email "fast@gmail.com", contact number "3474047777", password "123456"
    Then admin user is able to verify that the agent is listed as active with the exact first name "Elijah",last name "Fast", mail (email) "fast@gmail.com", and contact number "3474047777"
    And navigates to Agents class
    And navigates to Active Members list and delete agent from active Members list with current email "fast@gmail.com"
    Then navigates to Inactive Members list to delete user permanently with current email "fast@gmail.com" and verify that with message "Agent has been deleted permanently!"
