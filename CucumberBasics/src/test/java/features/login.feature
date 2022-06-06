
Feature: Login Test
  I want to use this template for my feature file

  
  Scenario: Succesfull login with valid username and password
    Given launch browser
    When user opens url
    And enter valid username and password
    And click on login
    Then valid page title
    When click on logout
    And close browser

