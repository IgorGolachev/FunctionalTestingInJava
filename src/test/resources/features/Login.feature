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