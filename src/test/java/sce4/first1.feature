Feature: checking payment presence without adding product
 
Scenario: Checking product
 
Given Entering username
 
And Enter password
 
And Signin
 
When Search headphone 
 
And if the cart is not shown in page
 
Then the test is passed
