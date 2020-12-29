Feature: Login

  @Smoke
  Scenario: Create an account
    Given Click Sing In Button
    Then Sign In Page is loaded
    When Sign in with credentials
      | Email         | Password   |
      | test@test.org | test_pass! |

  @Smoke
  Scenario: Create an account and login
    Given Click Sing In Button
    Then Sign In Page is loaded
    When Create a new account with random email
    Then Create Account Page is loaded
    And Fill out your personal information with values
      | Title | First name | Last name | Date of Birth | Newsletter | Special Offer |
      | Mr    | Igor       | Golachev  | 31-10-1984    | True       | True          |
    And Fill out your address with values
      | First name | Last name | Company     | Address    | Address (Line 2) | City   | State         | Zip   |
      | Igor       | Golachev  | SomeCompany | SomeStreet | SomeAddress      | Boston | Massachussets | 02760 |
    And Fill out your address with values
      | Country       | Additional information | Home phone | Mobile phone | Address Alias |
      | United States | SomeInfo               | 12356789   | 12345678909  | SomeAlias     |
