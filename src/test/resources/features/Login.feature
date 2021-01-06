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
      | Mr   | FirstName | LastName |
      | True | Igor      | Golachev |
      #| Mr   | FirstName | LastName | DateOfBirth | Newsletter | SpecialOffer |
      #| True | Igor      | Golachev | 31-10-1984  | True       | True         |
    #And Fill out your address with values
     # | FirstName | LastName | Company     | Address    | AddressLine2 | City   | State         | Zip   |
      #| Igor      | Golachev | SomeCompany | SomeStreet | SomeAddress  | Boston | Massachussets | 02760 |
    #And Fill out your address with values
     # | Country       | AdditionalInformation | HomePhone | MobilePhone | AddressAlias |
      #| United States | SomeInfo              | 12356789  | 12345678909 | SomeAlias    |
