Feature: To test the login

@firstfeaturefile
  Scenario Outline: To check whether user is able to login with valid credentials  http://automationpractice.com/index.php
    Given User is in homepage
    And Clicked on Signin button
    When user is in Signin Page
    Then Verify whether user is able to enter 
    And Verify user is able to click on SignIn button
