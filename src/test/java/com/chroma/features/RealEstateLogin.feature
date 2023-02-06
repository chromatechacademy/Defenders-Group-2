Feature: Real Estate - Login with Valid Credentials

    @Regression @Natalya @DG2-41
    Scenario: Login with Valid Credentials
        Given a real estate admin is on the login page "https://chroma-tech-academy.mexil.it/chroma_real_estate/project_files/admin/login.php"
        And admin logs in with valid credentials email "admin@mexil.it" and password "123456"
        Then admin is succesfully loged in on Real Estate web page "https://chroma-tech-academy.mexil.it/chroma_real_estate/project_files/admin/index.php"
        And admin logs out the admin site 
        Given admin is on the agent login page "https://chroma-tech-academy.mexil.it/chroma_real_estate/project_files/login.php"
        When admin logs in with valid credentials email "nayalya@kray.com" and password "123456"
        Then admin is seccesfully loged in on Agent Real Estate web page "https://chroma-tech-academy.mexil.it/chroma_real_estate/project_files/index.php"
        And admin logs out the Agent site