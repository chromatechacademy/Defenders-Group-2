Feature: Validate dashBoard Graph Text
Discription: Testing DashBoard Graph Text

  @RealEstateRegression @Menalka @DG2-43
  Scenario: As an admin user , when I navigate to the dashboard and click Agents Graph, the graph should
    be displayed with header text Reserved by Agents.and clicks Overview, the graph should be displayed with the header text Properties overview.
    Given a real estate admin is on the login page "https://chroma-tech-academy.mexil.it/chroma_real_estate/project_files/admin/login.php"
    And admin logs in with valid credentials email "admin@mexil.it" and password "123456"
    And admin is succesfully loged in on Real Estate web page "https://chroma-tech-academy.mexil.it/chroma_real_estate/project_files/admin/index.php"
    Then admin navigates to "dashboard"
    And Clicks the text "Agents Graph"
    And the graph should be displayed with header text "Reserved by Agents"
    And clicks on the text Overview
    Then the graph should be displayed with a header text "Properties Overview"
