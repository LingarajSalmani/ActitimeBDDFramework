
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
      | https://www.amazon.in/ |

   @Test
   Scenario: Verify home page search box in Amazon website
     Given User opens Amazon website
     When User is in home page
     Then Search box should be display

