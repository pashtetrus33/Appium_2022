Feature: FormsPage

  Scenario: Check forms page view

    Given User is on main page
    When User click forms button
    Then User should see screen as shown on screenshot
