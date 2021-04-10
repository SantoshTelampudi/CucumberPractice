Feature: To test the components in Login Page

@firstfeaturefile
  Scenario Outline: To check whether user is able to view the login, contactu, followus button and able to enter text in  SearchBar in main page
    Given User enters the URL
    When user lands in the Home Page
    Then Veriify LoginIn button
    And  Verify contactUs button
    And Verify followus button
    And Verify user is able to enter "<text>" in SearchBar
    
    Examples:
    |text|
    |Hai|
    
