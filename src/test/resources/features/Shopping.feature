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
    And Access basket and go to check out
    Then Verify CheckOut Summary Page is loaded
    And Verify Summary is correct for the following products
      | Product              | Price  |
      | Printed Dress        | $26.00 |
      | Printed Summer Dress | $30.50 |
    And Verify Totals of CheckOut Summary page
      | Total products | Total shipping | Total  | Tax   |
      | $56.50         | $2.00          | $58.50 | $0.00 |
    And Proceed to Address
    And Proceed to Shipment
    And Agree on Shipment Terms
    And Proceed to Payment
    And Pay by Credit Card
    And Confirm order
    Then Verify The Order Is Complete

  @Smoke
  Scenario: Buy two products from Dresses and Women department
    When Select Dresses page
    Then Dresses Page is loaded
    When Add the following dresses to the basket
      | Product              | Price  |
      | Printed Dress        | $26.00 |
    When Select Women page
    Then Women Page is loaded
    When Add the following women products to the basket
      | Product | Price  |
      | Blouse  | $27.00 |
    And Access basket and go to check out
    Then Verify CheckOut Summary Page is loaded
    And Verify Summary is correct for the following products
      | Product              | Price  |
      | Printed Dress        | $26.00 |
      | Blouse               | $27.00 |
    And Verify Totals of CheckOut Summary page
      | Total products | Total shipping | Total  | Tax   |
      | $53.00         | $2.00          | $55.00 | $0.00 |
    And Proceed to Address
    And Proceed to Shipment
    And Agree on Shipment Terms
    And Proceed to Payment
    And Pay by Credit Card
    And Confirm order
    Then Verify The Order Is Complete