Feature: As an admin user, I am able to add 3 agent with a unique parametrs ,verify that 3 agents and then delete them

  @RealEstateProgression @IToropov @DG2-47
  Scenario: Create and Delete 3 Agents
    Given a real estate admin is on the login page "https://chroma-tech-academy.mexil.it/chroma_real_estate/project_files/admin/login.php"
    And admin logs in with valid credentials email "admin@mexil.it" and password "123456"
    And navigates to Agents class
    And click Add Now button
    Then admin user is able to create a new agent by adding first name "Ilya", last name "Test1", email "ilyatest1@gmail.com", contact number "1111111111", password "111111"
    And click Add Now button
    Then admin user is able to create a new agent by adding first name "Ilya", last name "Test2", email "ilyatest2@gmail.com", contact number "2222222222", password "222222"
    And click Add Now button
    Then admin user is able to create a new agent by adding first name "Ilya", last name "Test3", email "ilyatest3@gmail.com", contact number "3333333333", password "333333"
    Then admin user is able to verify that the agent is listed as active with the exact first name "Ilya",last name "Test1", mail (email) "ilyatest1@gmail.com", and contact number "1111111111"
    Then admin user is able to verify that the agent is listed as active with the exact first name "Ilya",last name "Test2", mail (email) "ilyatest2@gmail.com", and contact number "2222222222"
    Then admin user is able to verify that the agent is listed as active with the exact first name "Ilya",last name "Test3", mail (email) "ilyatest3@gmail.com", and contact number "3333333333"
    And navigates to Agents class
    And navigates to Active Members list and delete agent from active Members list with current email "ilyatest1@gmail.com"
    And navigates to Active Members list and delete agent from active Members list with current email "ilyatest2@gmail.com"
    And navigates to Active Members list and delete agent from active Members list with current email "ilyatest3@gmail.com"
    Then navigates to Inactive Members list to delete user permanently with current email "ilyatest1@gmail.com" and verify that with message "Agent has been deleted permanently!"
    Then navigates to Inactive Members list to delete user permanently with current email "ilyatest2@gmail.com" and verify that with message "Agent has been deleted permanently!"
    Then navigates to Inactive Members list to delete user permanently with current email "ilyatest3@gmail.com" and verify that with message "Agent has been deleted permanently!"
