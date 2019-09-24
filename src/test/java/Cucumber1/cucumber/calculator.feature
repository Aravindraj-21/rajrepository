Feature: Test Calculator
  This file shows calculator functionality

 Scenario: Add two numbers
    Given I enter 23
    And I press add
    And I enter 23 in calc
    When I press equal in calc
    Then Answer 46 should be shown
