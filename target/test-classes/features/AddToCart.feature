#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios 
#<> (placeholder)
#""
## (Comments)

#Sample Feature Definition Template
@addToCart
Feature: Adding Garmin Watches to Add To Cart in Newegg Project
  I want to use this template to validate Forgot Password flow

  @addToCart
  Scenario: Adding Garmin Watches to Add To Card
    Given Launch Browser and Navigate to Application URL
    When Search a Product
    Then Tap on Search
    When Search With a Particular Product
    Then Tap on Go
    When Select item and click on Add To Cart and Validate the item in ADD TO CART