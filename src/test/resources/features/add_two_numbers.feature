Feature: Add two numbers on donline service
  As a user, I want to add two numbers

  Scenario: Add two numbers
    When you add two numbers

    | 2 | 4 |
    Then I should see the response of the service is 200