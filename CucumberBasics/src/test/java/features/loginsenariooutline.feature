Feature: login with senariooutline
  I want to use this template for my feature file


  Scenario Outline: login with multiple data
    Given user is on login page in firefox browser 
    When enter username as "<username>"
    And enter password as "<password>"
    And click signin btn
    
    Examples:
    | username | password |
    | admin@yourstore.com | admin |
    | admin@yourstore.com | admi |
    | admin@yourstre.com | admin |
    | admin@yourstoe.com | amin |

  
