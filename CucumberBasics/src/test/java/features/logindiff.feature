Feature: Login user details
  I want to use this template for my feature file

  
  Scenario: Login with diffrent data 
    Given User is on login page
    When enter follwing details
    | admin@yourstore.com | admin |
    | admin@yourstore.com | admi |
    | admin@yourstre.com | admin |
    | admin@yourstoe.com | amin |
    When enter maps login details
    | username | passowrd |
    | admin@yourstore.com | admin |
    | admin@yourstore.com | admi |
    | admin@yourstre.com | admin |
    | admin@yourstoe.com | amin |
    When click on login btn
    Then Valid tilte as "Dashboard / nopCommerce administration"
    When Click on logout
    And Close Browser

 