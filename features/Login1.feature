
Feature: Login feature

@smoke, @regression
  Scenario: Verify the login functionality
  
    Given User should be on  login page
    When user enters Valid email ID "Testing@gmail.com"
    And user enters Valid password "P234222"
    And clicks submit

    
    