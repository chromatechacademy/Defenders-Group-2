Feature: Real Estate - Validate Sold By and Reserved By Modules

    @RealEstateProgression @Natalya @DG2-51
    Scenario: Validate Sold By and Reserved By Modules
        Given admin is on the agent login page "https://chroma-tech-academy.mexil.it/chroma_real_estate/project_files/login.php"
        When admin logs in with valid credentials email "natalya@kray.com" and password "123456"
        Then admin is seccesfully loged in on Agent Real Estate web page "https://chroma-tech-academy.mexil.it/chroma_real_estate/project_files/index.php"
        And agent scroll down to "Sold By Me" and clicks on it
         
        Then a pop-up displays with the text: "ID", "PROJECT", "PRICE", "BEDS", "BATHS", "CARS", "CAR LOTS", "STORAGE LOTS", "LEVEL", "ASPECT", "TOTAL ARIA", "STATUS", "SOLD BY"
        Then clicks on "Reserved By Me"
        And a pop-up displays with the text: ""ID", "PROJECT", "PRICE", "BEDS", "BATHS", "CARS", "CAR LOTS", "STORAGE LOTS", "LEVEL", "ASPECT", "TOTAL ARIA", "STATUS", "RESERVED BY"        