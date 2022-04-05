Feature: MainPage

   Scenario: Check forms page input filed text

    Given User is on main page
    When User click forms button
    And User type "Hello world" in input field
    Then User should see the same text "Hello world"



