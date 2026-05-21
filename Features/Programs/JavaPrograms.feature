
@Features
Feature: Java basic programs
  I want to use this template for my feature file

  #@Program
 # Scenario: Factorial of number
   # Given I want to write a step with precondition
   # And some other precondition
   # When I complete action
   # And some other action
    #And yet another action
   # Then I validate the outcomes
   # And check more outcomes

 @Regression
  Scenario Outline: Validate user is able to navigate to Actitime Application
    Given User enters Actitime Application url "<URL>" in browser
    Then Actitime Application should be open successfully

    Examples: 
      | URL  | 
      | http://localhost:8080/login.do;jsessionid=9eit3htaih2cs |     