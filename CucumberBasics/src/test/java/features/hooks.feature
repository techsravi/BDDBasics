Feature: Hooks
  I want to use this template for my feature file

  @Smoke @Regression
  Scenario: Hooks Scenario
    Given Open chrome browser
    Then Close Browser
    
   @Smoke
  Scenario: Hooks Scenario 1
    Given Open chrome browser
    Then Close Browser
    
    @Sanity
  Scenario: Hooks Scenario 1
    Given Open chrome browser
    Then Close Browser
    
     @Regression
  Scenario: Hooks Scenario 1
    Given Open chrome browser
    Then Close Browser
    
    @Smoke
  Scenario: Hooks Scenario 1
    Given Open chrome browser
    Then Close Browser

