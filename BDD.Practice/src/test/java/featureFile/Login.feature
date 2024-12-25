#Author: Jeeva Ganesh 

Feature: Login to swag labs application


  Scenario: Login To Applicationwith valid credentials
    Given I want to Launch the browser
    And Load the URL
    When Login page is displayed enter the credentials
    And Click on login button
    Then Validate for home page
    

 