Feature: Login

  Background: Login
    Given Click Sing In Button
    When Sign In Page is loaded
    And Sign in with credentials
      | Email         | Password   |
      | test@test.org | test_pass! |
    Then Verify current user is "Igor Golachev"

  @Smoke
  Scenario: Buy two products from Dresses department
    When Select Dresses page
    Then Dresses Page is loaded
    When Add the following dresses to the basket
      | Product              | Price  |
      | Printed Dress        | $26.00 |
      | Printed Summer Dress | $30.50 |
