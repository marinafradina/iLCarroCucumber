Feature: Search

  @yourcar
  Scenario: Verify City and Data
    Given Urer launches Chrome browser
    When User opens ilCarro HomePage
    And User clicks on City link
    And User enters valid data
    Then User clicks on Yalla button
    And User quites browser

