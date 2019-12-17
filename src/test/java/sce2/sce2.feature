
Feature: Title of your feature
  I want to use this template for my feature file

 
  


  Scenario Outline: Title of your scenario outline
    Given User navigates to URL
    And click signin
    And user enters "<name>" and "<password>" 
    And click login
    Then welcome to the page

    Examples: 
    |name            |password|
      | lalitha     |Password123 |
     
   
